
package ru.synq.smev.services.snils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnilsAppData")
public class SnilsAppData {
    @XmlElement(name = "request")
    protected SnilsValidationData request;
    @XmlElement(name = "result", namespace = "http://snils-validation.skmv.rstyle.com")
    protected String result;

    public SnilsValidationData getRequest() {
        return request;
    }

    public void setRequest(SnilsValidationData request) {
        this.request = request;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
