
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendErrorReportResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendErrorReportResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseResponseMessageType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="errorReportId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendErrorReportResponseMessageType", propOrder = {
    "errorReportId"
})
public class SendErrorReportResponseMessageType
    extends BaseResponseMessageType
{

    @XmlElement(required = true)
    protected String errorReportId;

    /**
     * Gets the value of the errorReportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReportId() {
        return errorReportId;
    }

    /**
     * Sets the value of the errorReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReportId(String value) {
        this.errorReportId = value;
    }

}
