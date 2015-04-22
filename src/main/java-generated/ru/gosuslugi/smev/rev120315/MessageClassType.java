
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST"/>
 *     &lt;enumeration value="RESPONSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageClassType")
@XmlEnum
public enum MessageClassType {


    /**
     * \u0417\u0430\u043f\u0440\u043e\u0441 \u043e\u0442 \u043f\u043e\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043b\u044f \u043a \u043f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a\u0443
     *                     
     * 
     */
    REQUEST,

    /**
     * \u041e\u0442\u0432\u0435\u0442 \u043f\u043e\u0441\u0442\u0430\u0432\u0449\u0438\u043a\u0430 \u043f\u043e\u0442\u0440\u0435\u0431\u0438\u0442\u0435\u043b\u044e
     * 
     */
    RESPONSE;

    public String value() {
        return name();
    }

    public static MessageClassType fromValue(String v) {
        return valueOf(v);
    }

}
