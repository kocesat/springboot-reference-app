//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.24 at 11:43:14 AM TRT 
//


package com.hoaxify.backend.soapclient.participant.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BNKCvp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BNKCvp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="banka" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}Banka"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BNKCvp", propOrder = {
    "bank"
})
public class BNKCvp {

    @XmlElement(name="banka", required = true)
    protected Bank bank;

    /**
     * Gets the value of the banka property.
     * 
     * @return
     *     possible object is
     *     {@link Bank }
     *     
     */
    public Bank getBanka() {
        return bank;
    }

    /**
     * Sets the value of the banka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bank }
     *     
     */
    public void setBanka(Bank value) {
        this.bank = value;
    }

}
