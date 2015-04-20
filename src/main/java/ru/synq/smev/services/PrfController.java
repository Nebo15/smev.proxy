package ru.synq.smev.services;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@RestController
@RequestMapping({"prf", "SID0003422"})
public class PrfController {
    @Autowired WSS4JOutInterceptor wss4JOutInterceptor;

    @RequestMapping
    public BaseMessageType request(@RequestParam("ent_type") EntityType entityType,
                                   @RequestParam String tax,
                                   @RequestParam(value = "tax_add", required = false) String taxAdd,
                                   @RequestParam(required = false) String ogrn,
                                   @RequestParam(required = false) String nmb,
                                   @RequestParam(value = "ent_name", required = false) String entityName,
                                   @RequestParam(value = "first_name", required = false) String firstName,
                                   @RequestParam(value = "second_name", required = false) String secondName,
                                   @RequestParam(value = "last_name", required = false) String lastName) throws DatatypeConfigurationException {
        List<Property> props = new ArrayList<>();
        createProperty(props, "TYPE_QUERY", "ЗАПРОС_ДАННЫХ_О_СДАЧЕ_ОТЧЕТНОСТИ");
        createProperty(props, "TYPE_ENT", entityType.toString());
        createProperty(props, "ENTTAX", tax);
        createProperty(props, "ENTTAX_ADD", taxAdd);
        createProperty(props, "ENT_OGRN", ogrn);
        createProperty(props, "ENTNMB", nmb);
        createProperty(props, "ENTNAM", entityName);
        createProperty(props, "SECOND_NAME", secondName);
        createProperty(props, "FIRST_NAME", firstName);
        createProperty(props, "PATRONYMIC", lastName);

        return serviceFactory().process(generateBaseMessage(Type.REQUEST, StatusType.REQUEST, props));
    }

    private BaseMessageType generateBaseMessage(Type type, StatusType status, List<Property> properties) throws DatatypeConfigurationException {
        BaseMessageType bmt = new BaseMessageType();
        MessageType message = new MessageType();

        OrgExternalType sender = new OrgExternalType();
        sender.setName("Пенсионный фонд РФ");
        sender.setCode("PFRF01001");
        message.setSender(sender);

        OrgExternalType recipient = new OrgExternalType();
        recipient.setName("Пенсионный фонд РФ");
        recipient.setCode("PFRF01001");
        message.setRecipient(recipient);

        OrgExternalType originator = new OrgExternalType();
        originator.setName("Пенсионный фонд РФ");
        originator.setCode("PFRF01001");
        message.setOriginator(recipient);

        message.setTypeCode("GSRV");
        message.setStatus(status);

        GregorianCalendar c = new GregorianCalendar();
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        message.setDate(date);

        message.setExchangeType("2");
        bmt.setMessage(message);

        MessageDataType mdt = new MessageDataType();
        AppDataType appDT = new AppDataType();
        appDT.setType(type);

        Properties props = new Properties();
        props.getProperty().addAll(properties);

        appDT.setProperties(props);
        appDT.setFilePFR(new byte[] {});
        mdt.setAppData(appDT);
        bmt.setMessageData(mdt);
        return bmt;
    }

    @RequestMapping("status/{id}")
    public BaseMessageType status(@PathVariable String id) throws DatatypeConfigurationException {
        List<Property> props = new ArrayList<>();
        createProperty(props, "QRYNMB", id);
        return serviceFactory().process(generateBaseMessage(Type.STATUSREQUEST, StatusType.PING, props));
    }

    @RequestMapping("test")
    public BaseMessageType test() throws DatatypeConfigurationException {
        return request(EntityType.UL, "7713008523", "771302774", null, "087-109-002327", "ПФР", null, null, null);
    }

    public static void createProperty(List<Property> list, String name, String value) {
        if (value == null || value.isEmpty()) return;
        Property p = new Property();
        p.setPropertyName(name);
        p.setPropertyValue(value);
        list.add(p);
    }

    private ServicePFR serviceFactory() {
        ServicePFRService pfrService = new ServicePFRService();
        ServicePFR servicePFR = pfrService.getServicePFR();
        Client pfrClient = ClientProxy.getClient(servicePFR);
        pfrClient.getOutInterceptors().add(wss4JOutInterceptor);
        return servicePFR;
    }

    private enum EntityType {
        UL, IP
    }
}
