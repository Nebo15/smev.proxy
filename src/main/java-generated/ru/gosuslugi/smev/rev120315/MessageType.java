
package ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Sender"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Recipient"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Originator" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ServiceName"/>
 *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Service"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}TypeCode"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Status"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Date"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ExchangeType"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}RequestIdRef" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}OriginRequestIdRef" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ServiceCode" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}CaseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}SubMessages" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}TestMsg" minOccurs="0"/>
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}OKTMO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
    "sender",
    "recipient",
    "originator",
    "serviceName",
    "service",
    "typeCode",
    "status",
    "date",
    "exchangeType",
    "requestIdRef",
    "originRequestIdRef",
    "serviceCode",
    "caseNumber",
    "subMessages",
    "testMsg",
    "oktmo"
})
public class MessageType {

    @XmlElement(name = "Sender", required = true)
    protected OrgExternalType sender;
    @XmlElement(name = "Recipient", required = true)
    protected OrgExternalType recipient;
    @XmlElement(name = "Originator")
    protected OrgExternalType originator;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "Service")
    protected ServiceType service;
    @XmlElement(name = "TypeCode", required = true)
    protected TypeCodeType typeCode;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "ExchangeType", required = true)
    protected String exchangeType;
    @XmlElement(name = "RequestIdRef")
    protected String requestIdRef;
    @XmlElement(name = "OriginRequestIdRef")
    protected String originRequestIdRef;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "SubMessages")
    protected SubMessagesType subMessages;
    @XmlElement(name = "TestMsg")
    protected String testMsg;
    @XmlElement(name = "OKTMO")
    protected String oktmo;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link OrgExternalType }
     *     
     */
    public OrgExternalType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgExternalType }
     *     
     */
    public void setSender(OrgExternalType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link OrgExternalType }
     *     
     */
    public OrgExternalType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgExternalType }
     *     
     */
    public void setRecipient(OrgExternalType value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link OrgExternalType }
     *     
     */
    public OrgExternalType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgExternalType }
     *     
     */
    public void setOriginator(OrgExternalType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeType }
     *     
     */
    public TypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeType }
     *     
     */
    public void setTypeCode(TypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the exchangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeType() {
        return exchangeType;
    }

    /**
     * Sets the value of the exchangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeType(String value) {
        this.exchangeType = value;
    }

    /**
     * Gets the value of the requestIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestIdRef() {
        return requestIdRef;
    }

    /**
     * Sets the value of the requestIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestIdRef(String value) {
        this.requestIdRef = value;
    }

    /**
     * Gets the value of the originRequestIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginRequestIdRef() {
        return originRequestIdRef;
    }

    /**
     * Sets the value of the originRequestIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginRequestIdRef(String value) {
        this.originRequestIdRef = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the subMessages property.
     * 
     * @return
     *     possible object is
     *     {@link SubMessagesType }
     *     
     */
    public SubMessagesType getSubMessages() {
        return subMessages;
    }

    /**
     * Sets the value of the subMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMessagesType }
     *     
     */
    public void setSubMessages(SubMessagesType value) {
        this.subMessages = value;
    }

    /**
     * Gets the value of the testMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestMsg() {
        return testMsg;
    }

    /**
     * Sets the value of the testMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestMsg(String value) {
        this.testMsg = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

}
