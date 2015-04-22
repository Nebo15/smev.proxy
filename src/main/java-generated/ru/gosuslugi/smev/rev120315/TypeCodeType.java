
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GSRV"/>
 *     &lt;enumeration value="GFNC"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeCodeType")
@XmlEnum
public enum TypeCodeType {


    /**
     * \u0412\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0432 \u0440\u0430\u043c\u043a\u0430\u0445 \u043e\u043a\u0430\u0437\u0430\u043d\u0438\u044f \u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445
     *                         \u0443\u0441\u043b\u0443\u0433
     *                     
     * 
     */
    GSRV,

    /**
     * \u0412\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0432 \u0440\u0430\u043c\u043a\u0430\u0445 \u0438\u0441\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u0444\u0443\u043d\u043a\u0446\u0438\u0439
     *                     
     * 
     */
    GFNC,

    /**
     * \u0412\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0432 \u0438\u043d\u044b\u0445 \u0446\u0435\u043b\u044f\u0445, \u043f\u0440\u0435\u0434\u0443\u0441\u043c\u043e\u0442\u0440\u0435\u043d\u043d\u044b\u0445 \u0437\u0430\u043a\u043e\u043d\u043e\u0434\u0430\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e\u043c
     *                     
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
