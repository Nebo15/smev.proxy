
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * \u041f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0435 \u0441\u0432\u0435\u0434\u0435\u043d\u0438\u0439 \u043e \u043f\u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0435 \u043d\u0430 \u0443\u0447\u0435\u0442 \u0432 \u043d\u0430\u043b\u043e\u0433\u043e\u0432\u043e\u043c \u043e\u0440\u0433\u0430\u043d\u0435 \u0438\u043d\u043e\u0441\u0442\u0440\u0430\u043d\u043d\u043e\u0433\u043e \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0438\u043d\u0430 \u043b\u0438\u0431\u043e \u043b\u0438\u0446\u0430 \u0431\u0435\u0437 \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u0430, \u0432 \u043e\u0442\u043d\u043e\u0448\u0435\u043d\u0438\u0438 \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u0440\u0430\u043d\u0435\u0435 \u0431\u044b\u043b\u0438 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u044b \u0441\u0432\u0435\u0434\u0435\u043d\u0438\u044f.
 * 
 * <p>Java class for getSvFMSIGRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSvFMSIGRequestType">
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
 *                             &lt;element ref="{http://ws.unisoft/getSvFMSIG}\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442"/>
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
@XmlType(name = "getSvFMSIGRequestType")
public class GetSvFMSIGRequestType
    extends MessageRootType
{


}
