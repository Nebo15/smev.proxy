
package unisoft.ws.sendsvfmsigresponse;

import java.math.BigInteger;
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
 *         &lt;element name="\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="\u0418\u0434\u041e\u0448" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="\u041a\u043e\u0434\u041e\u0431\u0440" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
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
    "\u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424",
    "\u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431"
})
@XmlRootElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
public class \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 {

    @XmlElement(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424")
    protected BigInteger \u0438\u0434\u0417\u0430\u043f\u0440\u043e\u0441\u0424;
    @XmlElement(name = "\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431")
    protected \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442.\u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 \u0441\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String \u0432\u0435\u0440\u0441\u0424\u043e\u0440\u043c;

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
     *         &lt;element name="\u0418\u0434\u041e\u0448" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="\u041a\u043e\u0434\u041e\u0431\u0440" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="2"/>
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
        "\u0438\u0434\u041e\u0448"
    })
    public static class \u0421\u0432\u0435\u0434\u041e\u0431\u0440\u0430\u0431 {

        @XmlElement(name = "\u0418\u0434\u041e\u0448")
        protected String \u0438\u0434\u041e\u0448;
        @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u0431\u0440", required = true)
        protected String \u043a\u043e\u0434\u041e\u0431\u0440;

        /**
         * Gets the value of the \u0438\u0434\u041e\u0448 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get\u0418\u0434\u041e\u0448() {
            return \u0438\u0434\u041e\u0448;
        }

        /**
         * Sets the value of the \u0438\u0434\u041e\u0448 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set\u0418\u0434\u041e\u0448(String value) {
            this.\u0438\u0434\u041e\u0448 = value;
        }

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

    }

}
