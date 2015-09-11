
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fms.sx.kernel.webservices.border.basetypes.SendErrorReportResponseMessageType;


/**
 * <p>Java class for sendErrorReportResponseMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendErrorReportResponseMessageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}sendErrorReportResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendErrorReportResponseMessageData", propOrder = {
    "appData"
})
public class SendErrorReportResponseMessageData {

    @XmlElement(name = "AppData")
    protected SendErrorReportResponseMessageType appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link SendErrorReportResponseMessageType }
     *     
     */
    public SendErrorReportResponseMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendErrorReportResponseMessageType }
     *     
     */
    public void setAppData(SendErrorReportResponseMessageType value) {
        this.appData = value;
    }

}
