
package com.rstyle.skmv.pfr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rstyle.skmv.pfr package. 
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

    private final static QName _Fault_QNAME = new QName("http://pfr.skmv.rstyle.com", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rstyle.skmv.pfr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PFRFAULT }
     * 
     */
    public PFRFAULT createPFRFAULT() {
        return new PFRFAULT();
    }

    /**
     * Create an instance of {@link DOCUMENT }
     * 
     */
    public DOCUMENT createDOCUMENT() {
        return new DOCUMENT();
    }

    /**
     * Create an instance of {@link FIO }
     * 
     */
    public FIO createFIO() {
        return new FIO();
    }

    /**
     * Create an instance of {@link IDENTIFICATIONDOCUMENT }
     * 
     */
    public IDENTIFICATIONDOCUMENT createIDENTIFICATIONDOCUMENT() {
        return new IDENTIFICATIONDOCUMENT();
    }

    /**
     * Create an instance of {@link BIRTHPLACE }
     * 
     */
    public BIRTHPLACE createBIRTHPLACE() {
        return new BIRTHPLACE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PFRFAULT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pfr.skmv.rstyle.com", name = "fault")
    public JAXBElement<PFRFAULT> createFault(PFRFAULT value) {
        return new JAXBElement<PFRFAULT>(_Fault_QNAME, PFRFAULT.class, null, value);
    }

}
