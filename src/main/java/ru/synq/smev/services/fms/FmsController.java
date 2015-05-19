package ru.synq.smev.services.fms;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import ru.fms.sx.kernel.webservices.border.basetypes.*;
import ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3.IncomingRequestsServiceV243;
import ru.gosuslugi.smev.rev111111.*;
import ru.synq.smev.Environment;
import ru.synq.smev.Response;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("{env}/fms")
public class FmsController {
    @Value("${skip-cxf-init:false}") boolean skipCxfInitFlag;
    @Autowired @Qualifier("fmsTestConfig") WSS4JOutInterceptor testWss4JOutInterceptor;
    @Autowired @Qualifier("fmsProdConfig") WSS4JOutInterceptor prodWss4JOutInterceptor;
    @Inject @Qualifier("fmsMessage") Provider<MessageType> messageProvider;

    @RequestMapping
    public Response passport(@PathVariable Environment env,
                             @Valid @RequestBody User user,
                             @Valid @RequestBody SimplePassportParams params
    ) throws InvocationTargetException, IllegalAccessException {
        ServiceRequestMessageType appData = new ServiceRequestMessageType();
        appData.setUser(user);
        appData.setServiceCode("P001");
        appData.setVersionCode("001");
        setParams(appData.getParameters(), params);
        final ProcessTaskResponseMessage response = getPort(env).processTask(createServiceRequestMessage(appData));
        return Response.data(response.getMessageData().getAppData());
    }

    @RequestMapping("extended")
    public Response passportExtended(@PathVariable Environment env,
                                     @Valid @RequestBody User user,
                                     @Valid @RequestBody ExtendedPassportParams params
    ) throws InvocationTargetException, IllegalAccessException {
        ServiceRequestMessageType appData = new ServiceRequestMessageType();
        appData.setUser(user);
        appData.setServiceCode("P002");
        appData.setVersionCode("001");
        setParams(appData.getParameters(), params);
        final BookRequestResponseMessage response = getPort(env).bookRequest(createServiceRequestMessage(appData));
        return Response.data(response.getMessageData().getAppData());
    }

    @RequestMapping("extended/{taskId}")
    public Response passportExtended(@PathVariable Environment env,
                                     @PathVariable String taskId
    ) throws InvocationTargetException, IllegalAccessException {
        final GetResultMessage message = new GetResultMessage();
        message.setMessage(messageProvider.get());
        GetResultMessageData messageData = new GetResultMessageData();
        GetResultMessageType appData = new GetResultMessageType();
        appData.setTaskId(taskId);
        messageData.setAppData(appData);
        message.setMessageData(messageData);
        final GetResultResponseMessage response = getPort(env).getResult(message);
        final TaskResult result = response.getMessageData().getAppData().getTaskResult();

        return Response.data(result);
    }

    @RequestMapping("dictionary/{code}")
    public Response getDictionary(@PathVariable Environment env,
                                  @PathVariable String code,
                                  @Valid @RequestBody User user
    ) throws InvocationTargetException, IllegalAccessException {
        final GetDictionaryValuesMessage message = new GetDictionaryValuesMessage();
        message.setMessage(messageProvider.get());
        GetDictionaryValuesMessageData messageData = new GetDictionaryValuesMessageData();
        GetDictionaryValuesMessageType appData = new GetDictionaryValuesMessageType();
        appData.setDictionaryCode(code);
        appData.setUser(user);
        messageData.setAppData(appData);
        message.setMessageData(messageData);
        final GetDictionaryValuesResponseMessage response = getPort(env).getDictionaryValues(message);
        final List<DictionaryItem> items = response.getMessageData().getAppData().getDictionaryItem();
        if (items != null && !items.isEmpty())
            return Response.data(items);
        else
            return Response.data(response.getMessageData().getAppData());
    }

