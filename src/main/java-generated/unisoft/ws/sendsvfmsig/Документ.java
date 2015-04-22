
package unisoft.ws.sendsvfmsig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="\u0421\u0432\u0422\u041e\u0424\u041c\u0421">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="\u041d\u0430\u0438\u043c\u0422\u041e" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u041a\u043e\u0434\u0422\u041e" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="6"/>
 *                       &lt;maxLength value="7"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u041e\u0413\u0420\u041d\u0422\u041e" type="{http://ws.unisoft/sendSvFMSIG}\u041e\u0413\u0420\u041d\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u0418\u041d\u041d\u0422\u041e" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u0418\u041d\u041d\u042e\u041b\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u041a\u041f\u041f\u0422\u041e" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u041a\u041f\u041f\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u0410\u0434\u0440\u0435\u0441\u0422\u041e" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u0422\u0435\u043b\u0422\u041e" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="20"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="\u0421\u0432\u0424\u041b">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="\u0424\u0418\u041e\u0424\u041b" type="{http://ws.unisoft/sendSvFMSIG}\u0424\u0418\u041e\u0422\u0438\u043f"/>
 *                   &lt;element name="\u0423\u0434\u041b\u0438\u0447\u043d" type="{http://ws.unisoft/sendSvFMSIG}\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d"/>
 *                   &lt;element name="\u041f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d" type="{http://ws.unisoft/sendSvFMSIG}\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="\u041f\u0440\u0412\u0438\u0437\u044b">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u041f\u043e\u043b" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u041f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="254"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u041e\u041a\u0421\u041c\u0422\u0438\u043f" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="\u0410\u0434\u0440\u0435\u0441\u041c\u041f" type="{http://ws.unisoft/sendSvFMSIG}\u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f"/>
 *                   &lt;element name="\u0410\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f" type="{http://ws.unisoft/sendSvFMSIG}\u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u0421\u0440\u043e\u043a\u0414\u043e" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="\u0418\u0434\u0414\u043e\u043a" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="36"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="4.01"/>
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
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u0422\u041e\u0424\u041c\u0421",
    "\u0441\u0432\u0424\u041b",
    "\u0441\u0432\u041f\u043e\u0441\u0442\u0423\u0447"
})
@XmlRootElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
public class \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 {

    @XmlElement(name = "\u0421\u0432\u0422\u041e\u0424\u041c\u0421", required = true)
    protected \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0422\u041e\u0424\u041c\u0421 \u0441\u0432\u0422\u041e\u0424\u041c\u0421;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0424\u041b \u0441\u0432\u0424\u041b;
    @XmlElement(name = "\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447", required = true)
    protected \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447 \u0441\u0432\u041f\u043e\u0441\u0442\u0423\u0447;
    @XmlAttribute(name = "\u0418\u0434\u0414\u043e\u043a", required = true)
    protected String \u0438\u0434\u0414\u043e\u043a;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c;

    /**
     * Gets the value of the \u0441\u0432\u0422\u041e\u0424\u041c\u0421 property.
     * 
     * @return
     *     possible object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0422\u041e\u0424\u041c\u0421 }
     *     
     */
    public \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0422\u041e\u0424\u041c\u0421 get\u0421\u0432\u0422\u041e\u0424\u041c\u0421() {
        return \u0441\u0432\u0422\u041e\u0424\u041c\u0421;
    }

    /**
     * Sets the value of the \u0441\u0432\u0422\u041e\u0424\u041c\u0421 property.
     * 
     * @param value
     *     allowed object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0422\u041e\u0424\u041c\u0421 }
     *     
     */
    public void set\u0421\u0432\u0422\u041e\u0424\u041c\u0421(\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0422\u041e\u0424\u041c\u0421 value) {
        this.\u0441\u0432\u0422\u041e\u0424\u041c\u0421 = value;
    }

