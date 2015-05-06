package ru.synq.smev.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"snils"})
public class SnilsController {
    /*@Autowired WSS4JOutInterceptor wss4JOutInterceptor;

    @RequestMapping("test")
    @Autowired
    public SnilsValidationResponseType test(MessageType message) {
        HeaderType smevHeader = new HeaderType();
        SnilsValidationRequestType parameters = new SnilsValidationRequestType();
        parameters.setMessage(message);
        MessageDataType messageData = new MessageDataType();
        AppDataType appData = new AppDataType();
        // SnilsValidationRequestType does not has request property
        messageData.setAppData(appData);
        parameters.setMessageData(messageData);
        return request(smevHeader, parameters);
    }

    protected SnilsValidationResponseType request(HeaderType smevHeader, SnilsValidationRequestType parameters) {
        SnilsValidationService service = new SnilsValidationService();
        SnilsValidationPortType port = service.getSnilsValidationPort();
        ClientProxy.getClient(port).getOutInterceptors().add(wss4JOutInterceptor);
        return port.snilsValidationRequest(smevHeader, parameters);
    }*/
}
