
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDictionaryValuesMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDictionaryValuesMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseRequestMessageType">
 *       &lt;sequence>
 *         &lt;element name="dictionaryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDictionaryValuesMessageType", propOrder = {
    "dictionaryCode"
})
public class GetDictionaryValuesMessageType
    extends BaseRequestMessageType
{

    @XmlElement(required = true)
    protected String dictionaryCode;

    /**
     * Gets the value of the dictionaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryCode() {
        return dictionaryCode;
    }

    /**
     * Sets the value of the dictionaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryCode(String value) {
        this.dictionaryCode = value;
    }

}
