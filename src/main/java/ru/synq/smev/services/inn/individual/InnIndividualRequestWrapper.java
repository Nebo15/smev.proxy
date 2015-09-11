
package ru.synq.smev.services.inn.individual;

import org.apache.cxf.databinding.WrapperHelper;
import org.apache.cxf.interceptor.Fault;
import ru.gosuslugi.smev.rev111111.MessageType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INNFL", namespace = "http://smev.gosuslugi.ru/rev111111", propOrder = {
        "message",
        "messageData"
})
public class InnIndividualRequestWrapper implements WrapperHelper
{
    @XmlElement(name = "Message", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true, namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnIndividualMessageData messageData;

    public InnIndividualRequestWrapper() {
    }

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

    @Override
    public Object createWrapperObject(List<?> lst) throws Fault {
        return null;
    }

    @Override
    public List<Object> getWrapperParts(Object o) throws Fault {
        return null;
    }

    @Override
    public String getSignature() {
        return null;
    }
}
