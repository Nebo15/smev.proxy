
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersDateRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersDateRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetDateFieldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}dateRestrictionModeType"/>
 *         &lt;choice>
 *           &lt;element name="restrictionDateFieldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="restrictionDateValue" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}dateRestrictionValueType"/>
 *         &lt;/choice>
 *         &lt;element name="compareOperation" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}dateCompareOperationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersDateRuleType", propOrder = {
    "targetDateFieldCode",
    "mode",
    "restrictionDateFieldCode",
    "restrictionDateValue",
    "compareOperation"
})
public class ParametersDateRuleType {

    @XmlElement(required = true)
    protected String targetDateFieldCode;
    @XmlElement(required = true)
    protected DateRestrictionModeType mode;
    protected String restrictionDateFieldCode;
    protected DateRestrictionValueType restrictionDateValue;
    @XmlElement(required = true)
    protected DateCompareOperationType compareOperation;

    /**
     * Gets the value of the targetDateFieldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDateFieldCode() {
        return targetDateFieldCode;
    }

    /**
     * Sets the value of the targetDateFieldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDateFieldCode(String value) {
        this.targetDateFieldCode = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link DateRestrictionModeType }
     *     
     */
    public DateRestrictionModeType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRestrictionModeType }
     *     
     */
    public void setMode(DateRestrictionModeType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the restrictionDateFieldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionDateFieldCode() {
        return restrictionDateFieldCode;
    }

    /**
     * Sets the value of the restrictionDateFieldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionDateFieldCode(String value) {
        this.restrictionDateFieldCode = value;
    }

    /**
     * Gets the value of the restrictionDateValue property.
     * 
     * @return
     *     possible object is
     *     {@link DateRestrictionValueType }
     *     
     */
    public DateRestrictionValueType getRestrictionDateValue() {
        return restrictionDateValue;
    }

    /**
     * Sets the value of the restrictionDateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRestrictionValueType }
     *     
     */
    public void setRestrictionDateValue(DateRestrictionValueType value) {
        this.restrictionDateValue = value;
    }

    /**
     * Gets the value of the compareOperation property.
     * 
     * @return
     *     possible object is
     *     {@link DateCompareOperationType }
     *     
     */
    public DateCompareOperationType getCompareOperation() {
        return compareOperation;
    }

    /**
     * Sets the value of the compareOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCompareOperationType }
     *     
     */
    public void setCompareOperation(DateCompareOperationType value) {
        this.compareOperation = value;
    }

}
