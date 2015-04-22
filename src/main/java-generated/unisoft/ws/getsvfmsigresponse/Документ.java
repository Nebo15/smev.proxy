
package unisoft.ws.getsvfmsigresponse;

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
 *       &lt;choice>
 *         &lt;element name="\u0421\u0432\u0424\u041b">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="\u0424\u0418\u041e" type="{http://ws.unisoft/getSvFMSIGResponse}\u0424\u0418\u041e\u0422\u0438\u043f"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="\u0418\u041d\u041d\u0424\u041b" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0418\u041d\u041d\u0424\u041b\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u0414\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u041a\u043e\u0434\u041d\u041e" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0421\u041e\u041d\u041e\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u041d\u0430\u0438\u043c\u041d\u041e" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="250"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
 *                 &lt;attribute name="\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u041e\u041a\u0421\u041c\u0422\u0438\u043f" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="\u041a\u043e\u0434\u041e\u0431\u0440" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="2"/>
 *                       &lt;enumeration value="19"/>
 *                       &lt;enumeration value="23"/>
 *                       &lt;enumeration value="52"/>
 *                       &lt;enumeration value="82"/>
 *                       &lt;enumeration value="83"/>
 *                       &lt;enumeration value="89"/>
 *                       &lt;enumeration value="99"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="\u0422\u0435\u043a\u0441\u0442\u041e\u0448">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="500"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
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
    "\u0441\u0432\u0424\u041b",
    "\u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431"
})
@XmlRootElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
public class \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 {

