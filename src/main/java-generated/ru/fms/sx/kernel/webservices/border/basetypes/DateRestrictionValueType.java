
package ru.fms.sx.kernel.webservices.border.basetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dateRestrictionValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateRestrictionValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="yearsOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateRestrictionValueType", propOrder = {
    "currentDate",
    "yearsOffset",
    "dateValue"
})
public class DateRestrictionValueType {

    protected boolean currentDate;
    @XmlElementRef(name = "yearsOffset", namespace = "http://baseTypes.border.webservices.kernel.sx.fms.ru", type = JAXBElement.class)
    protected JAXBElement<Integer> yearsOffset;
    @XmlElementRef(name = "dateValue", namespace = "http://baseTypes.border.webservices.kernel.sx.fms.ru", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dateValue;

    /**
     * Gets the value of the currentDate property.
     * 
     */
    public boolean isCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     */
    public void setCurrentDate(boolean value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the yearsOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearsOffset() {
        return yearsOffset;
    }

    /**
     * Sets the value of the yearsOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearsOffset(JAXBElement<Integer> value) {
        this.yearsOffset = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateValue(JAXBElement<XMLGregorianCalendar> value) {
        this.dateValue = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
