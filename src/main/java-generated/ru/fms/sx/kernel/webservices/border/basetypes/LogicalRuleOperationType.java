
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for logicalRuleOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="logicalRuleOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="LESS_OR_EQUALS"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_OR_EQUALS"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="NOT_EQUAL"/>
 *     &lt;enumeration value="NOT_IN"/>
 *     &lt;enumeration value="NOT_LIKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "logicalRuleOperationType")
@XmlEnum
public enum LogicalRuleOperationType {

    EQUALS,
    LESS_THAN,
    LESS_OR_EQUALS,
    GREATER_THAN,
    GREATER_OR_EQUALS,
    IN,
    LIKE,
    NOT_EQUAL,
    NOT_IN,
    NOT_LIKE;

    public String value() {
        return name();
    }

    public static LogicalRuleOperationType fromValue(String v) {
        return valueOf(v);
    }

}
