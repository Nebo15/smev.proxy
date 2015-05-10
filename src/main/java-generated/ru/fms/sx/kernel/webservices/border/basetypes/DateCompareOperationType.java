
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateCompareOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dateCompareOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LESS"/>
 *     &lt;enumeration value="LESS_OR_EQUALS"/>
 *     &lt;enumeration value="GREATER"/>
 *     &lt;enumeration value="GREATER_OR_EQUALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dateCompareOperationType")
@XmlEnum
public enum DateCompareOperationType {

    LESS,
    LESS_OR_EQUALS,
    GREATER,
    GREATER_OR_EQUALS;

    public String value() {
        return name();
    }

    public static DateCompareOperationType fromValue(String v) {
        return valueOf(v);
    }

}
