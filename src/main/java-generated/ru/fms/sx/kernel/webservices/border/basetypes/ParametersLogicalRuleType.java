
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersLogicalRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersLogicalRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterFieldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compareOperation" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}logicalRuleOperationType"/>
 *         &lt;element name="compareList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slaveFieldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restriction" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}logicalRuleRestrictionType"/>
 *         &lt;element name="restrictionRegexp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersLogicalRuleType", propOrder = {
    "masterFieldCode",
    "compareOperation",
    "compareList",
    "slaveFieldCode",
    "restriction",
    "restrictionRegexp"
})
public class ParametersLogicalRuleType {

    @XmlElement(required = true)
    protected String masterFieldCode;
    @XmlElement(required = true)
    protected LogicalRuleOperationType compareOperation;
    @XmlElement(required = true)
    protected String compareList;
    @XmlElement(required = true)
    protected String slaveFieldCode;
    @XmlElement(required = true)
    protected LogicalRuleRestrictionType restriction;
    @XmlElementRef(name = "restrictionRegexp", namespace = "http://baseTypes.border.webservices.kernel.sx.fms.ru", type = JAXBElement.class)
    protected JAXBElement<String> restrictionRegexp;

    /**
     * Gets the value of the masterFieldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterFieldCode() {
        return masterFieldCode;
    }

    /**
     * Sets the value of the masterFieldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterFieldCode(String value) {
        this.masterFieldCode = value;
    }

    /**
     * Gets the value of the compareOperation property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalRuleOperationType }
     *     
     */
    public LogicalRuleOperationType getCompareOperation() {
        return compareOperation;
    }

    /**
     * Sets the value of the compareOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalRuleOperationType }
     *     
     */
    public void setCompareOperation(LogicalRuleOperationType value) {
        this.compareOperation = value;
    }

    /**
     * Gets the value of the compareList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareList() {
        return compareList;
    }

    /**
     * Sets the value of the compareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareList(String value) {
        this.compareList = value;
    }

    /**
     * Gets the value of the slaveFieldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlaveFieldCode() {
        return slaveFieldCode;
    }

    /**
     * Sets the value of the slaveFieldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlaveFieldCode(String value) {
        this.slaveFieldCode = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalRuleRestrictionType }
     *     
     */
    public LogicalRuleRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalRuleRestrictionType }
     *     
     */
    public void setRestriction(LogicalRuleRestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the restrictionRegexp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictionRegexp() {
        return restrictionRegexp;
    }

    /**
     * Sets the value of the restrictionRegexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictionRegexp(JAXBElement<String> value) {
        this.restrictionRegexp = ((JAXBElement<String> ) value);
    }

}
