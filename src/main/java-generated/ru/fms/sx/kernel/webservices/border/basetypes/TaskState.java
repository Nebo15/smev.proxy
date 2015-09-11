
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="taskState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHECKING"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="OPERATOR_ANSWER_WAITING"/>
 *     &lt;enumeration value="DS_WAITING"/>
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="CLOSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "taskState")
@XmlEnum
public enum TaskState {

    CHECKING,
    PROCESSING,
    OPERATOR_ANSWER_WAITING,
    DS_WAITING,
    READY,
    CANCELLED,
    RETURNED,
    CLOSED;

    public String value() {
        return name();
    }

    public static TaskState fromValue(String v) {
        return valueOf(v);
    }

}
