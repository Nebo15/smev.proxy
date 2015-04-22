
package unisoft.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gosuslugi.smev.rev120315.GetSvFMSIGRequestType;
import ru.gosuslugi.smev.rev120315.GetSvFMSIGResponseType;
import ru.gosuslugi.smev.rev120315.SendSvFMSIGRequestType;
import ru.gosuslugi.smev.rev120315.SendSvFMSIGResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the unisoft.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendSvFMSIG_QNAME = new QName("http://ws.unisoft/", "sendSvFMSIG");
    private final static QName _SendSvFMSIGResponse_QNAME = new QName("http://ws.unisoft/", "sendSvFMSIGResponse");
    private final static QName _GetSvFMSIGResponse_QNAME = new QName("http://ws.unisoft/", "getSvFMSIGResponse");
    private final static QName _TestResponse_QNAME = new QName("http://ws.unisoft/", "TestResponse");
    private final static QName _GetSvFMSIG_QNAME = new QName("http://ws.unisoft/", "getSvFMSIG");
    private final static QName _TestRequest_QNAME = new QName("http://ws.unisoft/", "TestRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: unisoft.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSvFMSIGRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "sendSvFMSIG")
    public JAXBElement<SendSvFMSIGRequestType> createSendSvFMSIG(SendSvFMSIGRequestType value) {
        return new JAXBElement<SendSvFMSIGRequestType>(_SendSvFMSIG_QNAME, SendSvFMSIGRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSvFMSIGResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "sendSvFMSIGResponse")
    public JAXBElement<SendSvFMSIGResponseType> createSendSvFMSIGResponse(SendSvFMSIGResponseType value) {
        return new JAXBElement<SendSvFMSIGResponseType>(_SendSvFMSIGResponse_QNAME, SendSvFMSIGResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSvFMSIGResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "getSvFMSIGResponse")
    public JAXBElement<GetSvFMSIGResponseType> createGetSvFMSIGResponse(GetSvFMSIGResponseType value) {
        return new JAXBElement<GetSvFMSIGResponseType>(_GetSvFMSIGResponse_QNAME, GetSvFMSIGResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "TestResponse")
    public JAXBElement<String> createTestResponse(String value) {
        return new JAXBElement<String>(_TestResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSvFMSIGRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "getSvFMSIG")
    public JAXBElement<GetSvFMSIGRequestType> createGetSvFMSIG(GetSvFMSIGRequestType value) {
        return new JAXBElement<GetSvFMSIGRequestType>(_GetSvFMSIG_QNAME, GetSvFMSIGRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "TestRequest")
    public JAXBElement<String> createTestRequest(String value) {
        return new JAXBElement<String>(_TestRequest_QNAME, String.class, null, value);
    }

}
