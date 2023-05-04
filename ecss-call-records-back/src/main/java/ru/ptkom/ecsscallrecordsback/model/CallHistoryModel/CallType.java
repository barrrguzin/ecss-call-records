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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for callType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="call_id" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="branch_id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="parent_branch_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="call_ref" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="stage" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="oaddr_a" type="{}addressType" />
 *       &lt;attribute name="oaddr_b" type="{}addressType" />
 *       &lt;attribute name="addr_a" type="{}addressType" />
 *       &lt;attribute name="addr_b" type="{}addressType" />
 *       &lt;attribute name="ni_a" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="ni_b" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="release_initiator" type="{}nonEmptyTokenType" />
 *       &lt;attribute name="start_time" type="{}nonEmptyNormalizedStringType" />
 *       &lt;attribute name="alerting_time" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="answer_time" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="release_time" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="duration_time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="display_name_a" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="display_name_b" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="codec_a" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codec_b" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category_a" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="category_b" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="iface_a" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="iface_b" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="trunk_group_id_a" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="trunk_group_id_b" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="call_record_a" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="call_record_b" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="success_faxes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="failed_faxes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url_list" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="release_cause" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="release_cause_isup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callType")
public class CallType {

    @XmlAttribute(name = "call_id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String callId;
    @XmlAttribute(name = "branch_id")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger branchId;
    @XmlAttribute(name = "parent_branch_id")
    protected String parentBranchId;
    @XmlAttribute(name = "call_ref")
    protected BigInteger callRef;
    @XmlAttribute(name = "stage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stage;
    @XmlAttribute(name = "oaddr_a")
    protected String oaddrA;
    @XmlAttribute(name = "oaddr_b")
    protected String oaddrB;
    @XmlAttribute(name = "addr_a")
    protected String addrA;
    @XmlAttribute(name = "addr_b")
    protected String addrB;
    @XmlAttribute(name = "ni_a")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String niA;
    @XmlAttribute(name = "ni_b")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String niB;
    @XmlAttribute(name = "release_initiator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseInitiator;
    @XmlAttribute(name = "start_time")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String startTime;
    @XmlAttribute(name = "alerting_time")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String alertingTime;
    @XmlAttribute(name = "answer_time")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String answerTime;
    @XmlAttribute(name = "release_time")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseTime;
    @XmlAttribute(name = "duration_time")
    protected BigInteger durationTime;
    @XmlAttribute(name = "display_name_a")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayNameA;
    @XmlAttribute(name = "display_name_b")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayNameB;
    @XmlAttribute(name = "codec_a")
    protected String codecA;
    @XmlAttribute(name = "codec_b")
    protected String codecB;
    @XmlAttribute(name = "category_a")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryA;
    @XmlAttribute(name = "category_b")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryB;
    @XmlAttribute(name = "iface_a")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ifaceA;
    @XmlAttribute(name = "iface_b")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ifaceB;
    @XmlAttribute(name = "trunk_group_id_a")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trunkGroupIdA;
    @XmlAttribute(name = "trunk_group_id_b")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trunkGroupIdB;
    @XmlAttribute(name = "call_record_a")
    protected String callRecordA;
    @XmlAttribute(name = "call_record_b")
    protected String callRecordB;
    @XmlAttribute(name = "success_faxes")
    protected String successFaxes;
    @XmlAttribute(name = "failed_faxes")
    protected String failedFaxes;
    @XmlAttribute(name = "url_list")
    protected String urlList;
    @XmlAttribute(name = "release_cause")
    protected String releaseCause;
    @XmlAttribute(name = "release_cause_isup")
    protected String releaseCauseIsup;
    @XmlAttribute(name = "mode")
    protected String mode;

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
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBranchId(BigInteger value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the parentBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBranchId() {
        return parentBranchId;
    }

    /**
     * Sets the value of the parentBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBranchId(String value) {
        this.parentBranchId = value;
    }

    /**
     * Gets the value of the callRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCallRef() {
        return callRef;
    }

    /**
     * Sets the value of the callRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCallRef(BigInteger value) {
        this.callRef = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the oaddrA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOaddrA() {
        return oaddrA;
    }

    /**
     * Sets the value of the oaddrA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOaddrA(String value) {
        this.oaddrA = value;
    }

    /**
     * Gets the value of the oaddrB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOaddrB() {
        return oaddrB;
    }

    /**
     * Sets the value of the oaddrB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOaddrB(String value) {
        this.oaddrB = value;
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
     * Gets the value of the niA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiA() {
        return niA;
    }

    /**
     * Sets the value of the niA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiA(String value) {
        this.niA = value;
    }

    /**
     * Gets the value of the niB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiB() {
        return niB;
    }

    /**
     * Sets the value of the niB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiB(String value) {
        this.niB = value;
    }

    /**
     * Gets the value of the releaseInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseInitiator() {
        return releaseInitiator;
    }

    /**
     * Sets the value of the releaseInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseInitiator(String value) {
        this.releaseInitiator = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the alertingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingTime() {
        return alertingTime;
    }

    /**
     * Sets the value of the alertingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingTime(String value) {
        this.alertingTime = value;
    }

    /**
     * Gets the value of the answerTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerTime() {
        return answerTime;
    }

    /**
     * Sets the value of the answerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerTime(String value) {
        this.answerTime = value;
    }

    /**
     * Gets the value of the releaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseTime() {
        return releaseTime;
    }

    /**
     * Sets the value of the releaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseTime(String value) {
        this.releaseTime = value;
    }

    /**
     * Gets the value of the durationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurationTime() {
        return durationTime;
    }

    /**
     * Sets the value of the durationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurationTime(BigInteger value) {
        this.durationTime = value;
    }

    /**
     * Gets the value of the displayNameA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameA() {
        return displayNameA;
    }

    /**
     * Sets the value of the displayNameA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameA(String value) {
        this.displayNameA = value;
    }

    /**
     * Gets the value of the displayNameB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayNameB() {
        return displayNameB;
    }

    /**
     * Sets the value of the displayNameB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayNameB(String value) {
        this.displayNameB = value;
    }

    /**
     * Gets the value of the codecA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecA() {
        return codecA;
    }

    /**
     * Sets the value of the codecA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecA(String value) {
        this.codecA = value;
    }

    /**
     * Gets the value of the codecB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecB() {
        return codecB;
    }

    /**
     * Sets the value of the codecB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecB(String value) {
        this.codecB = value;
    }

    /**
     * Gets the value of the categoryA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryA() {
        return categoryA;
    }

    /**
     * Sets the value of the categoryA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryA(String value) {
        this.categoryA = value;
    }

    /**
     * Gets the value of the categoryB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryB() {
        return categoryB;
    }

    /**
     * Sets the value of the categoryB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryB(String value) {
        this.categoryB = value;
    }

    /**
     * Gets the value of the ifaceA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfaceA() {
        return ifaceA;
    }

    /**
     * Sets the value of the ifaceA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfaceA(String value) {
        this.ifaceA = value;
    }

    /**
     * Gets the value of the ifaceB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfaceB() {
        return ifaceB;
    }

    /**
     * Sets the value of the ifaceB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfaceB(String value) {
        this.ifaceB = value;
    }

    /**
     * Gets the value of the trunkGroupIdA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupIdA() {
        return trunkGroupIdA;
    }

    /**
     * Sets the value of the trunkGroupIdA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupIdA(String value) {
        this.trunkGroupIdA = value;
    }

    /**
     * Gets the value of the trunkGroupIdB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupIdB() {
        return trunkGroupIdB;
    }

    /**
     * Sets the value of the trunkGroupIdB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupIdB(String value) {
        this.trunkGroupIdB = value;
    }

    /**
     * Gets the value of the callRecordA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecordA() {
        return callRecordA;
    }

    /**
     * Sets the value of the callRecordA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecordA(String value) {
        this.callRecordA = value;
    }

    /**
     * Gets the value of the callRecordB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecordB() {
        return callRecordB;
    }

    /**
     * Sets the value of the callRecordB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecordB(String value) {
        this.callRecordB = value;
    }

    /**
     * Gets the value of the successFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessFaxes() {
        return successFaxes;
    }

    /**
     * Sets the value of the successFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessFaxes(String value) {
        this.successFaxes = value;
    }

    /**
     * Gets the value of the failedFaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedFaxes() {
        return failedFaxes;
    }

    /**
     * Sets the value of the failedFaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedFaxes(String value) {
        this.failedFaxes = value;
    }

    /**
     * Gets the value of the urlList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlList() {
        return urlList;
    }

    /**
     * Sets the value of the urlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlList(String value) {
        this.urlList = value;
    }

    /**
     * Gets the value of the releaseCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseCause() {
        return releaseCause;
    }

    /**
     * Sets the value of the releaseCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseCause(String value) {
        this.releaseCause = value;
    }

    /**
     * Gets the value of the releaseCauseIsup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseCauseIsup() {
        return releaseCauseIsup;
    }

    /**
     * Sets the value of the releaseCauseIsup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseCauseIsup(String value) {
        this.releaseCauseIsup = value;
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

}
