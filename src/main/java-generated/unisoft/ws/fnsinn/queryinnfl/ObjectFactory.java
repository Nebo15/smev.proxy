
package unisoft.ws.fnsinn.queryinnfl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the unisoft.ws.fnsinn.queryinnfl package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: unisoft.ws.fnsinn.queryinnfl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Документ.СвФЛ }
     * 
     */
    public Документ.СвФЛ createДокументСвФЛ() {
        return new Документ.СвФЛ();
    }

    /**
     * Create an instance of {@link Документ.СвЮЛ }
     * 
     */
    public Документ.СвЮЛ createДокументСвЮЛ() {
        return new Документ.СвЮЛ();
    }

    /**
     * Create an instance of {@link ФИОТип }
     * 
     */
    public ФИОТип createФИОТип() {
        return new ФИОТип();
    }

    /**
     * Create an instance of {@link Документ.СвФЛ.УдЛичнФЛ }
     * 
     */
    public Документ.СвФЛ.УдЛичнФЛ createДокументСвФЛУдЛичнФЛ() {
        return new Документ.СвФЛ.УдЛичнФЛ();
    }

    /**
     * Create an instance of {@link Документ }
     * 
     */
    public Документ createДокумент() {
        return new Документ();
    }

}