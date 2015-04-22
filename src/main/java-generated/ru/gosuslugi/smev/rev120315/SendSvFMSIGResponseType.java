
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * \u041a\u0432\u0438\u0442\u0430\u043d\u0446\u0438\u044f, \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0449\u0430\u044f \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440 \u0437\u0430\u043f\u0440\u043e\u0441\u0430 \u043b\u0438\u0431\u043e \u043a\u043e\u0434 \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0430 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0438.
 * 
 * <p>Java class for sendSvFMSIGResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSvFMSIGResponseType">
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
 *                             &lt;element ref="{http://ws.unisoft/sendSvFMSIGResponse}\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442"/>
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
@XmlType(name = "sendSvFMSIGResponseType")
public class SendSvFMSIGResponseType
    extends MessageRootType
{


}
