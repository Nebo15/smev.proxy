
package ru.synq.smev.services.snils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageData")
public class MessageData {
    @XmlElement(name = "AppData")
    protected AppData appData;

    public AppData getAppData() {
        return appData;
    }

    public void setAppData(AppData value) {
        this.appData = value;
    }
}
