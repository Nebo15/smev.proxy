
package ru.synq.smev.services.inn.group.query;

import ru.gosuslugi.smev.rev111111.MessageType;
import ru.synq.smev.services.inn.group.InnGroupAppData;
import ru.synq.smev.services.inn.group.InnGroupMessageData;
import ru.synq.smev.services.inn.group.InnGroupRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INNFLGR", namespace = "http://smev.gosuslugi.ru/rev111111", propOrder = {
        "message",
        "messageData"
})
public class InnGroupQueryRequest implements InnGroupRequest
{
    @XmlElement(name = "Message", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnGroupQueryMessageData messageData;

    public MessageType getMessage() {
        return message;
    }

    @Override
    public void setMessageData(InnGroupMessageData value) {
        setMessageData((InnGroupQueryMessageData) value);
    }

    public void setMessage(MessageType value) {
        this.message = value;
    }

    @Override
    public InnGroupMessageData createMessageData() {
        return new InnGroupQueryMessageData();
    }

    @Override
    public InnGroupAppData createAppData() {
        return new InnGroupQueryAppData();
    }

    public InnGroupQueryMessageData getMessageData() {
        return messageData;
    }

    public void setMessageData(InnGroupQueryMessageData value) {
        this.messageData = value;
    }
}
