
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activeVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomingParameters" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}taskParameterDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outgoingParameters" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}taskParameterDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="incomingParametersRules" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service", propOrder = {
    "code",
    "activeVersion",
    "name",
    "incomingParameters",
    "outgoingParameters",
    "incomingParametersRules"
})
public class Service {

    protected String code;
    protected String activeVersion;
    protected String name;
    @XmlElement(nillable = true)
    protected List<TaskParameterDefinition> incomingParameters;
    @XmlElement(nillable = true)
    protected List<TaskParameterDefinition> outgoingParameters;
    @XmlElementRef(name = "incomingParametersRules", namespace = "http://baseTypes.border.webservices.kernel.sx.fms.ru", type = JAXBElement.class)
    protected JAXBElement<ParametersRulesType> incomingParametersRules;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the activeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveVersion() {
        return activeVersion;
    }

    /**
     * Sets the value of the activeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveVersion(String value) {
        this.activeVersion = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the incomingParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskParameterDefinition }
     * 
     * 
     */
    public List<TaskParameterDefinition> getIncomingParameters() {
        if (incomingParameters == null) {
            incomingParameters = new ArrayList<TaskParameterDefinition>();
        }
        return this.incomingParameters;
    }

    /**
     * Gets the value of the outgoingParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outgoingParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutgoingParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskParameterDefinition }
     * 
     * 
     */
    public List<TaskParameterDefinition> getOutgoingParameters() {
        if (outgoingParameters == null) {
            outgoingParameters = new ArrayList<TaskParameterDefinition>();
        }
        return this.outgoingParameters;
    }

    /**
     * Gets the value of the incomingParametersRules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParametersRulesType }{@code >}
     *     
     */
    public JAXBElement<ParametersRulesType> getIncomingParametersRules() {
        return incomingParametersRules;
    }

    /**
     * Sets the value of the incomingParametersRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParametersRulesType }{@code >}
     *     
     */
    public void setIncomingParametersRules(JAXBElement<ParametersRulesType> value) {
        this.incomingParametersRules = ((JAXBElement<ParametersRulesType> ) value);
    }

}
