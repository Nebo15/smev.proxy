
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
     * 
     *                         Запрос
     *                     
     * 
     */
    REQUEST,

    /**
     * 
     *                         Результат
     *                     
     * 
     */
    RESULT,

    /**
     * 
     *                         Мотивированный отказ
     *                     
     * 
     */
    REJECT,

    /**
     * 
     *                         Ошибка при ФЛК
     *                     
     * 
     */
    INVALID,

    /**
     * 
     *                         Сообщение-квиток о приеме
     *                     
     * 
     */
    ACCEPT,

    /**
     * 
     *                         Запрос данных/результатов
     *                     
     * 
     */
    PING,

    /**
     * 
     *                         В обработке
     *                     
     * 
     */
    PROCESS,

    /**
     * 
     *                         Уведомление об ошибке
     *                     
     * 
     */
    NOTIFY,

    /**
     * 
     *                         Технический сбой
     *                     
     * 
     */
    FAILURE,

    /**
     * 
     *                         Отзыв заявления
     *                     
     * 
     */
    CANCEL,

    /**
     * 
     *                         Возврат состояния
     *                     
     * 
     */
    STATE,

    /**
     * 
     *                         Передача пакетного сообщения
     *                     
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
