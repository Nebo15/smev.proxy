package mserver;


import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ru.gosuslugi.smev.rev111111.AppDataType;
import ru.gosuslugi.smev.rev111111.BaseMessageType;
import ru.gosuslugi.smev.rev111111.MessageDataType;
import ru.gosuslugi.smev.rev111111.MessageType;
import ru.gosuslugi.smev.rev111111.OrgExternalType;
import ru.gosuslugi.smev.rev111111.StatusType;
import ru.socit.pfr.service.data.Properties;
import ru.socit.pfr.service.data.Property;
import ru.socit.pfr.service.data.Type;

public class SoapHelper {

	public static BaseMessageType createTestPfrData() {
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
        XMLGregorianCalendar date = null;
        try {
			date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        messageType.setDate(date);
        
        messageType.setExchangeType("2");
        messageType.setTestMsg("Hello, bitch");
//        messageType.setCaseNumber("123");
//        messageType.setRequestIdRef("345");
        bmt.setMessage(messageType);
        
        MessageDataType mdt = new MessageDataType();
        AppDataType appDT = new AppDataType();
        appDT.setType(Type.REQUEST);
        Properties props = new Properties();
        
        props.getProperty().add(createProperty("TYPE_QUERY", "ЗАПРОС_ДАННЫХ_О_СДАЧЕ_ОТЧЕТНОСТИ"));
        props.getProperty().add(createProperty("TYPE_ENT", "UL"));
        props.getProperty().add(createProperty("ENTTAX", "7713008523"));
        props.getProperty().add(createProperty("ENTTAX_ADD", "771302774"));
        props.getProperty().add(createProperty("ENTNMB", "087-109-002327"));
        props.getProperty().add(createProperty("ENTNAM", "ПФР"));
        
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
}
