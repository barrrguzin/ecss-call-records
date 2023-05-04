//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.30 at 09:31:19 PM VLAT 
//


package ru.ptkom.ecsscallrecordsback.model.CallHistoryModel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nsCleanOutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsCleanOutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="system" type="{}systemOptionsChangeResultType"/>
 *         &lt;element name="node" type="{}nodeOptionsChangeResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsCleanOutType", propOrder = {
    "systemAndNode"
})
public class NsCleanOutType {

    @XmlElements({
        @XmlElement(name = "system", required = true, type = SystemOptionsChangeResultType.class),
        @XmlElement(name = "node", required = true, type = NodeOptionsChangeResultType.class)
    })
    protected List<Object> systemAndNode;

    /**
     * Gets the value of the systemAndNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemAndNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemAndNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemOptionsChangeResultType }
     * {@link NodeOptionsChangeResultType }
     * 
     * 
     */
    public List<Object> getSystemAndNode() {
        if (systemAndNode == null) {
            systemAndNode = new ArrayList<Object>();
        }
        return this.systemAndNode;
    }

}