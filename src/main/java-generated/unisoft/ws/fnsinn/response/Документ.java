
package unisoft.ws.fnsinn.response;

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
 *         &lt;element name="Ответ" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ИдЗапрос" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;maxLength value="36"/>
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ИННФЛ" type="{http://ws.unisoft/FNSINN/response}ИННФЛТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ВерсФорм" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="4.01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодОбр">
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
    "\u043e\u0442\u0432\u0435\u0442"
})
@XmlRootElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
public class Документ {

    @XmlElement(name = "\u041e\u0442\u0432\u0435\u0442")
    protected List<Документ.Ответ> ответ;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String версФорм;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u0431\u0440")
    protected String кодОбр;

    /**
     * Gets the value of the ответ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ответ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getОтвет().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Документ.Ответ }
     * 
     * 
     */
    public List<Документ.Ответ> getОтвет() {
        if (ответ == null) {
            ответ = new ArrayList<Документ.Ответ>();
        }
        return this.ответ;
    }

    /**
     * Gets the value of the версФорм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсФорм() {
        return версФорм;
    }

    /**
     * Sets the value of the версФорм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсФорм(String value) {
        this.версФорм = value;
    }

    /**
     * Gets the value of the кодОбр property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодОбр() {
        return кодОбр;
    }

    /**
     * Sets the value of the кодОбр property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодОбр(String value) {
        this.кодОбр = value;
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
     *       &lt;attribute name="ИдЗапрос" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;maxLength value="36"/>
     *             &lt;minLength value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ИННФЛ" type="{http://ws.unisoft/FNSINN/response}ИННФЛТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ответ {

        @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
        protected String идЗапрос;
        @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
        protected String иннфл;

        /**
         * Gets the value of the идЗапрос property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдЗапрос() {
            return идЗапрос;
        }

        /**
         * Sets the value of the идЗапрос property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдЗапрос(String value) {
            this.идЗапрос = value;
        }

        /**
         * Gets the value of the иннфл property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИННФЛ() {
            return иннфл;
        }

        /**
         * Sets the value of the иннфл property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИННФЛ(String value) {
            this.иннфл = value;
        }

    }

}