    @XmlElement(name = "\u0421\u0432\u0424\u041b")
    protected \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0424\u041b \u0441\u0432\u0424\u041b;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431")
    protected \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 \u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431;
    @XmlAttribute(name = "\u0418\u0434\u0414\u043e\u043a", required = true)
    protected String \u0438\u0434\u0414\u043e\u043a;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c;

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
     * Gets the value of the \u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 property.
     * 
     * @return
     *     possible object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 }
     *     
     */
    public \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 get\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431() {
        return \u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431;
    }

    /**
     * Sets the value of the \u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 property.
     * 
     * @param value
     *     allowed object is
     *     {@link \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 }
     *     
     */
    public void set\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431(\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 value) {
        this.\u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 = value;
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
     *         &lt;element name="\u0424\u0418\u041e" type="{http://ws.unisoft/getSvFMSIGResponse}\u0424\u0418\u041e\u0422\u0438\u043f"/>
     *       &lt;/sequence>
     *       &lt;attribute name="\u0418\u041d\u041d\u0424\u041b" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0418\u041d\u041d\u0424\u041b\u0422\u0438\u043f" />
     *       &lt;attribute name="\u0414\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
     *       &lt;attribute name="\u041a\u043e\u0434\u041d\u041e" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0421\u041e\u041d\u041e\u0422\u0438\u043f" />
     *       &lt;attribute name="\u041d\u0430\u0438\u043c\u041d\u041e" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="250"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u0414\u0430\u0442\u0430\u0422\u0438\u043f" />
     *       &lt;attribute name="\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b" use="required" type="{http://ws.unisoft/getSvFMSIGResponse}\u041e\u041a\u0421\u041c\u0422\u0438\u043f" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0444\u0438\u043e"
    })
    public static class \u0421\u0432\u0424\u041b {

        @XmlElement(name = "\u0424\u0418\u041e", required = true)
        protected \u0424\u0418\u041e\u0422\u0438\u043f \u0444\u0438\u043e;
        @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b", required = true)
        protected String \u0438\u043d\u043d\u0444\u043b;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b", required = true)
        protected String \u0434\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b;
        @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e", required = true)
        protected String \u043a\u043e\u0434\u041d\u041e;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e", required = true)
        protected String \u043d\u0430\u0438\u043c\u041d\u041e;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", required = true)
        protected String \u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434;
        @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b", required = true)
        protected String \u043a\u043e\u0434\u0421\u0442\u0440\u0430\u043d\u044b;

        /**
         * Gets the value of the \u0444\u0438\u043e property.
         * 
         * @return
         *     possible object is
         *     {@link \u0424\u0418\u041e\u0422\u0438\u043f }
         *     
         */
        public \u0424\u0418\u041e\u0422\u0438\u043f get\u0424\u0418\u041e() {
            return \u0444\u0438\u043e;
        }

        /**
         * Sets the value of the \u0444\u0438\u043e property.
         * 
         * @param value
         *     allowed object is
         *     {@link \u0424\u0418\u041e\u0422\u0438\u043f }
         *     
         */
        public void set\u0424\u0418\u041e(\u0424\u0418\u041e\u0422\u0438\u043f value) {
            this.\u0444\u0438\u043e = value;
        }

        /**
         * Gets the value of the \u0438\u043d\u043d\u0444\u043b property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0418\u041d\u041d\u0424\u041b() {
            return \u0438\u043d\u043d\u0444\u043b;
        }

        /**
         * Sets the value of the \u0438\u043d\u043d\u0444\u043b property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0418\u041d\u041d\u0424\u041b(String value) {
            this.\u0438\u043d\u043d\u0444\u043b = value;
        }

        /**
         * Gets the value of the \u0434\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0414\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b() {
            return \u0434\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b;
        }

        /**
         * Sets the value of the \u0434\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0414\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b(String value) {
            this.\u0434\u0430\u0442\u0430\u0418\u041d\u041d\u0424\u041b = value;
        }

        /**
         * Gets the value of the \u043a\u043e\u0434\u041d\u041e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041a\u043e\u0434\u041d\u041e() {
            return \u043a\u043e\u0434\u041d\u041e;
        }

        /**
         * Sets the value of the \u043a\u043e\u0434\u041d\u041e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041a\u043e\u0434\u041d\u041e(String value) {
            this.\u043a\u043e\u0434\u041d\u041e = value;
        }

        /**
         * Gets the value of the \u043d\u0430\u0438\u043c\u041d\u041e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041d\u0430\u0438\u043c\u041d\u041e() {
            return \u043d\u0430\u0438\u043c\u041d\u041e;
        }

        /**
         * Sets the value of the \u043d\u0430\u0438\u043c\u041d\u041e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041d\u0430\u0438\u043c\u041d\u041e(String value) {
            this.\u043d\u0430\u0438\u043c\u041d\u041e = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="\u041a\u043e\u0434\u041e\u0431\u0440" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="2"/>
     *             &lt;enumeration value="19"/>
     *             &lt;enumeration value="23"/>
     *             &lt;enumeration value="52"/>
     *             &lt;enumeration value="82"/>
     *             &lt;enumeration value="83"/>
     *             &lt;enumeration value="89"/>
     *             &lt;enumeration value="99"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="\u0422\u0435\u043a\u0441\u0442\u041e\u0448">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="500"/>
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
    public static class \u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 {

        @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u0431\u0440", required = true)
        protected String \u043a\u043e\u0434\u041e\u0431\u0440;
        @XmlAttribute(name = "\u0422\u0435\u043a\u0441\u0442\u041e\u0448")
        protected String \u0442\u0435\u043a\u0441\u0442\u041e\u0448;

        /**
         * Gets the value of the \u043a\u043e\u0434\u041e\u0431\u0440 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u041a\u043e\u0434\u041e\u0431\u0440() {
            return \u043a\u043e\u0434\u041e\u0431\u0440;
        }

        /**
         * Sets the value of the \u043a\u043e\u0434\u041e\u0431\u0440 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u041a\u043e\u0434\u041e\u0431\u0440(String value) {
            this.\u043a\u043e\u0434\u041e\u0431\u0440 = value;
        }

        /**
         * Gets the value of the \u0442\u0435\u043a\u0441\u0442\u041e\u0448 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0422\u0435\u043a\u0441\u0442\u041e\u0448() {
            return \u0442\u0435\u043a\u0441\u0442\u041e\u0448;
        }

        /**
         * Sets the value of the \u0442\u0435\u043a\u0441\u0442\u041e\u0448 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0422\u0435\u043a\u0441\u0442\u041e\u0448(String value) {
            this.\u0442\u0435\u043a\u0441\u0442\u041e\u0448 = value;
        }

    }

}
