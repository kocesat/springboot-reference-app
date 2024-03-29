//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.24 at 11:43:14 AM TRT 
//


package com.hoaxify.backend.soapclient.participant.model;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankaSubeleri", propOrder = {
    "bank",
    "sube"
})
public class BankaSubeleri {

    @XmlElement(name = "banka", required = true)
    protected Bank bank;
    protected List<Sube> sube;
    @XmlAttribute(name = "bKd", required = true)
    protected String code;
    @XmlAttribute(name = "sAdt", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sAdt;

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

    public List<Sube> getSube() {
        if (sube == null) {
            sube = new ArrayList<Sube>();
        }
        return this.sube;
    }

    public String getBKd() {
        return code;
    }

    public void setBKd(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the sAdt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSAdt() {
        return sAdt;
    }

    /**
     * Sets the value of the sAdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSAdt(BigInteger value) {
        this.sAdt = value;
    }

}
