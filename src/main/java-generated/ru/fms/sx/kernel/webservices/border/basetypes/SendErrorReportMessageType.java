
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendErrorReportMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendErrorReportMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseRequestMessageType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="errorReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "sendErrorReportMessageType", propOrder = {
    "taskId",
    "errorReport"
})
public class SendErrorReportMessageType
    extends BaseRequestMessageType
{

    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected String errorReport;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the errorReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReport() {
        return errorReport;
    }

    /**
     * Sets the value of the errorReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReport(String value) {
        this.errorReport = value;
    }

}
