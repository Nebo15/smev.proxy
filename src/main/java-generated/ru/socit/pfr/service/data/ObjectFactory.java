
package ru.socit.pfr.service.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.socit.pfr.service.data package. 
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

    private final static QName _Properties_QNAME = new QName("http://data.service.pfr.socit.ru", "Properties");
    private final static QName _Type_QNAME = new QName("http://data.service.pfr.socit.ru", "Type");
    private final static QName _FilePFR_QNAME = new QName("http://data.service.pfr.socit.ru", "FilePFR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.socit.pfr.service.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.service.pfr.socit.ru", name = "Properties")
    public JAXBElement<Properties> createProperties(Properties value) {
        return new JAXBElement<Properties>(_Properties_QNAME, Properties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.service.pfr.socit.ru", name = "Type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.service.pfr.socit.ru", name = "FilePFR")
    public JAXBElement<byte[]> createFilePFR(byte[] value) {
        return new JAXBElement<byte[]>(_FilePFR_QNAME, byte[].class, null, ((byte[]) value));
    }

}
