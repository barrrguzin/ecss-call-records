//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.30 at 09:31:19 PM VLAT 
//


package ru.ptkom.ecsscallrecordsback.model.CallHistoryModel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for domainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="limit" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="50" />
 *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       &lt;attribute name="iface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addr" type="{}addressListType" />
 *       &lt;attribute name="pair" type="{}addressListType" />
 *       &lt;attribute name="addr_a" type="{}addressType" />
 *       &lt;attribute name="addr_b" type="{}addressType" />
 *       &lt;attribute name="from_date" type="{}dateTimeType" />
 *       &lt;attribute name="to_date" type="{}dateTimeType" />
 *       &lt;attribute name="fax_filter" type="{}faxFilterType" />
 *       &lt;attribute name="calls_type" type="{}callsTypeType" default="all" />
 *       &lt;attribute name="call_id" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is_ss_present" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainType")
public class DomainType {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "limit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger limit;
    @XmlAttribute(name = "tag")
    protected byte[] tag;
    @XmlAttribute(name = "iface")
    protected String iface;
    @XmlAttribute(name = "addr")
    protected String addr;
    @XmlAttribute(name = "pair")
    protected String pair;
    @XmlAttribute(name = "addr_a")
    protected String addrA;
    @XmlAttribute(name = "addr_b")
    protected String addrB;
    @XmlAttribute(name = "from_date")
    protected String fromDate;
    @XmlAttribute(name = "to_date")
    protected String toDate;
    @XmlAttribute(name = "fax_filter")
    protected FaxFilterType faxFilter;
    @XmlAttribute(name = "calls_type")
    protected CallsTypeType callsType;
    @XmlAttribute(name = "call_id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String callId;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "is_ss_present")
    protected Boolean isSsPresent;


    public DomainType(String domainName, BigInteger limit, String fromDate, String toDate, String number, CallsTypeType callsType) {
        this.name = domainName;
        this.limit = limit;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.addr = number;
        this.callsType = callsType;
    }

    public DomainType(String domainName, String limit, String fromDate, String toDate, String number, CallsTypeType callsType) {
        this.name = domainName;
        this.limit = new BigInteger(limit);
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.addr = number;
        this.callsType = callsType;
    }

    public DomainType() {

    }


    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimit() {
        if (limit == null) {
            return new BigInteger("50");
        } else {
            return limit;
        }
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimit(BigInteger value) {
        this.limit = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTag(byte[] value) {
        this.tag = value;
    }

    /**
     * Gets the value of the iface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIface() {
        return iface;
    }

    /**
     * Sets the value of the iface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIface(String value) {
        this.iface = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Gets the value of the pair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPair() {
        return pair;
    }

    /**
     * Sets the value of the pair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPair(String value) {
        this.pair = value;
    }

    /**
     * Gets the value of the addrA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrA() {
        return addrA;
    }

    /**
     * Sets the value of the addrA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrA(String value) {
        this.addrA = value;
    }

    /**
     * Gets the value of the addrB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrB() {
        return addrB;
    }

    /**
     * Sets the value of the addrB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrB(String value) {
        this.addrB = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the faxFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FaxFilterType }
     *     
     */
    public FaxFilterType getFaxFilter() {
        return faxFilter;
    }

    /**
     * Sets the value of the faxFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxFilterType }
     *     
     */
    public void setFaxFilter(FaxFilterType value) {
        this.faxFilter = value;
    }

    /**
     * Gets the value of the callsType property.
     * 
     * @return
     *     possible object is
     *     {@link CallsTypeType }
     *     
     */
    public CallsTypeType getCallsType() {
        if (callsType == null) {
            return CallsTypeType.ALL;
        } else {
            return callsType;
        }
    }

    /**
     * Sets the value of the callsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallsTypeType }
     *     
     */
    public void setCallsType(CallsTypeType value) {
        this.callsType = value;
    }

    /**
     * Gets the value of the callId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets the value of the callId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the isSsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSsPresent() {
        return isSsPresent;
    }

    /**
     * Sets the value of the isSsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSsPresent(Boolean value) {
        this.isSsPresent = value;
    }

}
