
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fms.sx.kernel.webservices.border.basetypes.GetResultResponseMessageType;


/**
 * <p>Java class for getResultResponseMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getResultResponseMessageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}getResultResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResultResponseMessageData", propOrder = {
    "appData"
})
public class GetResultResponseMessageData {

    @XmlElement(name = "AppData")
    protected GetResultResponseMessageType appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link GetResultResponseMessageType }
     *     
     */
    public GetResultResponseMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResultResponseMessageType }
     *     
     */
    public void setAppData(GetResultResponseMessageType value) {
        this.appData = value;
    }

}
