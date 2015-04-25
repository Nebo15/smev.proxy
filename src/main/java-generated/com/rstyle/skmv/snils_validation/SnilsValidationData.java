
package com.rstyle.skmv.snils_validation;

import com.rstyle.skmv.pfr.FIO;
import com.rstyle.skmv.pfr.GENDER;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnilsValidationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnilsValidationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fio" type="{http://pfr.skmv.rstyle.com}FIO"/>
 *         &lt;element name="snils" type="{http://pfr.skmv.rstyle.com}SNILS"/>
 *         &lt;element name="gender" type="{http://pfr.skmv.rstyle.com}GENDER" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://pfr.skmv.rstyle.com}PFR_DATE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnilsValidationData", propOrder = {
    "fio",
    "snils",
    "gender",
    "birthDate"
})
public class SnilsValidationData {

    @XmlElement(required = true)
    protected FIO fio;
    @XmlElement(required = true)
    protected String snils;
    protected GENDER gender;
    protected String birthDate;

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link FIO }
     *     
     */
    public FIO getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIO }
     *     
     */
    public void setFio(FIO value) {
        this.fio = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GENDER }
     *     
     */
    public GENDER getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GENDER }
     *     
     */
    public void setGender(GENDER value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

}
