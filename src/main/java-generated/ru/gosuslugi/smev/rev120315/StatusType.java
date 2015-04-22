
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUEST"/>
 *     &lt;enumeration value="RESULT"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="ACCEPT"/>
 *     &lt;enumeration value="PING"/>
 *     &lt;enumeration value="PROCESS"/>
 *     &lt;enumeration value="NOTIFY"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="PACKET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {


    /**
     * \u0417\u0430\u043f\u0440\u043e\u0441
     * 
     */
    REQUEST,

    /**
     * \u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442
     * 
     */
    RESULT,

    /**
     * \u041c\u043e\u0442\u0438\u0432\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u043e\u0442\u043a\u0430\u0437
     * 
     */
    REJECT,

    /**
     * \u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0424\u041b\u041a
     * 
     */
    INVALID,

    /**
     * \u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435-\u043a\u0432\u0438\u0442\u043e\u043a \u043e \u043f\u0440\u0438\u0435\u043c\u0435
     * 
     */
    ACCEPT,

    /**
     * \u0417\u0430\u043f\u0440\u043e\u0441 \u0434\u0430\u043d\u043d\u044b\u0445/\u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u043e\u0432
     * 
     */
    PING,

    /**
     * \u0412 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0435
     * 
     */
    PROCESS,

    /**
     * \u0423\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0435 \u043e\u0431 \u043e\u0448\u0438\u0431\u043a\u0435
     * 
     */
    NOTIFY,

    /**
     * \u0422\u0435\u0445\u043d\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0441\u0431\u043e\u0439
     * 
     */
    FAILURE,

    /**
     * \u041e\u0442\u0437\u044b\u0432 \u0437\u0430\u044f\u0432\u043b\u0435\u043d\u0438\u044f
     * 
     */
    CANCEL,

    /**
     * \u0412\u043e\u0437\u0432\u0440\u0430\u0442 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u044f
     * 
     */
    STATE,

    /**
     * \u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0430 \u043f\u0430\u043a\u0435\u0442\u043d\u043e\u0433\u043e \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u044f
     * 
     */
    PACKET;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
