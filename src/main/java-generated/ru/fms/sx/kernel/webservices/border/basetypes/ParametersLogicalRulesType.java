
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersLogicalRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersLogicalRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logicalRule" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersLogicalRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersLogicalRulesType", propOrder = {
    "logicalRule"
})
public class ParametersLogicalRulesType {

    protected List<ParametersLogicalRuleType> logicalRule;

    /**
     * Gets the value of the logicalRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersLogicalRuleType }
     * 
     * 
     */
    public List<ParametersLogicalRuleType> getLogicalRule() {
        if (logicalRule == null) {
            logicalRule = new ArrayList<ParametersLogicalRuleType>();
        }
        return this.logicalRule;
    }

}
