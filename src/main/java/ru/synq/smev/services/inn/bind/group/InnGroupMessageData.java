
package ru.synq.smev.services.inn.bind.group;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev111111}AppData" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev111111}AppDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageData")
public class InnGroupMessageData {

    @XmlElement(name = "AppData", namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnGroupAppData appData;

    /**
     * Gets the value of the appData property.
     *
     * @return
     *     possible object is
     *     {@link InnGroupAppData }
     *
     */
    public InnGroupAppData getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     *
     * @param value
     *     allowed object is
     *     {@link InnGroupAppData }
     *
     */
    public void setAppData(InnGroupAppData value) {
        this.appData = value;
    }
}
