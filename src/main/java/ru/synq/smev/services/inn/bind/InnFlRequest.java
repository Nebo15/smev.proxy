
package ru.synq.smev.services.inn.bind;

import ru.gosuslugi.smev.rev111111.MessageType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INNFL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INNFL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://smev.gosuslugi.ru/rev111111}BaseMessageType">
 *       &lt;sequence>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev111111}Message"/>
 *         &lt;element name="MessageData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev111111}MessageDataType">
 *                 &lt;sequence>
 *                   &lt;element name="AppData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://smev.gosuslugi.ru/rev111111}AppDataType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://ws.unisoft/FNSINN/queryINNFL}Документ"/>
 *                           &lt;/sequence>
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev111111}AppDocument" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InnFlRequest", propOrder = {
        "message",
        "messageData"
})
public class InnFlRequest
{
    @XmlElement(name = "Message", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnMessageData messageData;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link ru.gosuslugi.smev.rev111111.MessageType }
     *
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link ru.gosuslugi.smev.rev111111.MessageType }
     *
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageData property.
     *
     * @return
     *     possible object is
     *     {@link InnMessageData }
     *
     */
    public InnMessageData getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     *
     * @param value
     *     allowed object is
     *     {@link InnMessageData }
     *
     */
    public void setMessageData(InnMessageData value) {
        this.messageData = value;
    }

}
