
package ru.synq.smev.services.snils;

import ru.gosuslugi.smev.rev120315.MessageType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnilsValidationRequestType", propOrder = {
        "message",
        "messageData"
})
public class SnilsBaseMessage
{
    @XmlElement(name = "Message", required = true, namespace = "http://smev.gosuslugi.ru/rev120315")
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = "http://smev.gosuslugi.ru/rev120315")
    protected SnilsMessageData messageData;

    public MessageType getMessage() {
        return message;
    }

    public void setMessage(MessageType value) {
        this.message = value;
    }

    public SnilsMessageData getMessageData() {
        return messageData;
    }

    public void setMessageData(SnilsMessageData value) {
        this.messageData = value;
    }

}