    /**
     * Gets the value of the \u0441\u0432\u0424\u041b property.
     * 
     * @return
     *     possible object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0424\u041b }
     *     
     */
    public \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0424\u041b get\u0421\u0432\u0424\u041b() {
        return \u0441\u0432\u0424\u041b;
    }

    /**
     * Sets the value of the \u0441\u0432\u0424\u041b property.
     * 
     * @param value
     *     allowed object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0424\u041b }
     *     
     */
    public void set\u0421\u0432\u0424\u041b(\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0424\u041b value) {
        this.\u0441\u0432\u0424\u041b = value;
    }

    /**
     * Gets the value of the \u0441\u0432\u041f\u043e\u0441\u0442\u0423\u0447 property.
     * 
     * @return
     *     possible object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447 }
     *     
     */
    public \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447 get\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447() {
        return \u0441\u0432\u041f\u043e\u0441\u0442\u0423\u0447;
    }

    /**
     * Sets the value of the \u0441\u0432\u041f\u043e\u0441\u0442\u0423\u0447 property.
     * 
     * @param value
     *     allowed object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447 }
     *     
     */
    public void set\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447(\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447 value) {
        this.\u0441\u0432\u041f\u043e\u0441\u0442\u0423\u0447 = value;
    }

    /**
     * Gets the value of the \u0438\u0434\u0414\u043e\u043a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get\u0418\u0434\u0414\u043e\u043a() {
        return \u0438\u0434\u0414\u043e\u043a;
    }

    /**
     * Sets the value of the \u0438\u0434\u0414\u043e\u043a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set\u0418\u0434\u0414\u043e\u043a(String value) {
        this.\u0438\u0434\u0414\u043e\u043a = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="\u0410\u0434\u0440\u0435\u0441\u041c\u041f" type="{http://ws.unisoft/sendSvFMSIG}\u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f"/>
     *         &lt;element name="\u0410\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f" type="{http://ws.unisoft/sendSvFMSIG}\u0410\u0434\u0440\u0420\u0424_\u0424\u041c\u0421\u0422\u0438\u043f" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
     *       &lt;attribute name="\u0421\u0440\u043e\u043a\u0414\u043e" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0430\u0434\u0440\u0435\u0441\u041c\u041f",
        "\u0430\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f"
    })
    public static class \u0421\u0432\u041f\u043e\u0441\u0442\u0423\u0447 {

        @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u041f", required = true)
        protected \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f \u0430\u0434\u0440\u0435\u0441\u041c\u041f;
        @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f")
        protected \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f \u0430\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442")
        protected String \u0434\u0430\u0442\u0430\u041f\u043e\u0441\u0442;
        @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u0414\u043e")
        protected String \u0441\u0440\u043e\u043a\u0414\u043e;

        /**
         * Gets the value of the \u0430\u0434\u0440\u0435\u0441\u041c\u041f property.
         * 
         * @return
         *     possible object is
         *     {@link \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f }
         *     
         */
        public \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f get\u0410\u0434\u0440\u0435\u0441\u041c\u041f() {
            return \u0430\u0434\u0440\u0435\u0441\u041c\u041f;
        }

        /**
         * Sets the value of the \u0430\u0434\u0440\u0435\u0441\u041c\u041f property.
         * 
         * @param value
         *     allowed object is
         *     {@link \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f }
         *     
         */
        public void set\u0410\u0434\u0440\u0435\u0441\u041c\u041f(\u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f value) {
            this.\u0430\u0434\u0440\u0435\u0441\u041c\u041f = value;
        }

        /**
         * Gets the value of the \u0430\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f property.
         * 
         * @return
         *     possible object is
         *     {@link \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f }
         *     
         */
        public \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f get\u0410\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f() {
            return \u0430\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f;
        }

        /**
         * Sets the value of the \u0430\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f property.
         * 
         * @param value
         *     allowed object is
         *     {@link \u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f }
         *     
         */
        public void set\u0410\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f(\u0410\u0434\u0440\u0420\u0424\u0424\u041c\u0421\u0422\u0438\u043f value) {
            this.\u0430\u0434\u0440\u0435\u0441\u041f\u0440\u0435\u0434\u041c\u041f = value;
        }

