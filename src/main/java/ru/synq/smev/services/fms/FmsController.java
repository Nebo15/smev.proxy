package ru.synq.smev.services.fms;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fms.sx.kernel.webservices.border.basetypes.ProcessTaskResponseMessageType;
import ru.fms.sx.kernel.webservices.border.basetypes.ServiceRequestMessageType;
import ru.fms.sx.kernel.webservices.border.basetypes.TaskParameter;
import ru.fms.sx.kernel.webservices.border.basetypes.User;
import ru.fms.sx.kernel.webservices.incomingrequests.v2_4_3.IncomingRequestsServiceV243;
import ru.gosuslugi.smev.rev111111.MessageType;
import ru.gosuslugi.smev.rev111111.ServiceRequestMessage;
import ru.gosuslugi.smev.rev111111.ServiceRequestMessageData;
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
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;
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
        return process(appData, env);
    }

    private void setParams(List<TaskParameter> list, Object bean) throws InvocationTargetException, IllegalAccessException {
        for (Field field : bean.getClass().getFields()) {
            list.add(new TaskParameter(field.getName(), (String) field.get(bean)));
        }
    }

    public Response process(ServiceRequestMessageType appData, Environment env) {
        FmsService service = new FmsService();
        final IncomingRequestsServiceV243 port = service.getIncomingRequestsPort();
        if (!skipCxfInitFlag) {
            ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        }
        ServiceRequestMessage baseMessage = new ServiceRequestMessage();
        baseMessage.setMessage(messageProvider.get());
        ServiceRequestMessageData messageData = new ServiceRequestMessageData();
        messageData.setAppData(appData);
        baseMessage.setMessageData(messageData);
        final ProcessTaskResponseMessageType response = port.processTask(baseMessage).getMessageData().getAppData();
        return Response.data(response);
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

        public SimplePassportParams() {
        }

        /*public String getDOC_SERIE() {
            return DOC_SERIE;
        }

        public void setDOC_SERIE(String DOC_SERIE) {
            this.DOC_SERIE = DOC_SERIE;
        }

        public String getDOC_NUMBER() {
            return DOC_NUMBER;
        }

        public void setDOC_NUMBER(String DOC_NUMBER) {
            this.DOC_NUMBER = DOC_NUMBER;
        }

        public String getDOC_ISSUEDATE() {
            return DOC_ISSUEDATE;
        }

        public void setDOC_ISSUEDATE(String DOC_ISSUEDATE) {
            this.DOC_ISSUEDATE = DOC_ISSUEDATE;
        }*/
    }
}
