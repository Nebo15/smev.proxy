
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fms.sx.kernel.webservices.border.basetypes.GetDictionaryValuesResponseMessageType;


/**
 * <p>Java class for getDictionaryValuesResponseMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDictionaryValuesResponseMessageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}getDictionaryValuesResponseMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDictionaryValuesResponseMessageData", propOrder = {
    "appData"
})
public class GetDictionaryValuesResponseMessageData {

    @XmlElement(name = "AppData", required = true)
    protected GetDictionaryValuesResponseMessageType appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link GetDictionaryValuesResponseMessageType }
     *     
     */
    public GetDictionaryValuesResponseMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDictionaryValuesResponseMessageType }
     *     
     */
    public void setAppData(GetDictionaryValuesResponseMessageType value) {
        this.appData = value;
    }

}
