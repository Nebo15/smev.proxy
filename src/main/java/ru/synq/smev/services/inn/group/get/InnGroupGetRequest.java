
package ru.synq.smev.services.inn.group.get;

import ru.gosuslugi.smev.rev111111.MessageType;
import ru.synq.smev.services.inn.group.InnGroupAppData;
import ru.synq.smev.services.inn.group.InnGroupMessageData;
import ru.synq.smev.services.inn.group.InnGroupRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZPINNFLGR", namespace = "http://smev.gosuslugi.ru/rev111111", propOrder = {
        "message",
        "messageData"
})
public class InnGroupGetRequest implements InnGroupRequest {
    @XmlElement(name = "Message", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnGroupGetMessageData messageData;

    public MessageType getMessage() {
        return message;
    }

    @Override
    public void setMessageData(InnGroupMessageData value) {
        setMessageData((InnGroupGetMessageData) value);
    }

    public void setMessage(MessageType value) {
        this.message = value;
    }

    @Override
    public InnGroupMessageData createMessageData() {
        return new InnGroupGetMessageData();
    }

    @Override
    public InnGroupAppData createAppData() {
        return new InnGroupGetAppData();
    }

    public InnGroupGetMessageData getMessageData() {
        return messageData;
    }

    public void setMessageData(InnGroupGetMessageData value) {
        this.messageData = value;
    }

}
