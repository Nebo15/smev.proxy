
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersVariativeRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersVariativeRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variativeRule" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersVariativeRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersVariativeRulesType", propOrder = {
    "variativeRule"
})
public class ParametersVariativeRulesType {

    protected List<ParametersVariativeRuleType> variativeRule;

    /**
     * Gets the value of the variativeRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variativeRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariativeRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersVariativeRuleType }
     * 
     * 
     */
    public List<ParametersVariativeRuleType> getVariativeRule() {
        if (variativeRule == null) {
            variativeRule = new ArrayList<ParametersVariativeRuleType>();
        }
        return this.variativeRule;
    }

}
