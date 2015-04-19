package ru.synq.smev.soap.services;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gosuslugi.smev.rev111111.*;
import ru.socit.pfr.service.ServicePFR;
import ru.socit.pfr.service.ServicePFRService;
import ru.socit.pfr.service.data.Properties;
import ru.socit.pfr.service.data.Property;
import ru.socit.pfr.service.data.Type;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

import static java.util.Arrays.asList;

@RestController
@RequestMapping({"prf", "SID0003422"})
public class PrfController {
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;

    @RequestMapping("test/accept")
    public BaseMessageType test() throws DatatypeConfigurationException {
        return serviceFactory().process(getTestRequestData());
    }

    @RequestMapping("test/error")
    public BaseMessageType error() throws DatatypeConfigurationException {
        BaseMessageType testData = getTestRequestData();
        testData.getMessageData().getAppData().setProperties(null);
        return serviceFactory().process(testData);
    }

    @RequestMapping("test/ping")
    public BaseMessageType ping() throws DatatypeConfigurationException {
        BaseMessageType testData = getTestRequestData();
        MessageType message = testData.getMessage();
        message.setStatus(StatusType.PING);
        message.setRequestIdRef("4E2ED077-B215-8A6F-56AD-6CE873DBD037");
        message.setOriginRequestIdRef("4E2ED077-B215-8A6F-56AD-6CE873DBD037");
        AppDataType appData = testData.getMessageData().getAppData();
        appData.setType(Type.STATUSREQUEST);
        Properties properties = new Properties();
        properties.getProperty().addAll(asList(createProperty("QRYNMB", "829-405644")));
        appData.setProperties(properties);
        return serviceFactory().process(testData);
    }

    private BaseMessageType getTestRequestData() throws DatatypeConfigurationException {
        BaseMessageType bmt = new BaseMessageType();
        MessageType messageType = new MessageType();

        OrgExternalType sender = new OrgExternalType();
        sender.setName("Пенсионный фонд РФ");
        sender.setCode("PFRF01001");
        messageType.setSender(sender);

        OrgExternalType recipient = new OrgExternalType();
        recipient.setName("Пенсионный фонд РФ");
        recipient.setCode("PFRF01001");
        messageType.setRecipient(recipient);

        OrgExternalType originator = new OrgExternalType();
        originator.setName("Пенсионный фонд РФ");
        originator.setCode("PFRF01001");
        messageType.setOriginator(recipient);

        messageType.setTypeCode("GSRV");
        messageType.setStatus(StatusType.REQUEST);

        GregorianCalendar c = new GregorianCalendar();
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        messageType.setDate(date);

        messageType.setExchangeType("2");
        bmt.setMessage(messageType);

        MessageDataType mdt = new MessageDataType();
        AppDataType appDT = new AppDataType();
        appDT.setType(Type.REQUEST);

        Properties props = new Properties();
        props.getProperty().addAll(asList(
                createProperty("TYPE_QUERY", "ЗАПРОС_ДАННЫХ_О_СДАЧЕ_ОТЧЕТНОСТИ"),
                createProperty("TYPE_ENT", "UL"),
                createProperty("ENTTAX", "7713008523"),
                createProperty("ENTTAX_ADD", "771302774"),
                createProperty("ENTNMB", "087-109-002327"),
                createProperty("ENTNAM", "ПФР")));

        appDT.setProperties(props);
        appDT.setFilePFR(new byte[] {});
        mdt.setAppData(appDT);
        bmt.setMessageData(mdt);
        return bmt;
    }

    public static Property createProperty(String name, String value) {
        Property p = new Property();
        p.setPropertyName(name);
        p.setPropertyValue(value);
        return p;
    }

    private ServicePFR serviceFactory() {
        ServicePFRService pfrService = new ServicePFRService();
        ServicePFR servicePFR = pfrService.getServicePFR();
        Client pfrClient = ClientProxy.getClient(servicePFR);
        pfrClient.getOutInterceptors().add(wss4JOutInterceptor);
        return servicePFR;
    }

}
