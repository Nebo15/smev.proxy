
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * \u041f\u0435\u0440\u0435\u0434\u0430\u0447\u0430 \u0441\u0432\u0435\u0434\u0435\u043d\u0438\u0439 \u043e\u0431 \u0438\u043d\u043e\u0441\u0442\u0440\u0430\u043d\u043d\u043e\u043c \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0438\u043d\u0435 \u043b\u0438\u0431\u043e \u043b\u0438\u0446\u0435 \u0431\u0435\u0437 \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u0430, \u0432 \u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0438 \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u043e\u0440\u0433\u0430\u043d\u0430\u043c\u0438 \u0424\u041c\u0421 \u0420\u043e\u0441\u0441\u0438\u0438 \u043f\u0440\u0438\u043d\u044f\u0442\u044b \u043a \u0440\u0430\u0441\u0441\u043c\u043e\u0442\u0440\u0435\u043d\u0438\u044e \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b \u0434\u043b\u044f \u043e\u0444\u043e\u0440\u043c\u043b\u0435\u043d\u0438\u044f \u0440\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u044f \u043d\u0430 \u0440\u0430\u0431\u043e\u0442\u0443 \u0438\u043b\u0438 \u043f\u0430\u0442\u0435\u043d\u0442\u0430.
 * 
 * <p>Java class for sendSvFMSIGRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSvFMSIGRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}MessageRootType">
 *       &lt;sequence>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Message"/>
 *         &lt;element name="MessageData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}MessageDataType">
 *                 &lt;sequence>
 *                   &lt;element name="AppData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://ws.unisoft/sendSvFMSIG}\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442"/>
 *                           &lt;/sequence>
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}AppDocument" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSvFMSIGRequestType")
public class SendSvFMSIGRequestType
    extends MessageRootType
{


}
