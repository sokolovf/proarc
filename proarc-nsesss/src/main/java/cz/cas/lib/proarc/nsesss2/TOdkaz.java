//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.21 at 01:10:09 AM CET 
//


package cz.cas.lib.proarc.nsesss2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Metadatový kontejner pro referenci na jinou entitu v podobě plně určeného spisového znaku a identifikátoru přiděleného ERMS.
 * 
 * <p>Java class for tOdkaz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOdkaz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlneUrcenySpisovyZnak" type="{http://www.mvcr.cz/nsesss/v2}tPlneUrcenySpisovyZnak"/>
 *         &lt;element name="Identifikator" type="{http://www.mvcr.cz/nsesss/v2}tIdentifikator"/>
 *         &lt;element name="Specifikace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOdkaz", namespace = "http://www.mvcr.cz/nsesss/v2", propOrder = {
    "plneUrcenySpisovyZnak",
    "identifikator",
    "specifikace"
})
public class TOdkaz {

    @XmlElement(name = "PlneUrcenySpisovyZnak", namespace = "http://www.mvcr.cz/nsesss/v2", required = true)
    protected String plneUrcenySpisovyZnak;
    @XmlElement(name = "Identifikator", namespace = "http://www.mvcr.cz/nsesss/v2", required = true)
    protected TIdentifikator identifikator;
    @XmlElement(name = "Specifikace", namespace = "http://www.mvcr.cz/nsesss/v2")
    protected String specifikace;

    /**
     * Gets the value of the plneUrcenySpisovyZnak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlneUrcenySpisovyZnak() {
        return plneUrcenySpisovyZnak;
    }

    /**
     * Sets the value of the plneUrcenySpisovyZnak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlneUrcenySpisovyZnak(String value) {
        this.plneUrcenySpisovyZnak = value;
    }

    /**
     * Gets the value of the identifikator property.
     * 
     * @return
     *     possible object is
     *     {@link TIdentifikator }
     *     
     */
    public TIdentifikator getIdentifikator() {
        return identifikator;
    }

    /**
     * Sets the value of the identifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIdentifikator }
     *     
     */
    public void setIdentifikator(TIdentifikator value) {
        this.identifikator = value;
    }

    /**
     * Gets the value of the specifikace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifikace() {
        return specifikace;
    }

    /**
     * Sets the value of the specifikace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecifikace(String value) {
        this.specifikace = value;
    }

}
