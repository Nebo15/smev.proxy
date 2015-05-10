
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.fms.sx.kernel.webservices.border.basetypes.ProcessTaskResponseMessageType;


/**
 * <p>Java class for processTaskResponseMessageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processTaskResponseMessageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppData" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}processTaskResponseMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processTaskResponseMessageData", propOrder = {
    "appData"
})
public class ProcessTaskResponseMessageData {

    @XmlElement(name = "AppData")
    protected ProcessTaskResponseMessageType appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTaskResponseMessageType }
     *     
     */
    public ProcessTaskResponseMessageType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTaskResponseMessageType }
     *     
     */
    public void setAppData(ProcessTaskResponseMessageType value) {
        this.appData = value;
    }

}
