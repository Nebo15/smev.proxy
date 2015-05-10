
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logicalRuleRestrictionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="logicalRuleRestrictionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISABLE"/>
 *     &lt;enumeration value="UPDATE_REGEXP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "logicalRuleRestrictionType")
@XmlEnum
public enum LogicalRuleRestrictionType {

    DISABLE,
    UPDATE_REGEXP;

    public String value() {
        return name();
    }

    public static LogicalRuleRestrictionType fromValue(String v) {
        return valueOf(v);
    }

}
