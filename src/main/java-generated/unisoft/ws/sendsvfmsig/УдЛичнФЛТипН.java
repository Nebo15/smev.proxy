
package unisoft.ws.sendsvfmsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0421\u0432\u0435\u0434\u0435\u043d\u0438\u044f \u043e \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0435, \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0435\u043c \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u044c (\u043d\u0435\u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442)
 * 
 * <p>Java class for \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://ws.unisoft/sendSvFMSIG}\u0421\u041f\u0414\u0423\u041b\u0422\u0438\u043f">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0421\u0435\u0440\u0414\u043e\u043a">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u041d\u043e\u043c\u0414\u043e\u043a" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="15"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0414\u0430\u0442\u0430\u0414\u043e\u043a" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
 *       &lt;attribute name="\u0412\u044b\u0434\u0414\u043e\u043a">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="255"/>
 *             &lt;minLength value="1"/>
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
@XmlType(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d")
public class \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a", required = true)
    protected String \u043a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a;
    @XmlAttribute(name = "\u0421\u0435\u0440\u0414\u043e\u043a")
    protected String \u0441\u0435\u0440\u0414\u043e\u043a;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0414\u043e\u043a", required = true)
    protected String \u043d\u043e\u043c\u0414\u043e\u043a;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
    protected String \u0434\u0430\u0442\u0430\u0414\u043e\u043a;
    @XmlAttribute(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String \u0432\u044b\u0434\u0414\u043e\u043a;

    /**
     * Gets the value of the \u043a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a() {
        return \u043a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a;
    }

    /**
     * Sets the value of the \u043a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a(String value) {
        this.\u043a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a = value;
    }

    /**
     * Gets the value of the \u0441\u0435\u0440\u0414\u043e\u043a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0421\u0435\u0440\u0414\u043e\u043a() {
        return \u0441\u0435\u0440\u0414\u043e\u043a;
    }

    /**
     * Sets the value of the \u0441\u0435\u0440\u0414\u043e\u043a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0421\u0435\u0440\u0414\u043e\u043a(String value) {
        this.\u0441\u0435\u0440\u0414\u043e\u043a = value;
    }

    /**
     * Gets the value of the \u043d\u043e\u043c\u0414\u043e\u043a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041d\u043e\u043c\u0414\u043e\u043a() {
        return \u043d\u043e\u043c\u0414\u043e\u043a;
    }

    /**
     * Sets the value of the \u043d\u043e\u043c\u0414\u043e\u043a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041d\u043e\u043c\u0414\u043e\u043a(String value) {
        this.\u043d\u043e\u043c\u0414\u043e\u043a = value;
    }

    /**
     * Gets the value of the \u0434\u0430\u0442\u0430\u0414\u043e\u043a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0414\u0430\u0442\u0430\u0414\u043e\u043a() {
        return \u0434\u0430\u0442\u0430\u0414\u043e\u043a;
    }

    /**
     * Sets the value of the \u0434\u0430\u0442\u0430\u0414\u043e\u043a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0414\u0430\u0442\u0430\u0414\u043e\u043a(String value) {
        this.\u0434\u0430\u0442\u0430\u0414\u043e\u043a = value;
    }

    /**
     * Gets the value of the \u0432\u044b\u0434\u0414\u043e\u043a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0412\u044b\u0434\u0414\u043e\u043a() {
        return \u0432\u044b\u0434\u0414\u043e\u043a;
    }

    /**
     * Sets the value of the \u0432\u044b\u0434\u0414\u043e\u043a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0412\u044b\u0434\u0414\u043e\u043a(String value) {
        this.\u0432\u044b\u0434\u0414\u043e\u043a = value;
    }

}
