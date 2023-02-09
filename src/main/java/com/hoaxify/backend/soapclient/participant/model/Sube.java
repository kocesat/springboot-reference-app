//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.24 at 11:43:14 AM TRT 
//


package com.hoaxify.backend.soapclient.participant.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sube complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sube"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bKd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}BankaKodu"/&gt;
 *         &lt;element name="sKd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}SubeKodu"/&gt;
 *         &lt;element name="sAd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}Ad"/&gt;
 *         &lt;element name="sIlKd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}IlKodu"/&gt;
 *         &lt;element name="sIlAd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}IlAd" minOccurs="0"/&gt;
 *         &lt;element name="sIlcKd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}IlceKodu" minOccurs="0"/&gt;
 *         &lt;element name="sIlcAd" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}IlceAd" minOccurs="0"/&gt;
 *         &lt;element name="adr" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}Adr" minOccurs="0"/&gt;
 *         &lt;element name="tlf" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}Telefon_Faks" minOccurs="0"/&gt;
 *         &lt;element name="fks" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}Telefon_Faks" minOccurs="0"/&gt;
 *         &lt;element name="epst" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}Eposta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sonIslemTuru" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}IslevTuru" /&gt;
 *       &lt;attribute name="sonIslemZamani" type="{http://bs.tcmb.gov.tr/services/bankaSubeOku/}ZamanDamgasi" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sube", propOrder = {
    "bKd",
    "sKd",
    "sAd",
    "sIlKd",
    "sIlAd",
    "sIlcKd",
    "sIlcAd",
    "adr",
    "tlf",
    "fks",
    "epst"
})
public class Sube {

    @XmlElement(required = true)
    protected String bKd;
    @XmlElement(required = true)
    protected String sKd;
    @XmlElement(required = true)
    protected String sAd;
    @XmlElement(required = true)
    protected String sIlKd;
    protected String sIlAd;
    protected String sIlcKd;
    protected String sIlcAd;
    protected String adr;
    protected String tlf;
    protected String fks;
    protected String epst;
    @XmlAttribute(name = "sonIslemTuru")
    protected String sonIslemTuru;
    @XmlAttribute(name = "sonIslemZamani")
    protected String sonIslemZamani;

    /**
     * Gets the value of the bKd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKd() {
        return bKd;
    }

    /**
     * Sets the value of the bKd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKd(String value) {
        this.bKd = value;
    }

    /**
     * Gets the value of the sKd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKd() {
        return sKd;
    }

    /**
     * Sets the value of the sKd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKd(String value) {
        this.sKd = value;
    }

    /**
     * Gets the value of the sAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAd() {
        return sAd;
    }

    /**
     * Sets the value of the sAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAd(String value) {
        this.sAd = value;
    }

    /**
     * Gets the value of the sIlKd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIlKd() {
        return sIlKd;
    }

    /**
     * Sets the value of the sIlKd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIlKd(String value) {
        this.sIlKd = value;
    }

    /**
     * Gets the value of the sIlAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIlAd() {
        return sIlAd;
    }

    /**
     * Sets the value of the sIlAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIlAd(String value) {
        this.sIlAd = value;
    }

    /**
     * Gets the value of the sIlcKd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIlcKd() {
        return sIlcKd;
    }

    /**
     * Sets the value of the sIlcKd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIlcKd(String value) {
        this.sIlcKd = value;
    }

    /**
     * Gets the value of the sIlcAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIlcAd() {
        return sIlcAd;
    }

    /**
     * Sets the value of the sIlcAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIlcAd(String value) {
        this.sIlcAd = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the tlf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlf() {
        return tlf;
    }

    /**
     * Sets the value of the tlf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlf(String value) {
        this.tlf = value;
    }

    /**
     * Gets the value of the fks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFks() {
        return fks;
    }

    /**
     * Sets the value of the fks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFks(String value) {
        this.fks = value;
    }

    /**
     * Gets the value of the epst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpst() {
        return epst;
    }

    /**
     * Sets the value of the epst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpst(String value) {
        this.epst = value;
    }

    /**
     * Gets the value of the sonIslemTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonIslemTuru() {
        return sonIslemTuru;
    }

    /**
     * Sets the value of the sonIslemTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonIslemTuru(String value) {
        this.sonIslemTuru = value;
    }

    /**
     * Gets the value of the sonIslemZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonIslemZamani() {
        return sonIslemZamani;
    }

    /**
     * Sets the value of the sonIslemZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonIslemZamani(String value) {
        this.sonIslemZamani = value;
    }

}