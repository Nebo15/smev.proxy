
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendErrorReportResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendErrorReportResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev111111}Message"/>
 *         &lt;element name="MessageData" type="{http://smev.gosuslugi.ru/rev111111}sendErrorReportResponseMessageData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendErrorReportResponseMessage", propOrder = {
    "message",
    "messageData"
})
public class SendErrorReportResponseMessage {

    @XmlElement(name = "Message", required = true)
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true)
    protected SendErrorReportResponseMessageData messageData;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
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
     *     {@link MessageType }
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
     *     {@link SendErrorReportResponseMessageData }
     *     
     */
    public SendErrorReportResponseMessageData getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendErrorReportResponseMessageData }
     *     
     */
    public void setMessageData(SendErrorReportResponseMessageData value) {
        this.messageData = value;
    }

}
