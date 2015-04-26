package ru.synq.smev.services;

import com.rstyle.skmv.snils_validation.SnilsValidationPortType;
import com.rstyle.skmv.snils_validation.SnilsValidationService;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gosuslugi.smev.rev120315.*;

@RestController
@RequestMapping({"snils","SID0003450"})
public class SnilsController {
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;
//    @Autowired Provider

    @RequestMapping("test")
    @Autowired
    public SnilsValidationResponseType test(MessageType message) {
        HeaderType smevHeader = new HeaderType();
        SnilsValidationRequestType parameters = new SnilsValidationRequestType();
        parameters.setMessage(message);
        MessageDataType messageData = new MessageDataType();
        AppDataType appData = new AppDataType();
//        appData.
        messageData.setAppData(appData);
        parameters.setMessageData(messageData);
        return request(smevHeader, parameters);
    }

    protected SnilsValidationResponseType request(HeaderType smevHeader, SnilsValidationRequestType parameters) {
        SnilsValidationService service = new SnilsValidationService();
        SnilsValidationPortType port = service.getSnilsValidationPort();
        ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        return port.snilsValidationRequest(smevHeader, parameters);
    }
}
