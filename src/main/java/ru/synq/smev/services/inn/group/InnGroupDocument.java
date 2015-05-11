
package ru.synq.smev.services.inn.group;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import ru.synq.smev.services.inn.InnNamingStrategy;
import ru.synq.smev.services.inn.InnDocument;
import ru.synq.smev.services.inn.individual.InnIndividualDocument;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;
import java.util.List;

@JsonNaming(InnNamingStrategy.class)
public class InnGroupDocument extends InnDocument {

    @XmlElement(name = "\u0421\u0432\u042e\u041b", required = true)
    @NotNull @Valid
    protected InnGroupDocument.СвЮЛ СвЮЛ;
    @XmlElement(name = "\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
    @NotNull @Valid
    protected List<InnGroupDocument.Запрос> Запрос;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String ВерсФорм = "4.01";
    @XmlAttribute(name = "ИдПакетЗапрос")
    protected String ИдПакетЗапрос;

    public InnGroupDocument() {
    }

    public InnGroupDocument(String id) {
        ИдПакетЗапрос = id;
    }

    public String getИдПакетЗапрос() {
        return ИдПакетЗапрос;
    }

    public void setИдПакетЗапрос(String идПакетЗапрос) {
        ИдПакетЗапрос = идПакетЗапрос;
    }

    public InnGroupDocument.СвЮЛ getСвЮЛ() {
        return СвЮЛ;
    }

    public void setСвЮЛ(InnGroupDocument.СвЮЛ свЮЛ) {
        СвЮЛ = свЮЛ;
    }

    public List<Запрос> getЗапрос() {
        return Запрос;
    }

    public void setЗапрос(List<Запрос> запрос) {
        this.Запрос = запрос;
    }

    public String getВерсФорм() {
        return ВерсФорм;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @JsonNaming(InnNamingStrategy.class)
    public static class Запрос {

        @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
        @NotNull @Valid
        protected InnGroupDocument.Запрос.СвФЛ СвФЛ;
        @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
        protected String index;

        public Запрос.СвФЛ getСвФЛ() {
            return СвФЛ;
        }

        public void setСвФЛ(Запрос.СвФЛ свФЛ) {
            СвФЛ = свФЛ;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @JsonNaming(InnNamingStrategy.class)
        public static class СвФЛ {

            @XmlElement(name = "ФИО", required = true)
            @NotNull @Valid
            protected ru.synq.smev.services.inn.individual.ФИОТип ФИО;
            @XmlElement(name = "УдЛичнФЛ", required = true)
            @NotNull @Valid
            protected InnIndividualDocument.СвФЛ.УдЛичнФЛ УдЛичнФЛ;
            @XmlAttribute(name = "ДатаРожд", required = true)
            @NotNull @Pattern(regexp = "^(\\d{2}\\.){2}\\d{4}$", message = "Дата в формате ДД.ММ.ГГГГ")
            protected String ДатаРожд;
            @XmlAttribute(name = "МестоРожд")
            @Size(max = 255)
            protected String МестоРожд;

            public String getДатаРожд() {
                return ДатаРожд;
            }

            public void setДатаРожд(String датаРожд) {
                ДатаРожд = датаРожд;
            }

            public ru.synq.smev.services.inn.individual.ФИОТип getФИО() {
                return ФИО;
            }

            public void setФИО(ru.synq.smev.services.inn.individual.ФИОТип ФИО) {
                this.ФИО = ФИО;
            }

            public InnIndividualDocument.СвФЛ.УдЛичнФЛ getУдЛичнФЛ() {
                return УдЛичнФЛ;
            }

            public void setУдЛичнФЛ(InnIndividualDocument.СвФЛ.УдЛичнФЛ удЛичнФЛ) {
                УдЛичнФЛ = удЛичнФЛ;
            }

            public String getМестоРожд() {
                return МестоРожд;
            }

            public void setМестоРожд(String местоРожд) {
                МестоРожд = местоРожд;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @JsonNaming(InnNamingStrategy.class)
            public static class УдЛичнФЛ {
                @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a", required = true)
                @NotNull @Size(min = 2, max = 2)
                protected String кодВидДок;
                @XmlAttribute(name = "\u0421\u0435\u0440\u041d\u043e\u043c\u0414\u043e\u043a", required = true)
                @NotNull @Size(max = 25)
                protected String серНомДок;
                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
                @Pattern(regexp = "^(\\d{2}\\.){2}\\d{4}$", message = "Дата в формате ДД.ММ.ГГГГ")
                protected String датаДок;
                @XmlAttribute(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
                @Size(max = 255)
                protected String выдДок;
                @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
                @Size(min = 7, max = 7)
                protected String кодВыдДок;

                public String getКодВидДок() {
                    return кодВидДок;
                }

                public void setКодВидДок(String кодВидДок) {
                    this.кодВидДок = кодВидДок;
                }

                public String getСерНомДок() {
                    return серНомДок;
                }

                public void setСерНомДок(String серНомДок) {
                    this.серНомДок = серНомДок;
                }

                public String getДатаДок() {
                    return датаДок;
                }

                public void setДатаДок(String датаДок) {
                    this.датаДок = датаДок;
                }

                public String getВыдДок() {
                    return выдДок;
                }

                public void setВыдДок(String выдДок) {
                    this.выдДок = выдДок;
                }

                public String getКодВыдДок() {
                    return кодВыдДок;
                }

                public void setКодВыдДок(String кодВыдДок) {
                    this.кодВыдДок = кодВыдДок;
                }
            }
        }
    }

    @JsonNaming(InnNamingStrategy.class)
    public static class СвЮЛ extends InnIndividualDocument.СвЮЛ {}

}
