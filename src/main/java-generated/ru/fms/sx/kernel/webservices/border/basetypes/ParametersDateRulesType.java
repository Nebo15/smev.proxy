
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametersDateRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametersDateRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRule" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}parametersDateRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametersDateRulesType", propOrder = {
    "dateRule"
})
public class ParametersDateRulesType {

    protected List<ParametersDateRuleType> dateRule;

    /**
     * Gets the value of the dateRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersDateRuleType }
     * 
     * 
     */
    public List<ParametersDateRuleType> getDateRule() {
        if (dateRule == null) {
            dateRule = new ArrayList<ParametersDateRuleType>();
        }
        return this.dateRule;
    }

}