        /**
         * Gets the value of the \u0434\u0430\u0442\u0430\u041f\u043e\u0441\u0442 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442() {
            return \u0434\u0430\u0442\u0430\u041f\u043e\u0441\u0442;
        }

        /**
         * Sets the value of the \u0434\u0430\u0442\u0430\u041f\u043e\u0441\u0442 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442(String value) {
            this.\u0434\u0430\u0442\u0430\u041f\u043e\u0441\u0442 = value;
        }

        /**
         * Gets the value of the \u0441\u0440\u043e\u043a\u0414\u043e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0421\u0440\u043e\u043a\u0414\u043e() {
            return \u0441\u0440\u043e\u043a\u0414\u043e;
        }

        /**
         * Sets the value of the \u0441\u0440\u043e\u043a\u0414\u043e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0421\u0440\u043e\u043a\u0414\u043e(String value) {
            this.\u0441\u0440\u043e\u043a\u0414\u043e = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="\u041d\u0430\u0438\u043c\u0422\u041e" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u041a\u043e\u0434\u0422\u041e" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="6"/>
     *             &lt;maxLength value="7"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u041e\u0413\u0420\u041d\u0422\u041e" type="{http://ws.unisoft/sendSvFMSIG}\u041e\u0413\u0420\u041d\u0422\u0438\u043f" />
     *       &lt;attribute name="\u0418\u041d\u041d\u0422\u041e" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u0418\u041d\u041d\u042e\u041b\u0422\u0438\u043f" />
     *       &lt;attribute name="\u041a\u041f\u041f\u0422\u041e" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u041a\u041f\u041f\u0422\u0438\u043f" />
     *       &lt;attribute name="\u0410\u0434\u0440\u0435\u0441\u0422\u041e" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u0422\u0435\u043b\u0422\u041e" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="20"/>
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
    public static class \u0421\u0432\u0422\u041e\u0424\u041c\u0421 {

        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0422\u041e", required = true)
        protected String \u043d\u0430\u0438\u043c\u0422\u041e;
        @XmlAttribute(name = "\u041a\u043e\u0434\u0422\u041e", required = true)
        protected String \u043a\u043e\u0434\u0422\u041e;
        @XmlAttribute(name = "\u041e\u0413\u0420\u041d\u0422\u041e")
        protected String \u043e\u0433\u0440\u043d\u0442\u043e;
        @XmlAttribute(name = "\u0418\u041d\u041d\u0422\u041e", required = true)
        protected String \u0438\u043d\u043d\u0442\u043e;
        @XmlAttribute(name = "\u041a\u041f\u041f\u0422\u041e", required = true)
        protected String \u043a\u043f\u043f\u0442\u043e;
        @XmlAttribute(name = "\u0410\u0434\u0440\u0435\u0441\u0422\u041e", required = true)
        protected String \u0430\u0434\u0440\u0435\u0441\u0422\u041e;
        @XmlAttribute(name = "\u0422\u0435\u043b\u0422\u041e", required = true)
        protected String \u0442\u0435\u043b\u0422\u041e;

        /**
         * Gets the value of the \u043d\u0430\u0438\u043c\u0422\u041e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041d\u0430\u0438\u043c\u0422\u041e() {
            return \u043d\u0430\u0438\u043c\u0422\u041e;
        }

        /**
         * Sets the value of the \u043d\u0430\u0438\u043c\u0422\u041e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041d\u0430\u0438\u043c\u0422\u041e(String value) {
            this.\u043d\u0430\u0438\u043c\u0422\u041e = value;
        }

        /**
         * Gets the value of the \u043a\u043e\u0434\u0422\u041e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041a\u043e\u0434\u0422\u041e() {
            return \u043a\u043e\u0434\u0422\u041e;
        }

        /**
         * Sets the value of the \u043a\u043e\u0434\u0422\u041e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041a\u043e\u0434\u0422\u041e(String value) {
            this.\u043a\u043e\u0434\u0422\u041e = value;
        }

        /**
         * Gets the value of the \u043e\u0433\u0440\u043d\u0442\u043e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041e\u0413\u0420\u041d\u0422\u041e() {
            return \u043e\u0433\u0440\u043d\u0442\u043e;
        }

        /**
         * Sets the value of the \u043e\u0433\u0440\u043d\u0442\u043e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041e\u0413\u0420\u041d\u0422\u041e(String value) {
            this.\u043e\u0433\u0440\u043d\u0442\u043e = value;
        }

        /**
         * Gets the value of the \u0438\u043d\u043d\u0442\u043e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0418\u041d\u041d\u0422\u041e() {
            return \u0438\u043d\u043d\u0442\u043e;
        }

        /**
         * Sets the value of the \u0438\u043d\u043d\u0442\u043e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0418\u041d\u041d\u0422\u041e(String value) {
            this.\u0438\u043d\u043d\u0442\u043e = value;
        }

        /**
         * Gets the value of the \u043a\u043f\u043f\u0442\u043e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041a\u041f\u041f\u0422\u041e() {
            return \u043a\u043f\u043f\u0442\u043e;
        }

        /**
         * Sets the value of the \u043a\u043f\u043f\u0442\u043e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041a\u041f\u041f\u0422\u041e(String value) {
            this.\u043a\u043f\u043f\u0442\u043e = value;
        }

        /**
         * Gets the value of the \u0430\u0434\u0440\u0435\u0441\u0422\u041e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0410\u0434\u0440\u0435\u0441\u0422\u041e() {
            return \u0430\u0434\u0440\u0435\u0441\u0422\u041e;
        }

        /**
         * Sets the value of the \u0430\u0434\u0440\u0435\u0441\u0422\u041e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0410\u0434\u0440\u0435\u0441\u0422\u041e(String value) {
            this.\u0430\u0434\u0440\u0435\u0441\u0422\u041e = value;
        }

        /**
         * Gets the value of the \u0442\u0435\u043b\u0422\u041e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0422\u0435\u043b\u0422\u041e() {
            return \u0442\u0435\u043b\u0422\u041e;
        }

        /**
         * Sets the value of the \u0442\u0435\u043b\u0422\u041e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0422\u0435\u043b\u0422\u041e(String value) {
            this.\u0442\u0435\u043b\u0422\u041e = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="\u0424\u0418\u041e\u0424\u041b" type="{http://ws.unisoft/sendSvFMSIG}\u0424\u0418\u041e\u0422\u0438\u043f"/>
     *         &lt;element name="\u0423\u0434\u041b\u0438\u0447\u043d" type="{http://ws.unisoft/sendSvFMSIG}\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d"/>
     *         &lt;element name="\u041f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d" type="{http://ws.unisoft/sendSvFMSIG}\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="\u041f\u0440\u0412\u0438\u0437\u044b">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u041f\u043e\u043b" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u041f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
     *       &lt;attribute name="\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="254"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b" use="required" type="{http://ws.unisoft/sendSvFMSIG}\u041e\u041a\u0421\u041c\u0422\u0438\u043f" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0444\u0438\u043e\u0444\u043b",
        "\u0443\u0434\u041b\u0438\u0447\u043d",
        "\u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d"
    })
    public static class \u0421\u0432\u0424\u041b {

        @XmlElement(name = "\u0424\u0418\u041e\u0424\u041b", required = true)
        protected \u0424\u0418\u041e\u0422\u0438\u043f \u0444\u0438\u043e\u0444\u043b;
        @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d", required = true)
        protected \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d \u0443\u0434\u041b\u0438\u0447\u043d;
        @XmlElement(name = "\u041f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d")
        protected List<\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d> \u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d;
        @XmlAttribute(name = "\u041f\u0440\u0412\u0438\u0437\u044b")
        protected String \u043f\u0440\u0412\u0438\u0437\u044b;
        @XmlAttribute(name = "\u041f\u043e\u043b", required = true)
        protected String \u043f\u043e\u043b;
        @XmlAttribute(name = "\u041f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", required = true)
        protected String \u043f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", required = true)
        protected String \u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434;
        @XmlAttribute(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434")
        protected String \u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434;
        @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b", required = true)
        protected String \u043a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b;

        /**
         * Gets the value of the \u0444\u0438\u043e\u0444\u043b property.
         * 
         * @return
         *     possible object is
         *     {@link \u0424\u0418\u041e\u0422\u0438\u043f }
         *     
         */
        public \u0424\u0418\u041e\u0422\u0438\u043f get\u0424\u0418\u041e\u0424\u041b() {
            return \u0444\u0438\u043e\u0444\u043b;
        }

