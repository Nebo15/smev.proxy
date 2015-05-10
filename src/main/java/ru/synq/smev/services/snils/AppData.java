
package ru.synq.smev.services.snils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppData")
public class AppData {
    @XmlElement(name = "request")
    protected SnilsData request;

    public SnilsData getRequest() {
        return request;
    }

    public void setRequest(SnilsData request) {
        this.request = request;
    }
}
