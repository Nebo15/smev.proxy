
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskParameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="DATE_TIME"/>
 *     &lt;enumeration value="LIST"/>
 *     &lt;enumeration value="DICT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskParameterType")
@XmlEnum
public enum TaskParameterType {

    INTEGER,
    LONG,
    FLOAT,
    STRING,
    BOOLEAN,
    DATE,
    TIME,
    DATE_TIME,
    LIST,
    DICT;

    public String value() {
        return name();
    }

    public static TaskParameterType fromValue(String v) {
        return valueOf(v);
    }

}