        /**
         * Sets the value of the \u0444\u0438\u043e\u0444\u043b property.
         * 
         * @param value
         *     allowed object is
         *     {@link \u0424\u0418\u041e\u0422\u0438\u043f }
         *     
         */
        public void set\u0424\u0418\u041e\u0424\u041b(\u0424\u0418\u041e\u0422\u0438\u043f value) {
            this.\u0444\u0438\u043e\u0444\u043b = value;
        }

        /**
         * Gets the value of the \u0443\u0434\u041b\u0438\u0447\u043d property.
         * 
         * @return
         *     possible object is
         *     {@link \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d }
         *     
         */
        public \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d get\u0423\u0434\u041b\u0438\u0447\u043d() {
            return \u0443\u0434\u041b\u0438\u0447\u043d;
        }

        /**
         * Sets the value of the \u0443\u0434\u041b\u0438\u0447\u043d property.
         * 
         * @param value
         *     allowed object is
         *     {@link \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d }
         *     
         */
        public void set\u0423\u0434\u041b\u0438\u0447\u043d(\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d value) {
            this.\u0443\u0434\u041b\u0438\u0447\u043d = value;
        }

        /**
         * Gets the value of the \u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the \u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get\u041f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link \u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d }
         * 
         * 
         */
        public List<\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d> get\u041f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d() {
            if (\u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d == null) {
                \u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d = new ArrayList<\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b\u0422\u0438\u043f\u041d>();
            }
            return this.\u043f\u0440\u0435\u0436\u043d\u0423\u0434\u041b\u0438\u0447\u043d;
        }

