
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fms.sx.kernel.webservices.border.basetypes.ServiceRequestMessageType;


/**
 * <p>Java class for serviceRequestMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequestMessageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}serviceRequestMessageType" minOccurs="0"/>
 *         &lt;element name="AppDocument" type="{http://smev.gosuslugi.ru/rev111111}AppDocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequestMessageData", propOrder = {
    "appData",
    "appDocument"
})
public class ServiceRequestMessageData {

    @XmlElement(name = "AppData")
    protected ServiceRequestMessageType appData;
    @XmlElement(name = "AppDocument")
    protected AppDocumentType appDocument;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestMessageType }
     *     
     */
    public ServiceRequestMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestMessageType }
     *     
     */
    public void setAppData(ServiceRequestMessageType value) {
        this.appData = value;
    }

    /**
     * Gets the value of the appDocument property.
     * 
     * @return
     *     possible object is
     *     {@link AppDocumentType }
     *     
     */
    public AppDocumentType getAppDocument() {
        return appDocument;
    }

    /**
     * Sets the value of the appDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDocumentType }
     *     
     */
    public void setAppDocument(AppDocumentType value) {
        this.appDocument = value;
    }

}
