//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 05:47:39 AM MSK 
//


package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.*;


/**
 * 
 *         A utility type, not for public use
 * 
 * <p>Java class for derivationControl simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="derivationControl">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="substitution"/>
 *     &lt;enumeration value="extension"/>
 *     &lt;enumeration value="restriction"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="union"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "derivationControl", propOrder = {
    "value"
})
public class DerivationControl {

    @XmlValue
    @XmlSchemaType(name = "derivationControl")
    protected NMTOKEN value;

    /**
     * 
     *         A utility type, not for public use
     * 
     * @return
     *     possible object is
     *     {@link NMTOKEN }
     *     
     */
    public NMTOKEN getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMTOKEN }
     *     
     */
    public void setValue(NMTOKEN value) {
        this.value = value;
    }

}
