
package ru.synq.smev.services.inn.bind;

import ru.synq.smev.services.inn.bind.individual.InnIndividualDocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InnAppData")
public class InnAppData {

    @XmlElement(name = "Документ", namespace = "http://smev.gosuslugi.ru/rev111111")
    protected InnIndividualDocument документ;

    public InnIndividualDocument getДокумент() {
        return документ;
    }

    public void setДокумент(InnIndividualDocument документ) {
        this.документ = документ;
    }
}
