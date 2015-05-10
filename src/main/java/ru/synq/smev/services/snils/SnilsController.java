package ru.synq.smev.services.snils;

import com.rstyle.skmv.snils_validation.SnilsValidationPortType;
import com.rstyle.skmv.snils_validation.SnilsValidationService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.gosuslugi.smev.rev120315.HeaderType;
import ru.gosuslugi.smev.rev120315.MessageType;
import ru.synq.smev.Response;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.validation.Valid;

@RestController
@RequestMapping({"snils","SID0003822"})
public class SnilsController {
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;
    @Inject @Qualifier("snilsMessage") Provider<MessageType> messageProvider;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET})
    public Response query(@Valid @RequestBody SnilsValidationData request) {
        SnilsBaseMessage baseMessage = new SnilsBaseMessage();
        baseMessage.setMessage(messageProvider.get());
        SnilsMessageData messageData = new SnilsMessageData();
        SnilsAppData appData = new SnilsAppData();
        appData.setRequest(request);
        messageData.setAppData(appData);
        baseMessage.setMessageData(messageData);

        SnilsValidationService service = new SnilsValidationService();
        final SnilsValidationPortType port = service.getSnilsValidationPort();

        final Client client = ClientProxy.getClient(port);
        client.getOutInterceptors().add(wss4JOutInterceptor);
        HTTPConduit http = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(0);
        httpClientPolicy.setReceiveTimeout(0);
        http.setClient(httpClientPolicy);

        final SnilsValidationResponse response = port.snilsValidationRequest(new HeaderType(), baseMessage);
        return Response.data(response.getMessageData().getAppData().getResult());
    }
}
