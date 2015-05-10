
package com.rstyle.skmv.snils_validation;

import com.rstyle.skmv.pfr.FIO;
import com.rstyle.skmv.pfr.GENDER;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnilsValidationData", propOrder = {
    "fio",
    "snils",
    "gender",
    "birthDate"
})
public class SnilsValidationData {

    @XmlElement(required = true)
    @NotNull @Valid
    protected FIO fio;
    @XmlElement(required = true)
    @NotNull @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{3}\\s\\d{2}$", message = "\\d{3}-\\d{3}-\\d{3}\\s\\d{2} '123-456-789 11'")
    protected String snils;
    protected GENDER gender;
    @Pattern(regexp = "^\\d{1,2}-\\d{1,2}-\\d{4}$", message = "\\d{1,2}-\\d{1,2}-\\d{4} dd-mm-yyyy")
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
