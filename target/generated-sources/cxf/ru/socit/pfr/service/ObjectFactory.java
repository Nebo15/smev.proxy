
package ru.socit.pfr.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gosuslugi.smev.rev111111.BaseMessageType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.socit.pfr.service package. 
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

    private final static QName _Process_QNAME = new QName("http://service.pfr.socit.ru", "Process");
    private final static QName _ProcessResponse_QNAME = new QName("http://service.pfr.socit.ru", "ProcessResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.socit.pfr.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pfr.socit.ru", name = "Process")
    public JAXBElement<BaseMessageType> createProcess(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_Process_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.pfr.socit.ru", name = "ProcessResponse")
    public JAXBElement<BaseMessageType> createProcessResponse(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_ProcessResponse_QNAME, BaseMessageType.class, null, value);
    }

}
