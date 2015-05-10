
package com.rstyle.skmv.snils_validation;

import ru.gosuslugi.smev.rev120315.SnilsValidationRequestType;
import ru.gosuslugi.smev.rev120315.SnilsValidationResponseType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rstyle.skmv.snils_validation package. 
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

    private final static QName _SnilsValidationRequest_QNAME = new QName("http://snils-validation.skmv.rstyle.com", "SnilsValidationRequest");
    private final static QName _Result_QNAME = new QName("http://snils-validation.skmv.rstyle.com", "result");
    private final static QName _SnilsValidationResponse_QNAME = new QName("http://snils-validation.skmv.rstyle.com", "SnilsValidationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rstyle.skmv.snils_validation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SnilsValidationData }
     * 
     */
    public SnilsValidationData createSnilsValidationData() {
        return new SnilsValidationData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnilsValidationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://snils-validation.skmv.rstyle.com", name = "SnilsValidationRequest")
    public JAXBElement<SnilsValidationRequestType> createSnilsValidationRequest(SnilsValidationRequestType value) {
        return new JAXBElement<SnilsValidationRequestType>(_SnilsValidationRequest_QNAME, SnilsValidationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://snils-validation.skmv.rstyle.com", name = "result")
    public JAXBElement<Boolean> createResult(Boolean value) {
        return new JAXBElement<Boolean>(_Result_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnilsValidationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://snils-validation.skmv.rstyle.com", name = "SnilsValidationResponse")
    public JAXBElement<SnilsValidationResponseType> createSnilsValidationResponse(SnilsValidationResponseType value) {
        return new JAXBElement<SnilsValidationResponseType>(_SnilsValidationResponse_QNAME, SnilsValidationResponseType.class, null, value);
    }

}
