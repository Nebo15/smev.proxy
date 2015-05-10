
package ru.fms.sx.kernel.webservices.border.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDictionaryValuesResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDictionaryValuesResponseMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baseTypes.border.webservices.kernel.sx.fms.ru}baseResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="dictionaryItem" type="{http://baseTypes.border.webservices.kernel.sx.fms.ru}dictionaryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDictionaryValuesResponseMessageType", propOrder = {
    "dictionaryItem"
})
public class GetDictionaryValuesResponseMessageType
    extends BaseResponseMessageType
{

    protected List<DictionaryItem> dictionaryItem;

    /**
     * Gets the value of the dictionaryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictionaryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionaryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DictionaryItem }
     * 
     * 
     */
    public List<DictionaryItem> getDictionaryItem() {
        if (dictionaryItem == null) {
            dictionaryItem = new ArrayList<DictionaryItem>();
        }
        return this.dictionaryItem;
    }

}
