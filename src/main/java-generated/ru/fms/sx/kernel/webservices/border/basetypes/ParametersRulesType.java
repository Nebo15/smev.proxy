
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logicalRules" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersLogicalRulesType" minOccurs="0"/>
 *         &lt;element name="variativeRules" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersVariativeRulesType" minOccurs="0"/>
 *         &lt;element name="dateRules" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersDateRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersRulesType", propOrder = {
    "logicalRules",
    "variativeRules",
    "dateRules"
})
public class ParametersRulesType {

    protected ParametersLogicalRulesType logicalRules;
    protected ParametersVariativeRulesType variativeRules;
    protected ParametersDateRulesType dateRules;

    /**
     * Gets the value of the logicalRules property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersLogicalRulesType }
     *     
     */
    public ParametersLogicalRulesType getLogicalRules() {
        return logicalRules;
    }

    /**
     * Sets the value of the logicalRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersLogicalRulesType }
     *     
     */
    public void setLogicalRules(ParametersLogicalRulesType value) {
        this.logicalRules = value;
    }

    /**
     * Gets the value of the variativeRules property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersVariativeRulesType }
     *     
     */
    public ParametersVariativeRulesType getVariativeRules() {
        return variativeRules;
    }

    /**
     * Sets the value of the variativeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersVariativeRulesType }
     *     
     */
    public void setVariativeRules(ParametersVariativeRulesType value) {
        this.variativeRules = value;
    }

    /**
     * Gets the value of the dateRules property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersDateRulesType }
     *     
     */
    public ParametersDateRulesType getDateRules() {
        return dateRules;
    }

    /**
     * Sets the value of the dateRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersDateRulesType }
     *     
     */
    public void setDateRules(ParametersDateRulesType value) {
        this.dateRules = value;
    }

}
