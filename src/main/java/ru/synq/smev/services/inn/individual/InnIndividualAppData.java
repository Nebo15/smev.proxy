
package ru.synq.smev.services.inn.individual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppData")
public class InnIndividualAppData {

    @XmlElement(name = "Документ", namespace = "http://ws.unisoft/FNSINN/queryINNFL")
    protected InnIndividualDocument документ;

    public InnIndividualDocument getДокумент() {
        return документ;
    }

    public void setДокумент(InnIndividualDocument документ) {
        this.документ = документ;
    }
}
