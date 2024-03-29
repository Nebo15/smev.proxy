
package ru.synq.smev.services.inn.group.query;

import ru.synq.smev.services.inn.group.InnGroupAppData;
import ru.synq.smev.services.inn.group.InnGroupDocument;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppData")
public class InnGroupQueryAppData implements InnGroupAppData {

    @XmlElement(name = "Документ", namespace = "http://ws.unisoft/FNSINN/queryINNFLGR")
    protected InnGroupDocument документ;

    public InnGroupDocument getДокумент() {
        return документ;
    }

    public void setДокумент(InnGroupDocument документ) {
        this.документ = документ;
    }
}
