
package ru.synq.smev.services.inn.bind.individual;

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
@XmlType(name = "", propOrder = {
        "message",
        "messageData"
})
public class InnIndividualRequest
{
    @XmlElement(name = "Message", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnIndividualMessageData messageData;

    public MessageType getMessage() {
        return message;
    }

    public void setMessage(MessageType value) {
        this.message = value;
    }

    public InnIndividualMessageData getMessageData() {
        return messageData;
    }

    public void setMessageData(InnIndividualMessageData value) {
        this.messageData = value;
    }

}
