
package ru.gosuslugi.smev.rev111111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INNFLGR_Rs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INNFLGR_Rs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://smev.gosuslugi.ru/rev111111}BaseMessageType">
 *       &lt;sequence>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev111111}Message"/>
 *         &lt;element name="MessageData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev111111}MessageDataType">
 *                 &lt;sequence>
 *                   &lt;element name="AppData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://smev.gosuslugi.ru/rev111111}AppDataType">
 *                           &lt;sequence>
 *                             &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev111111}AppDocument" minOccurs="0"/>
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
@XmlType(name = "INNFLGR_Rs")
public class INNFLGRRs
    extends BaseMessageType
{


}
