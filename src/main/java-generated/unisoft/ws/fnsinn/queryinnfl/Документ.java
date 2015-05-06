
package unisoft.ws.fnsinn.queryinnfl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="СвЮЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="НаимОрг" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ИННЮЛ" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}ИННЮЛТип" />
 *                 &lt;attribute name="ОГРН" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}ОГРНТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвФЛ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ФИО" type="{http://ws.unisoft/FNSINN/queryINNFL}ФИОТип"/>
 *                   &lt;element name="УдЛичнФЛ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодВидДок" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://ws.unisoft/FNSINN/queryINNFL}СПДУЛТип">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СерНомДок" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}СПДУЛШТип" />
 *                           &lt;attribute name="ДатаДок" type="{http://ws.unisoft/FNSINN/queryINNFL}ДатаТип" />
 *                           &lt;attribute name="ВыдДок">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="КодВыдДок">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="7"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаРожд" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}ДатаТип" />
 *                 &lt;attribute name="МестоРожд">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ВерсФорм" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="5"/>
 *             &lt;enumeration value="4.01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ИдЗапрос" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="36"/>
 *             &lt;minLength value="1"/>
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
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u042e\u041b",
    "\u0441\u0432\u0424\u041b"
})
@XmlRootElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442")
public class Документ {

    @XmlElement(name = "\u0421\u0432\u042e\u041b", required = true)
    protected Документ.СвЮЛ свЮЛ;
    @XmlElement(name = "\u0421\u0432\u0424\u041b", required = true)
    protected Документ.СвФЛ свФЛ;
    @XmlAttribute(name = "\u0412\u0435\u0440\u0441\u0424\u043e\u0440\u043c", required = true)
    protected String версФорм;
    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f\u0440\u043e\u0441", required = true)
    protected String идЗапрос;

    /**
     * Gets the value of the свЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link Документ.СвЮЛ }
     *     
     */
    public Документ.СвЮЛ getСвЮЛ() {
        return свЮЛ;
    }

    /**
     * Sets the value of the свЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Документ.СвЮЛ }
     *     
     */
    public void setСвЮЛ(Документ.СвЮЛ value) {
        this.свЮЛ = value;
    }

