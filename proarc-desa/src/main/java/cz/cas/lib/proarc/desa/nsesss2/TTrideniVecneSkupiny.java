//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.21 at 01:10:09 AM CET 
//


package cz.cas.lib.proarc.desa.nsesss2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sada elementů pro zatřídění věcné skupiny do hierarchie spisového plánu.
 * 
 * <p>Java class for tTrideniVecneSkupiny complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTrideniVecneSkupiny">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mvcr.cz/nsesss/v2}tTrideni">
 *       &lt;choice>
 *         &lt;element name="SpisovyPlan" type="{http://www.mvcr.cz/nsesss/v2}tSpisovyPlan"/>
 *         &lt;element name="MaterskaEntita" type="{http://www.mvcr.cz/nsesss/v2}tMaterskaEntitaVecneSkupiny"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTrideniVecneSkupiny", namespace = "http://www.mvcr.cz/nsesss/v2", propOrder = {
    "spisovyPlan",
    "materskaEntita"
})
public class TTrideniVecneSkupiny
    extends TTrideni
{

    @XmlElement(name = "SpisovyPlan", namespace = "http://www.mvcr.cz/nsesss/v2")
    protected TSpisovyPlan spisovyPlan;
    @XmlElement(name = "MaterskaEntita", namespace = "http://www.mvcr.cz/nsesss/v2")
    protected TMaterskaEntitaVecneSkupiny materskaEntita;

    /**
     * Gets the value of the spisovyPlan property.
     * 
     * @return
     *     possible object is
     *     {@link TSpisovyPlan }
     *     
     */
    public TSpisovyPlan getSpisovyPlan() {
        return spisovyPlan;
    }

    /**
     * Sets the value of the spisovyPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSpisovyPlan }
     *     
     */
    public void setSpisovyPlan(TSpisovyPlan value) {
        this.spisovyPlan = value;
    }

    /**
     * Gets the value of the materskaEntita property.
     * 
     * @return
     *     possible object is
     *     {@link TMaterskaEntitaVecneSkupiny }
     *     
     */
    public TMaterskaEntitaVecneSkupiny getMaterskaEntita() {
        return materskaEntita;
    }

    /**
     * Sets the value of the materskaEntita property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMaterskaEntitaVecneSkupiny }
     *     
     */
    public void setMaterskaEntita(TMaterskaEntitaVecneSkupiny value) {
        this.materskaEntita = value;
    }

}