        /**
         * Gets the value of the \u043f\u0440\u0412\u0438\u0437\u044b property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041f\u0440\u0412\u0438\u0437\u044b() {
            return \u043f\u0440\u0412\u0438\u0437\u044b;
        }

        /**
         * Sets the value of the \u043f\u0440\u0412\u0438\u0437\u044b property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041f\u0440\u0412\u0438\u0437\u044b(String value) {
            this.\u043f\u0440\u0412\u0438\u0437\u044b = value;
        }

        /**
         * Gets the value of the \u043f\u043e\u043b property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041f\u043e\u043b() {
            return \u043f\u043e\u043b;
        }

        /**
         * Sets the value of the \u043f\u043e\u043b property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041f\u043e\u043b(String value) {
            this.\u043f\u043e\u043b = value;
        }

        /**
         * Gets the value of the \u043f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434() {
            return \u043f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434;
        }

        /**
         * Sets the value of the \u043f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434(String value) {
            this.\u043f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434 = value;
        }

        /**
         * Gets the value of the \u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434() {
            return \u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434;
        }

        /**
         * Sets the value of the \u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434(String value) {
            this.\u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434 = value;
        }

        /**
         * Gets the value of the \u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434() {
            return \u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434;
        }

        /**
         * Sets the value of the \u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434(String value) {
            this.\u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434 = value;
        }

        /**
         * Gets the value of the \u043a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b() {
            return \u043a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b;
        }

        /**
         * Sets the value of the \u043a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b(String value) {
            this.\u043a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b = value;
        }

    }

}