    @RequestMapping(value = "error_report/{taskId}", method = RequestMethod.POST)
    public Response getDictionary(@PathVariable Environment env,
                                  @PathVariable String taskId,
                                  @Valid @RequestBody User user,
                                  @Valid @RequestBody ErrorReport errorReport
    ) throws InvocationTargetException, IllegalAccessException {
        final SendErrorReportMessage message = new SendErrorReportMessage();
        message.setMessage(messageProvider.get());
        SendErrorReportMessageData messageData = new SendErrorReportMessageData();
        SendErrorReportMessageType appData = new SendErrorReportMessageType();
        appData.setTaskId(taskId);
        appData.setUser(user);
        appData.setErrorReport(errorReport.errorReport);
        messageData.setAppData(appData);
        message.setMessageData(messageData);
        final SendErrorReportResponseMessage response = getPort(env).sendErrorReport(message);
        return Response.data(response.getMessageData().getAppData());
    }

    private void setParams(List<TaskParameter> list, Object bean) throws InvocationTargetException, IllegalAccessException {
        for (Field field : bean.getClass().getFields()) {
            list.add(new TaskParameter(field.getName(), (String) field.get(bean)));
        }
    }

    public IncomingRequestsServiceV243 getPort(Environment env) {
        FmsService service = new FmsService();
        final IncomingRequestsServiceV243 port = service.getIncomingRequestsPort();
        if (!skipCxfInitFlag) {
            final Client client = ClientProxy.getClient(port);
            client.getOutInterceptors().add(env.isProd() ? prodWss4JOutInterceptor : testWss4JOutInterceptor);
//            client.getOutInterceptors().add(hdImageStoreSetterInterceptorProvider.get(env));
        }
        return port;
    }

    private ServiceRequestMessage createServiceRequestMessage(ServiceRequestMessageType appData) {
        ServiceRequestMessage baseMessage = new ServiceRequestMessage();
        baseMessage.setMessage(messageProvider.get());
        ServiceRequestMessageData messageData = new ServiceRequestMessageData();
        messageData.setAppData(appData);
        baseMessage.setMessageData(messageData);
        return baseMessage;
    }

    public static class ExtendedPassportParams {
        @NotNull @Size(max = 60)
        @JsonProperty("CITIZEN_LASTNAME")
        public String CITIZEN_LASTNAME;

        @NotNull @Size(max = 60)
        @JsonProperty("CITIZEN_FIRSTNAME")
        public String CITIZEN_FIRSTNAME;

        @Size(max = 60)
        @JsonProperty("CITIZEN_GIVENNAME")
        public String CITIZEN_GIVENNAME;

        @NotNull @Pattern(regexp = "^(\\d{2}\\.){2}\\d{4}$", message = "Дата в формате ДД.ММ.ГГГГ")
        @JsonProperty("CITIZEN_BIRTHDAY")
        public String CITIZEN_BIRTHDAY;

        @NotNull @Size(min = 4, max = 4)
        @JsonProperty("DOC_SERIE")
        public String DOC_SERIE;

        @NotNull @Size(min = 6, max = 6)
        @JsonProperty("DOC_NUMBER")
        public String DOC_NUMBER;

        @NotNull @Size(min = 6, max = 6)
        @JsonProperty("DOC_ISSUER")
        public String DOC_ISSUER;

        @NotNull @Pattern(regexp = "^(\\d{2}\\.){2}\\d{4}$", message = "Дата в формате ДД.ММ.ГГГГ")
        @JsonProperty("DOC_ISSUEDATE")
        public String DOC_ISSUEDATE;

        @JsonProperty("REGION_CODE")
        public String REGION_CODE;
    }

    public static class SimplePassportParams {
        @NotNull @Size(min = 4, max = 4)
        @JsonProperty("DOC_SERIE")
        public String DOC_SERIE;
        @NotNull @Size(min = 6, max = 6)
        @JsonProperty("DOC_NUMBER")
        public String DOC_NUMBER;
        @Pattern(regexp = "^(\\d{2}\\.){2}\\d{4}$", message = "Дата в формате ДД.ММ.ГГГГ")
        @JsonProperty("DOC_ISSUEDATE")
        public String DOC_ISSUEDATE;

        public SimplePassportParams() {}
    }

    private static class ErrorReport {
        @NotNull
        public String errorReport;
    }
}
