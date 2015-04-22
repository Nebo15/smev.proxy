
package unisoft.ws.sendsvfmsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0424\u0430\u043c\u0438\u043b\u0438\u044f, \u0438\u043c\u044f, \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e \u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043b\u0438\u0446\u0430
 * 
 * <p>Java class for \u0424\u0418\u041e\u0422\u0438\u043f complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="\u0424\u0418\u041e\u0422\u0438\u043f">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="\u0424\u0430\u043c\u0438\u043b\u0438\u044f" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0418\u043c\u044f" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="60"/>
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
@XmlType(name = "\u0424\u0418\u041e\u0422\u0438\u043f")
public class \u0424\u0418\u041e\u0422\u0438\u043f {

    @XmlAttribute(name = "\u0424\u0430\u043c\u0438\u043b\u0438\u044f", required = true)
    protected String \u0444\u0430\u043c\u0438\u043b\u0438\u044f;
    @XmlAttribute(name = "\u0418\u043c\u044f", required = true)
    protected String \u0438\u043c\u044f;
    @XmlAttribute(name = "\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e")
    protected String \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e;

    /**
     * Gets the value of the \u0444\u0430\u043c\u0438\u043b\u0438\u044f property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0424\u0430\u043c\u0438\u043b\u0438\u044f() {
        return \u0444\u0430\u043c\u0438\u043b\u0438\u044f;
    }

    /**
     * Sets the value of the \u0444\u0430\u043c\u0438\u043b\u0438\u044f property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0424\u0430\u043c\u0438\u043b\u0438\u044f(String value) {
        this.\u0444\u0430\u043c\u0438\u043b\u0438\u044f = value;
    }

    /**
     * Gets the value of the \u0438\u043c\u044f property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0418\u043c\u044f() {
        return \u0438\u043c\u044f;
    }

    /**
     * Sets the value of the \u0438\u043c\u044f property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0418\u043c\u044f(String value) {
        this.\u0438\u043c\u044f = value;
    }

    /**
     * Gets the value of the \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e() {
        return \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e;
    }

    /**
     * Sets the value of the \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e(String value) {
        this.\u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e = value;
    }

}
