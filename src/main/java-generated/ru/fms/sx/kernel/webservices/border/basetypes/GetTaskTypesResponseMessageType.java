
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTaskTypesResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTaskTypesResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseResponseMessageType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="services" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}service" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getTaskTypesResponseMessageType", propOrder = {
    "services"
})
public class GetTaskTypesResponseMessageType
    extends BaseResponseMessageType
{

    @XmlElement(nillable = true)
    protected List<Service> services;

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getServices() {
        if (services == null) {
            services = new ArrayList<Service>();
        }
        return this.services;
    }

}
