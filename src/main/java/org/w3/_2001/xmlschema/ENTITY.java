//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 05:47:39 AM MSK 
//


package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ENTITY simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="ENTITY">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTITY", propOrder = {
    "value"
})
public class ENTITY {

    @XmlValue
    @XmlSchemaType(name = "ENTITY")
    protected NCName value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NCName }
     *     
     */
    public NCName getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NCName }
     *     
     */
    public void setValue(NCName value) {
        this.value = value;
    }

}