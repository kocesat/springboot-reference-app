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
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUMCvp", propOrder = {
    "bankaSubeleri"
})
public class TUMCvp {

    @XmlElement(required = true)
    protected List<BankaSubeleri> bankaSubeleri;

    public List<BankaSubeleri> getBankaSubeleri() {
        if (bankaSubeleri == null) {
            bankaSubeleri = new ArrayList<BankaSubeleri>();
        }
        return this.bankaSubeleri;
    }

}
