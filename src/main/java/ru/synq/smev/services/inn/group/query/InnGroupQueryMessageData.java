
package ru.synq.smev.services.inn.group.query;

import ru.synq.smev.services.inn.group.InnGroupAppData;
import ru.synq.smev.services.inn.group.InnGroupMessageData;

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
public class InnGroupQueryMessageData implements InnGroupMessageData {

    @XmlElement(name = "AppData", namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnGroupQueryAppData appData;

    /**
     * Gets the value of the appData property.
     *
     * @return
     *     possible object is
     *     {@link InnGroupQueryAppData }
     *
     */
    public InnGroupQueryAppData getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     *
     * @param value
     *     allowed object is
     *     {@link InnGroupQueryAppData }
     *
     */
    public void setAppData(InnGroupQueryAppData value) {
        this.appData = value;
    }

    @Override
    public void setAppData(InnGroupAppData appData) {
        setAppData((InnGroupQueryAppData) appData);
    }
}
