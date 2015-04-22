
package unisoft.ws.getsvfmsig;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="4.01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;totalDigits value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
public class \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 {

    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c;
    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424", required = true)
    protected BigInteger \u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424;

    /**
     * Gets the value of the \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c() {
        return \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c;
    }

    /**
     * Sets the value of the \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c(String value) {
        this.\u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c = value;
    }

    /**
     * Gets the value of the \u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424() {
        return \u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424;
    }

    /**
     * Sets the value of the \u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424(BigInteger value) {
        this.\u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424 = value;
    }

}
