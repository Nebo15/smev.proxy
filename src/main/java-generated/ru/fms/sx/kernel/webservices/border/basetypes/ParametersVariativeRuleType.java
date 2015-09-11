
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersVariativeRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersVariativeRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}variativeRuleOperationType"/>
 *         &lt;element name="block" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}fieldsBlockType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersVariativeRuleType", propOrder = {
    "operation",
    "block"
})
public class ParametersVariativeRuleType {

    @XmlElement(required = true)
    protected VariativeRuleOperationType operation;
    @XmlElement(required = true)
    protected List<FieldsBlockType> block;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link VariativeRuleOperationType }
     *     
     */
    public VariativeRuleOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariativeRuleOperationType }
     *     
     */
    public void setOperation(VariativeRuleOperationType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldsBlockType }
     * 
     * 
     */
    public List<FieldsBlockType> getBlock() {
        if (block == null) {
            block = new ArrayList<FieldsBlockType>();
        }
        return this.block;
    }

}
