//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.30 at 09:31:19 PM VLAT 
//


package ru.ptkom.ecsscallrecordsback.model.CallHistoryModel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callsTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="callsTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="history"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "callsTypeType")
@XmlEnum
public enum CallsTypeType {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("history")
    HISTORY("history"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    CallsTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallsTypeType fromValue(String v) {
        for (CallsTypeType c: CallsTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}