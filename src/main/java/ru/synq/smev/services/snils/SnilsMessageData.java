
package ru.synq.smev.services.snils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnilsMessageData")
public class SnilsMessageData {
    @XmlElement(name = "AppData")
    protected SnilsAppData appData;

    public SnilsAppData getAppData() {
        return appData;
    }

    public void setAppData(SnilsAppData value) {
        this.appData = value;
    }
}
