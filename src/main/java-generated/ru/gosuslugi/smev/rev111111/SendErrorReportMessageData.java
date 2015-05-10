
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fms.sx.kernel.webservices.border.basetypes.SendErrorReportMessageType;


/**
 * <p>Java class for sendErrorReportMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendErrorReportMessageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}sendErrorReportMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendErrorReportMessageData", propOrder = {
    "appData"
})
public class SendErrorReportMessageData {

    @XmlElement(name = "AppData")
    protected SendErrorReportMessageType appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link SendErrorReportMessageType }
     *     
     */
    public SendErrorReportMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendErrorReportMessageType }
     *     
     */
    public void setAppData(SendErrorReportMessageType value) {
        this.appData = value;
    }

}
