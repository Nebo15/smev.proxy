
package unisoft.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gosuslugi.smev.rev111111.INNFL;
import ru.gosuslugi.smev.rev111111.INNFLGR;
import ru.gosuslugi.smev.rev111111.INNFLGRRs;
import ru.gosuslugi.smev.rev111111.INNFLRs;
import ru.gosuslugi.smev.rev111111.OTINNFLGR;
import ru.gosuslugi.smev.rev111111.ZPINNFLGR;


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

    private final static QName _QueryINNFLGR_QNAME = new QName("http://ws.unisoft/", "queryINNFLGR");
    private final static QName _GetINNFLGRResponse_QNAME = new QName("http://ws.unisoft/", "getINNFLGRResponse");
    private final static QName _GetINNFLGR_QNAME = new QName("http://ws.unisoft/", "getINNFLGR");
    private final static QName _TestResponse_QNAME = new QName("http://ws.unisoft/", "TestResponse");
    private final static QName _TestRequest_QNAME = new QName("http://ws.unisoft/", "TestRequest");
    private final static QName _QueryINNFLResponse_QNAME = new QName("http://ws.unisoft/", "queryINNFLResponse");
    private final static QName _QueryINNFL_QNAME = new QName("http://ws.unisoft/", "queryINNFL");
    private final static QName _QueryINNFLGRResponse_QNAME = new QName("http://ws.unisoft/", "queryINNFLGRResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: unisoft.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INNFLGR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "queryINNFLGR")
    public JAXBElement<INNFLGR> createQueryINNFLGR(INNFLGR value) {
        return new JAXBElement<INNFLGR>(_QueryINNFLGR_QNAME, INNFLGR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTINNFLGR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "getINNFLGRResponse")
    public JAXBElement<OTINNFLGR> createGetINNFLGRResponse(OTINNFLGR value) {
        return new JAXBElement<OTINNFLGR>(_GetINNFLGRResponse_QNAME, OTINNFLGR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZPINNFLGR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "getINNFLGR")
    public JAXBElement<ZPINNFLGR> createGetINNFLGR(ZPINNFLGR value) {
        return new JAXBElement<ZPINNFLGR>(_GetINNFLGR_QNAME, ZPINNFLGR.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "TestRequest")
    public JAXBElement<String> createTestRequest(String value) {
        return new JAXBElement<String>(_TestRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INNFLRs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "queryINNFLResponse")
    public JAXBElement<INNFLRs> createQueryINNFLResponse(INNFLRs value) {
        return new JAXBElement<INNFLRs>(_QueryINNFLResponse_QNAME, INNFLRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INNFL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "queryINNFL")
    public JAXBElement<INNFL> createQueryINNFL(INNFL value) {
        return new JAXBElement<INNFL>(_QueryINNFL_QNAME, INNFL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INNFLGRRs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.unisoft/", name = "queryINNFLGRResponse")
    public JAXBElement<INNFLGRRs> createQueryINNFLGRResponse(INNFLGRRs value) {
        return new JAXBElement<INNFLGRRs>(_QueryINNFLGRResponse_QNAME, INNFLGRRs.class, null, value);
    }

}