    /**
     * Gets the value of the свФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link Документ.СвФЛ }
     *     
     */
    public Документ.СвФЛ getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Документ.СвФЛ }
     *     
     */
    public void setСвФЛ(Документ.СвФЛ value) {
        this.свФЛ = value;
    }

    /**
     * Gets the value of the версФорм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВерсФорм() {
        return версФорм;
    }

    /**
     * Sets the value of the версФорм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВерсФорм(String value) {
        this.версФорм = value;
    }

    /**
     * Gets the value of the идЗапрос property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИдЗапрос() {
        return идЗапрос;
    }

    /**
     * Sets the value of the идЗапрос property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИдЗапрос(String value) {
        this.идЗапрос = value;
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
     *       &lt;sequence>
     *         &lt;element name="ФИО" type="{http://ws.unisoft/FNSINN/queryINNFL}ФИОТип"/>
     *         &lt;element name="УдЛичнФЛ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодВидДок" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://ws.unisoft/FNSINN/queryINNFL}СПДУЛТип">
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="СерНомДок" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}СПДУЛШТип" />
     *                 &lt;attribute name="ДатаДок" type="{http://ws.unisoft/FNSINN/queryINNFL}ДатаТип" />
     *                 &lt;attribute name="ВыдДок">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="255"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="КодВыдДок">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="7"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаРожд" use="required" type="{http://ws.unisoft/FNSINN/queryINNFL}ДатаТип" />
     *       &lt;attribute name="МестоРожд">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="255"/>
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
    @XmlType(name = "", propOrder = {
        "\u0444\u0438\u043e",
        "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b"
    })
    public static class СвФЛ {

        @XmlElement(name = "\u0424\u0418\u041e", required = true)
        protected ФИОТип фио;
        @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b", required = true)
        protected Документ.СвФЛ.УдЛичнФЛ удЛичнФЛ;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", required = true)
        protected String датаРожд;
        @XmlAttribute(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434")
        protected String местоРожд;

        /**
         * Gets the value of the фио property.
         * 
         * @return
         *     possible object is
         *     {@link ФИОТип }
         *     
         */
        public ФИОТип getФИО() {
            return фио;
        }

        /**
         * Sets the value of the фио property.
         * 
         * @param value
         *     allowed object is
         *     {@link ФИОТип }
         *     
         */
        public void setФИО(ФИОТип value) {
            this.фио = value;
        }

        /**
         * Gets the value of the удЛичнФЛ property.
         * 
         * @return
         *     possible object is
         *     {@link Документ.СвФЛ.УдЛичнФЛ }
         *     
         */
        public Документ.СвФЛ.УдЛичнФЛ getУдЛичнФЛ() {
            return удЛичнФЛ;
        }

        /**
         * Sets the value of the удЛичнФЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link Документ.СвФЛ.УдЛичнФЛ }
         *     
         */
        public void setУдЛичнФЛ(Документ.СвФЛ.УдЛичнФЛ value) {
            this.удЛичнФЛ = value;
        }

        /**
         * Gets the value of the датаРожд property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getДатаРожд() {
            return датаРожд;
        }

        /**
         * Sets the value of the датаРожд property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setДатаРожд(String value) {
            this.датаРожд = value;
        }

        /**
         * Gets the value of the местоРожд property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getМестоРожд() {
            return местоРожд;
        }

        /**
         * Sets the value of the местоРожд property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setМестоРожд(String value) {
            this.местоРожд = value;
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
        public static class УдЛичнФЛ {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a", required = true)
            protected String кодВидДок;
            @XmlAttribute(name = "\u0421\u0435\u0440\u041d\u043e\u043c\u0414\u043e\u043a", required = true)
            protected String серНомДок;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
            protected String датаДок;
            @XmlAttribute(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
            protected String выдДок;
            @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
            protected String кодВыдДок;

            /**
             * Gets the value of the кодВидДок property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодВидДок() {
                return кодВидДок;
            }

            /**
             * Sets the value of the кодВидДок property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодВидДок(String value) {
                this.кодВидДок = value;
            }

            /**
             * Gets the value of the серНомДок property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСерНомДок() {
                return серНомДок;
            }

            /**
             * Sets the value of the серНомДок property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСерНомДок(String value) {
                this.серНомДок = value;
            }

            /**
             * Gets the value of the датаДок property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДатаДок() {
                return датаДок;
            }

            /**
             * Sets the value of the датаДок property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДатаДок(String value) {
                this.датаДок = value;
            }

            /**
             * Gets the value of the выдДок property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getВыдДок() {
                return выдДок;
            }

            /**
             * Sets the value of the выдДок property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setВыдДок(String value) {
                this.выдДок = value;
            }

            /**
             * Gets the value of the кодВыдДок property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодВыдДок() {
                return кодВыдДок;
            }

            /**
             * Sets the value of the кодВыдДок property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодВыдДок(String value) {
                this.кодВыдДок = value;
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
    public static class СвЮЛ {

        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041e\u0440\u0433", required = true)
        protected String наимОрг;
        @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b", required = true)
        protected String иннюл;
        @XmlAttribute(name = "\u041e\u0413\u0420\u041d", required = true)
        protected String огрн;

        /**
         * Gets the value of the наимОрг property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимОрг() {
            return наимОрг;
        }

        /**
         * Sets the value of the наимОрг property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимОрг(String value) {
            this.наимОрг = value;
        }

        /**
         * Gets the value of the иннюл property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИННЮЛ() {
            return иннюл;
        }

        /**
         * Sets the value of the иннюл property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИННЮЛ(String value) {
            this.иннюл = value;
        }

        /**
         * Gets the value of the огрн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getОГРН() {
            return огрн;
        }

        /**
         * Sets the value of the огрн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setОГРН(String value) {
            this.огрн = value;
        }

    }

}
