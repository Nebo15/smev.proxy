
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variativeRuleOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variativeRuleOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="AT_LEAST_ONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "variativeRuleOperationType")
@XmlEnum
public enum VariativeRuleOperationType {

    AND,
    OR,
    AT_LEAST_ONE;

    public String value() {
        return name();
    }

    public static VariativeRuleOperationType fromValue(String v) {
        return valueOf(v);
    }

}
