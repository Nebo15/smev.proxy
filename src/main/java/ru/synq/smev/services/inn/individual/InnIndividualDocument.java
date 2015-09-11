
package ru.synq.smev.services.inn.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import ru.synq.smev.services.inn.InnNamingStrategy;
import ru.synq.smev.services.inn.InnDocument;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;

@JsonNaming(InnNamingStrategy.class)
public class InnIndividualDocument extends InnDocument {

    @XmlElement(name = "\u0421\u0432\u042e\u041b", required = true)
    @NotNull @Valid
    protected InnIndividualDocument.СвЮЛ СвЮЛ;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    @NotNull @Valid
    protected InnIndividualDocument.СвФЛ СвФЛ;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String версФорм = "4.01";
    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
    protected String идЗапрос;

    public InnIndividualDocument.СвЮЛ getСвЮЛ() {
        return СвЮЛ;
    }

    public void setСвЮЛ(InnIndividualDocument.СвЮЛ свЮЛ) {
        СвЮЛ = свЮЛ;
    }

    public InnIndividualDocument.СвФЛ getСвФЛ() {
        return СвФЛ;
    }

    public void setСвФЛ(InnIndividualDocument.СвФЛ свФЛ) {
        СвФЛ = свФЛ;
    }

    public String getВерсФорм() {
        return версФорм;
    }

    public void setВерсФорм(String версФорм) {
        this.версФорм = версФорм;
    }

    public String getИдЗапрос() {
        return идЗапрос;
    }

    public void setИдЗапрос(String идЗапрос) {
        this.идЗапрос = идЗапрос;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @JsonNaming(InnNamingStrategy.class)
    public static class СвФЛ {

        @XmlElement(name = "\u0424\u0418\u041e", required = true)
        @NotNull @Valid
        protected ФИОТип ФИО;
        @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b", required = true)
        @NotNull @Valid
        protected InnIndividualDocument.СвФЛ.УдЛичнФЛ УдЛичнФЛ;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", required = true)
        @NotNull @Pattern(regexp = "^(\\d{2}\\.){2}\\d{4}$", message = "Дата в формате ДД.ММ.ГГГГ")
        protected String ДатаРожд;
        @XmlAttribute(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434")
        @Size(max = 255)
        protected String МестоРожд;

        public String getДатаРожд() {
            return ДатаРожд;
        }

        public void setДатаРожд(String датаРожд) {
            ДатаРожд = датаРожд;
        }

        public ФИОТип getФИО() {
            return ФИО;
        }

        public void setФИО(ФИОТип ФИО) {
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

        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="КодВидДок" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://ws.unisoft/FNSINN/queryINNFL}СПДУЛТип">
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="СерНомДок" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}СПДУЛШТип" />
         *       &lt;attribute name="ДатаДок" type="{http://ws.unisoft/FNSINN/queryINNFL}ДатаТип" />
         *       &lt;attribute name="ВыдДок">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="255"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="КодВыдДок">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="7"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="НаимОрг" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ИННЮЛ" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}ИННЮЛТип" />
     *       &lt;attribute name="ОГРН" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}ОГРНТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @JsonNaming(InnNamingStrategy.class)
    public static class СвЮЛ {
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433", required = true)
        @NotNull @Size(max = 1000)
        protected String НаимОрг;
        @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b", required = true)
        @NotNull @Size(min = 10, max = 10)
        @JsonProperty("ИННЮЛ")
        protected String ИННЮЛ;
        @XmlAttribute(name = "\u041e\u0413\u0420\u041d", required = true)
        @NotNull @Size(min = 13, max = 13)
        @JsonProperty("ОГРН")
        protected String ОГРН;

        public String getНаимОрг() {
            return НаимОрг;
        }

        public void setНаимОрг(String наимОрг) {
            НаимОрг = наимОрг;
        }

        public String getИННЮЛ() {
            return ИННЮЛ;
        }

        public void setИННЮЛ(String ИННЮЛ) {
            this.ИННЮЛ = ИННЮЛ;
        }

        public String getОГРН() {
            return ОГРН;
        }

        public void setОГРН(String ОГРН) {
            this.ОГРН = ОГРН;
        }
    }


}
