
package ru.synq.smev.services.snils;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SnilsAppData {
    @XmlElement(name = "request")
    protected SnilsValidationData request;
    @XmlElement(name = "result", namespace = "http://snils-validation.skmv.rstyle.com")
    protected String result;
    @XmlElement(name = "fault", namespace = "http://pfr.skmv.rstyle.com")
    protected SnilsFaultResult fault;

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

    public SnilsFaultResult getFault() {
        return fault;
    }

    public void setFault(SnilsFaultResult fault) {
        this.fault = fault;
    }
}
