//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.24 at 11:43:14 AM TRT 
//


package com.hoaxify.backend.soapclient.participant.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "blsCvp",
    "bnkCvp",
    "subCvp",
    "bsbCvp",
    "tumCvp",
    "sgbCvp",
    "sgsCvp",
    "hata"
})
@XmlRootElement(name = "bankaSubeOkuCevap")
public class BankaSubeOkuCevap {

    protected BLSCvp blsCvp;
    protected BNKCvp bnkCvp;
    protected SUBCvp subCvp;
    protected BSBCvp bsbCvp;
    protected TUMCvp tumCvp;
    protected SGBCvp sgbCvp;
    protected SGSCvp sgsCvp;
    protected HataSonuc hata;

    /**
     * Gets the value of the blsCvp property.
     * 
     * @return
     *     possible object is
     *     {@link BLSCvp }
     *     
     */
    public BLSCvp getBlsCvp() {
        return blsCvp;
    }

    /**
     * Sets the value of the blsCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLSCvp }
     *     
     */
    public void setBlsCvp(BLSCvp value) {
        this.blsCvp = value;
    }

    /**
     * Gets the value of the bnkCvp property.
     * 
     * @return
     *     possible object is
     *     {@link BNKCvp }
     *     
     */
    public BNKCvp getBnkCvp() {
        return bnkCvp;
    }

    /**
     * Sets the value of the bnkCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BNKCvp }
     *     
     */
    public void setBnkCvp(BNKCvp value) {
        this.bnkCvp = value;
    }

    /**
     * Gets the value of the subCvp property.
     * 
     * @return
     *     possible object is
     *     {@link SUBCvp }
     *     
     */
    public SUBCvp getSubCvp() {
        return subCvp;
    }

    /**
     * Sets the value of the subCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBCvp }
     *     
     */
    public void setSubCvp(SUBCvp value) {
        this.subCvp = value;
    }

    /**
     * Gets the value of the bsbCvp property.
     * 
     * @return
     *     possible object is
     *     {@link BSBCvp }
     *     
     */
    public BSBCvp getBsbCvp() {
        return bsbCvp;
    }

    /**
     * Sets the value of the bsbCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BSBCvp }
     *     
     */
    public void setBsbCvp(BSBCvp value) {
        this.bsbCvp = value;
    }

    /**
     * Gets the value of the tumCvp property.
     * 
     * @return
     *     possible object is
     *     {@link TUMCvp }
     *     
     */
    public TUMCvp getTumCvp() {
        return tumCvp;
    }

    /**
     * Sets the value of the tumCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUMCvp }
     *     
     */
    public void setTumCvp(TUMCvp value) {
        this.tumCvp = value;
    }

    /**
     * Gets the value of the sgbCvp property.
     * 
     * @return
     *     possible object is
     *     {@link SGBCvp }
     *     
     */
    public SGBCvp getSgbCvp() {
        return sgbCvp;
    }

    /**
     * Sets the value of the sgbCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGBCvp }
     *     
     */
    public void setSgbCvp(SGBCvp value) {
        this.sgbCvp = value;
    }

    /**
     * Gets the value of the sgsCvp property.
     * 
     * @return
     *     possible object is
     *     {@link SGSCvp }
     *     
     */
    public SGSCvp getSgsCvp() {
        return sgsCvp;
    }

    /**
     * Sets the value of the sgsCvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGSCvp }
     *     
     */
    public void setSgsCvp(SGSCvp value) {
        this.sgsCvp = value;
    }

    /**
     * Gets the value of the hata property.
     * 
     * @return
     *     possible object is
     *     {@link HataSonuc }
     *     
     */
    public HataSonuc getHata() {
        return hata;
    }

    /**
     * Sets the value of the hata property.
     * 
     * @param value
     *     allowed object is
     *     {@link HataSonuc }
     *     
     */
    public void setHata(HataSonuc value) {
        this.hata = value;
    }

}