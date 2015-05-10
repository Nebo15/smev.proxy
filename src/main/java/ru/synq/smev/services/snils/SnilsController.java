package ru.synq.smev.services.snils;

import com.rstyle.skmv.snils_validation.SnilsValidationPortType;
import com.rstyle.skmv.snils_validation.SnilsValidationService;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.gosuslugi.smev.rev120315.HeaderType;
import ru.gosuslugi.smev.rev120315.MessageType;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.validation.Valid;

@RestController
@RequestMapping({"snils","SID0003822"})
public class SnilsController {
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;
    @Inject @Qualifier("snilsMessage") Provider<MessageType> messageProvider;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET})
    public SnilsValidationResponseType query(@Valid @RequestBody SnilsData request) {
        SnilsBaseMessage baseMessage = new SnilsBaseMessage();
        baseMessage.setMessage(messageProvider.get());
        MessageData messageData = new MessageData();
        AppData appData = new AppData();
        appData.setRequest(request);
        messageData.setAppData(appData);
        baseMessage.setMessageData(messageData);
        SnilsValidationService service = new SnilsValidationService();
        final SnilsValidationPortType port = service.getSnilsValidationPort();
        ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        return port.snilsValidationRequest(new HeaderType(), baseMessage);
/*
        return null;

        SnilsService service = new SnilsService();
        SnilsPort port = service.getPort();
        ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        return port.snilsValidationRequest(baseMessage);*/
    }
}
