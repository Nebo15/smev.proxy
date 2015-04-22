
package unisoft.ws.sendsvfmsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0410\u0434\u0440\u0435\u0441 \u0432 \u0420\u043e\u0441\u0441\u0438\u0439\u0441\u043a\u043e\u0439 \u0424\u0435\u0434\u0435\u0440\u0430\u0446\u0438\u0438 
 * 
 * <p>Java class for \u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="\u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="\u041a\u043e\u0434\u0424\u0418\u0410\u0421">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="36"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0418\u043d\u0434\u0435\u043a\u0441">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="6"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d" use="required" type="{http://ws.unisoft/sendSvFMSIG}CC\u0420\u0424\u0422\u0438\u043f" />
 *       &lt;attribute name="\u0420\u0430\u0439\u043e\u043d">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0413\u043e\u0440\u043e\u0434">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0423\u043b\u0438\u0446\u0430">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0414\u043e\u043c">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0421\u0442\u0440\u043e\u0435\u043d">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u041a\u043e\u0440\u043f\u0443\u0441">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u041a\u0432\u0430\u0440\u0442">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="10"/>
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
@XmlType(name = "\u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f")
public class \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0424\u0418\u0410\u0421")
    protected String \u043a\u043e\u0434\u0424\u0418\u0410\u0421;
    @XmlAttribute(name = "\u0418\u043d\u0434\u0435\u043a\u0441")
    protected String \u0438\u043d\u0434\u0435\u043a\u0441;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d", required = true)
    protected String \u043a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d;
    @XmlAttribute(name = "\u0420\u0430\u0439\u043e\u043d")
    protected String \u0440\u0430\u0439\u043e\u043d;
    @XmlAttribute(name = "\u0413\u043e\u0440\u043e\u0434")
    protected String \u0433\u043e\u0440\u043e\u0434;
    @XmlAttribute(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442")
    protected String \u043d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442;
    @XmlAttribute(name = "\u0423\u043b\u0438\u0446\u0430")
    protected String \u0443\u043b\u0438\u0446\u0430;
    @XmlAttribute(name = "\u0414\u043e\u043c")
    protected String \u0434\u043e\u043c;
    @XmlAttribute(name = "\u0421\u0442\u0440\u043e\u0435\u043d")
    protected String \u0441\u0442\u0440\u043e\u0435\u043d;
    @XmlAttribute(name = "\u041a\u043e\u0440\u043f\u0443\u0441")
    protected String \u043a\u043e\u0440\u043f\u0443\u0441;
    @XmlAttribute(name = "\u041a\u0432\u0430\u0440\u0442")
    protected String \u043a\u0432\u0430\u0440\u0442;

    /**
     * Gets the value of the \u043a\u043e\u0434\u0424\u0418\u0410\u0421 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041a\u043e\u0434\u0424\u0418\u0410\u0421() {
        return \u043a\u043e\u0434\u0424\u0418\u0410\u0421;
    }

    /**
     * Sets the value of the \u043a\u043e\u0434\u0424\u0418\u0410\u0421 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041a\u043e\u0434\u0424\u0418\u0410\u0421(String value) {
        this.\u043a\u043e\u0434\u0424\u0418\u0410\u0421 = value;
    }

    /**
     * Gets the value of the \u0438\u043d\u0434\u0435\u043a\u0441 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0418\u043d\u0434\u0435\u043a\u0441() {
        return \u0438\u043d\u0434\u0435\u043a\u0441;
    }

    /**
     * Sets the value of the \u0438\u043d\u0434\u0435\u043a\u0441 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0418\u043d\u0434\u0435\u043a\u0441(String value) {
        this.\u0438\u043d\u0434\u0435\u043a\u0441 = value;
    }

    /**
     * Gets the value of the \u043a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d() {
        return \u043a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d;
    }

    /**
     * Sets the value of the \u043a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d(String value) {
        this.\u043a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d = value;
    }

    /**
     * Gets the value of the \u0440\u0430\u0439\u043e\u043d property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0420\u0430\u0439\u043e\u043d() {
        return \u0440\u0430\u0439\u043e\u043d;
    }

    /**
     * Sets the value of the \u0440\u0430\u0439\u043e\u043d property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0420\u0430\u0439\u043e\u043d(String value) {
        this.\u0440\u0430\u0439\u043e\u043d = value;
    }

    /**
     * Gets the value of the \u0433\u043e\u0440\u043e\u0434 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0413\u043e\u0440\u043e\u0434() {
        return \u0433\u043e\u0440\u043e\u0434;
    }

    /**
     * Sets the value of the \u0433\u043e\u0440\u043e\u0434 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0413\u043e\u0440\u043e\u0434(String value) {
        this.\u0433\u043e\u0440\u043e\u0434 = value;
    }

    /**
     * Gets the value of the \u043d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442() {
        return \u043d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442;
    }

    /**
     * Sets the value of the \u043d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442(String value) {
        this.\u043d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442 = value;
    }

    /**
     * Gets the value of the \u0443\u043b\u0438\u0446\u0430 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0423\u043b\u0438\u0446\u0430() {
        return \u0443\u043b\u0438\u0446\u0430;
    }

    /**
     * Sets the value of the \u0443\u043b\u0438\u0446\u0430 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0423\u043b\u0438\u0446\u0430(String value) {
        this.\u0443\u043b\u0438\u0446\u0430 = value;
    }

    /**
     * Gets the value of the \u0434\u043e\u043c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0414\u043e\u043c() {
        return \u0434\u043e\u043c;
    }

    /**
     * Sets the value of the \u0434\u043e\u043c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0414\u043e\u043c(String value) {
        this.\u0434\u043e\u043c = value;
    }

    /**
     * Gets the value of the \u0441\u0442\u0440\u043e\u0435\u043d property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0421\u0442\u0440\u043e\u0435\u043d() {
        return \u0441\u0442\u0440\u043e\u0435\u043d;
    }

    /**
     * Sets the value of the \u0441\u0442\u0440\u043e\u0435\u043d property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0421\u0442\u0440\u043e\u0435\u043d(String value) {
        this.\u0441\u0442\u0440\u043e\u0435\u043d = value;
    }

    /**
     * Gets the value of the \u043a\u043e\u0440\u043f\u0443\u0441 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041a\u043e\u0440\u043f\u0443\u0441() {
        return \u043a\u043e\u0440\u043f\u0443\u0441;
    }

    /**
     * Sets the value of the \u043a\u043e\u0440\u043f\u0443\u0441 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041a\u043e\u0440\u043f\u0443\u0441(String value) {
        this.\u043a\u043e\u0440\u043f\u0443\u0441 = value;
    }

    /**
     * Gets the value of the \u043a\u0432\u0430\u0440\u0442 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u041a\u0432\u0430\u0440\u0442() {
        return \u043a\u0432\u0430\u0440\u0442;
    }

    /**
     * Sets the value of the \u043a\u0432\u0430\u0440\u0442 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u041a\u0432\u0430\u0440\u0442(String value) {
        this.\u043a\u0432\u0430\u0440\u0442 = value;
    }

}
