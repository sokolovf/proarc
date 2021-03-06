/*
 * Copyright (C) 2014 Robert Simonovsky
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package cz.cas.lib.proarc.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * metsType: Complex Type for METS Sections A METS document consists of seven
 * possible subsidiary sections: metsHdr (METS document header), dmdSec
 * (descriptive metadata section), amdSec (administrative metadata section),
 * fileGrp (file inventory group), structLink (structural map linking),
 * structMap (structural map) and behaviorSec (behaviors section).
 * 
 * 
 * <p>
 * Java class for metsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="metsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metsHdr" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agent" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;attribute name="ROLE" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="CREATOR"/>
 *                                 &lt;enumeration value="EDITOR"/>
 *                                 &lt;enumeration value="ARCHIVIST"/>
 *                                 &lt;enumeration value="PRESERVATION"/>
 *                                 &lt;enumeration value="DISSEMINATOR"/>
 *                                 &lt;enumeration value="CUSTODIAN"/>
 *                                 &lt;enumeration value="IPOWNER"/>
 *                                 &lt;enumeration value="OTHER"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OTHERROLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TYPE">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="INDIVIDUAL"/>
 *                                 &lt;enumeration value="ORGANIZATION"/>
 *                                 &lt;enumeration value="OTHER"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OTHERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="altRecordID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="metsDocumentID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *                 &lt;attribute name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="LASTMODDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dmdSec" type="{http://www.loc.gov/METS/}mdSecType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="amdSec" type="{http://www.loc.gov/METS/}amdSecType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileSec" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fileGrp" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.loc.gov/METS/}fileGrpType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="structMap" type="{http://www.loc.gov/METS/}structMapType" maxOccurs="unbounded"/>
 *         &lt;element name="structLink" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.loc.gov/METS/}structLinkType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="behaviorSec" type="{http://www.loc.gov/METS/}behaviorSecType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="OBJID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PROFILE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metsType", namespace = "http://www.loc.gov/METS/", propOrder = { "metsHdr", "dmdSec", "amdSec", "fileSec", "structMap", "structLink", "behaviorSec" })
@XmlSeeAlso({ Mets.class })
public class MetsType {

    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected MetsType.MetsHdr metsHdr;
    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected List<MdSecType> dmdSec;
    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected List<AmdSecType> amdSec;
    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected MetsType.FileSec fileSec;
    @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
    protected List<StructMapType> structMap;
    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected MetsType.StructLink structLink;
    @XmlElement(namespace = "http://www.loc.gov/METS/")
    protected List<BehaviorSecType> behaviorSec;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "OBJID")
    protected String objid;
    @XmlAttribute(name = "LABEL")
    protected String label1;
    @XmlAttribute(name = "TYPE")
    protected String type;
    @XmlAttribute(name = "PROFILE")
    protected String profile;

    /**
     * Gets the value of the metsHdr property.
     * 
     * @return possible object is {@link MetsType.MetsHdr }
     * 
     */
    public MetsType.MetsHdr getMetsHdr() {
        return metsHdr;
    }

    /**
     * Sets the value of the metsHdr property.
     * 
     * @param value
     *            allowed object is {@link MetsType.MetsHdr }
     * 
     */
    public void setMetsHdr(MetsType.MetsHdr value) {
        this.metsHdr = value;
    }

    /**
     * Gets the value of the dmdSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the dmdSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDmdSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MdSecType }
     * 
     * 
     */
    public List<MdSecType> getDmdSec() {
        if (dmdSec == null) {
            dmdSec = new ArrayList<MdSecType>();
        }
        return this.dmdSec;
    }

    /**
     * Gets the value of the amdSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the amdSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAmdSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmdSecType }
     * 
     * 
     */
    public List<AmdSecType> getAmdSec() {
        if (amdSec == null) {
            amdSec = new ArrayList<AmdSecType>();
        }
        return this.amdSec;
    }

    /**
     * Gets the value of the fileSec property.
     * 
     * @return possible object is {@link MetsType.FileSec }
     * 
     */
    public MetsType.FileSec getFileSec() {
        return fileSec;
    }

    /**
     * Sets the value of the fileSec property.
     * 
     * @param value
     *            allowed object is {@link MetsType.FileSec }
     * 
     */
    public void setFileSec(MetsType.FileSec value) {
        this.fileSec = value;
    }

    /**
     * Gets the value of the structMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the structMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getStructMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructMapType }
     * 
     * 
     */
    public List<StructMapType> getStructMap() {
        if (structMap == null) {
            structMap = new ArrayList<StructMapType>();
        }
        return this.structMap;
    }

    /**
     * Gets the value of the structLink property.
     * 
     * @return possible object is {@link MetsType.StructLink }
     * 
     */
    public MetsType.StructLink getStructLink() {
        return structLink;
    }

    /**
     * Sets the value of the structLink property.
     * 
     * @param value
     *            allowed object is {@link MetsType.StructLink }
     * 
     */
    public void setStructLink(MetsType.StructLink value) {
        this.structLink = value;
    }

    /**
     * Gets the value of the behaviorSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the behaviorSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getBehaviorSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorSecType }
     * 
     * 
     */
    public List<BehaviorSecType> getBehaviorSec() {
        if (behaviorSec == null) {
            behaviorSec = new ArrayList<BehaviorSecType>();
        }
        return this.behaviorSec;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the objid property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOBJID() {
        return objid;
    }

    /**
     * Sets the value of the objid property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOBJID(String value) {
        this.objid = value;
    }

    /**
     * Gets the value of the label1 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLabel1() {
        return label1;
    }

    /**
     * Sets the value of the label1 property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLabel1(String value) {
        this.label1 = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPROFILE() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPROFILE(String value) {
        this.profile = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fileGrp" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.loc.gov/METS/}fileGrpType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "fileGrp" })
    public static class FileSec {

        @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
        protected List<MetsType.FileSec.FileGrp> fileGrp;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the fileGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the fileGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getFileGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetsType.FileSec.FileGrp }
         * 
         * 
         */
        public List<MetsType.FileSec.FileGrp> getFileGrp() {
            if (fileGrp == null) {
                fileGrp = new ArrayList<MetsType.FileSec.FileGrp>();
            }
            return this.fileGrp;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.loc.gov/METS/}fileGrpType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FileGrp extends FileGrpType {

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="agent" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;attribute name="ROLE" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="CREATOR"/>
     *                       &lt;enumeration value="EDITOR"/>
     *                       &lt;enumeration value="ARCHIVIST"/>
     *                       &lt;enumeration value="PRESERVATION"/>
     *                       &lt;enumeration value="DISSEMINATOR"/>
     *                       &lt;enumeration value="CUSTODIAN"/>
     *                       &lt;enumeration value="IPOWNER"/>
     *                       &lt;enumeration value="OTHER"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="OTHERROLE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TYPE">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="INDIVIDUAL"/>
     *                       &lt;enumeration value="ORGANIZATION"/>
     *                       &lt;enumeration value="OTHER"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="OTHERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="altRecordID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="metsDocumentID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="ADMID" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
     *       &lt;attribute name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="LASTMODDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "agent", "altRecordID", "metsDocumentID" })
    public static class MetsHdr {

        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected List<MetsType.MetsHdr.Agent> agent;
        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected List<MetsType.MetsHdr.AltRecordID> altRecordID;
        @XmlElement(namespace = "http://www.loc.gov/METS/")
        protected MetsType.MetsHdr.MetsDocumentID metsDocumentID;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "ADMID")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> admid;
        @XmlAttribute(name = "CREATEDATE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdate;
        @XmlAttribute(name = "LASTMODDATE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastmoddate;
        @XmlAttribute(name = "RECORDSTATUS")
        protected String recordstatus;

        /**
         * Gets the value of the agent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the agent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getAgent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetsType.MetsHdr.Agent }
         * 
         * 
         */
        public List<MetsType.MetsHdr.Agent> getAgent() {
            if (agent == null) {
                agent = new ArrayList<MetsType.MetsHdr.Agent>();
            }
            return this.agent;
        }

        /**
         * Gets the value of the altRecordID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the altRecordID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getAltRecordID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetsType.MetsHdr.AltRecordID }
         * 
         * 
         */
        public List<MetsType.MetsHdr.AltRecordID> getAltRecordID() {
            if (altRecordID == null) {
                altRecordID = new ArrayList<MetsType.MetsHdr.AltRecordID>();
            }
            return this.altRecordID;
        }

        /**
         * Gets the value of the metsDocumentID property.
         * 
         * @return possible object is {@link MetsType.MetsHdr.MetsDocumentID }
         * 
         */
        public MetsType.MetsHdr.MetsDocumentID getMetsDocumentID() {
            return metsDocumentID;
        }

        /**
         * Sets the value of the metsDocumentID property.
         * 
         * @param value
         *            allowed object is {@link MetsType.MetsHdr.MetsDocumentID }
         * 
         */
        public void setMetsDocumentID(MetsType.MetsHdr.MetsDocumentID value) {
            this.metsDocumentID = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the admid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the admid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getADMID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getADMID() {
            if (admid == null) {
                admid = new ArrayList<Object>();
            }
            return this.admid;
        }

        /**
         * Gets the value of the createdate property.
         * 
         * @return possible object is {@link XMLGregorianCalendar }
         * 
         */
        public XMLGregorianCalendar getCREATEDATE() {
            return createdate;
        }

        /**
         * Sets the value of the createdate property.
         * 
         * @param value
         *            allowed object is {@link XMLGregorianCalendar }
         * 
         */
        public void setCREATEDATE(XMLGregorianCalendar value) {
            this.createdate = value;
        }

        /**
         * Gets the value of the lastmoddate property.
         * 
         * @return possible object is {@link XMLGregorianCalendar }
         * 
         */
        public XMLGregorianCalendar getLASTMODDATE() {
            return lastmoddate;
        }

        /**
         * Sets the value of the lastmoddate property.
         * 
         * @param value
         *            allowed object is {@link XMLGregorianCalendar }
         * 
         */
        public void setLASTMODDATE(XMLGregorianCalendar value) {
            this.lastmoddate = value;
        }

        /**
         * Gets the value of the recordstatus property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getRECORDSTATUS() {
            return recordstatus;
        }

        /**
         * Sets the value of the recordstatus property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setRECORDSTATUS(String value) {
            this.recordstatus = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;attribute name="ROLE" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="CREATOR"/>
         *             &lt;enumeration value="EDITOR"/>
         *             &lt;enumeration value="ARCHIVIST"/>
         *             &lt;enumeration value="PRESERVATION"/>
         *             &lt;enumeration value="DISSEMINATOR"/>
         *             &lt;enumeration value="CUSTODIAN"/>
         *             &lt;enumeration value="IPOWNER"/>
         *             &lt;enumeration value="OTHER"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="OTHERROLE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TYPE">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="INDIVIDUAL"/>
         *             &lt;enumeration value="ORGANIZATION"/>
         *             &lt;enumeration value="OTHER"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="OTHERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "name", "note" })
        public static class Agent {

            @XmlElement(namespace = "http://www.loc.gov/METS/", required = true)
            protected String name;
            @XmlElement(namespace = "http://www.loc.gov/METS/")
            protected List<String> note;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "ROLE", required = true)
            protected String role;
            @XmlAttribute(name = "OTHERROLE")
            protected String otherrole;
            @XmlAttribute(name = "TYPE")
            protected String type;
            @XmlAttribute(name = "OTHERTYPE")
            protected String othertype;

            /**
             * Gets the value of the name property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the note property.
             * 
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the note property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getNote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNote() {
                if (note == null) {
                    note = new ArrayList<String>();
                }
                return this.note;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the role property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getROLE() {
                return role;
            }

            /**
             * Sets the value of the role property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setROLE(String value) {
                this.role = value;
            }

            /**
             * Gets the value of the otherrole property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getOTHERROLE() {
                return otherrole;
            }

            /**
             * Sets the value of the otherrole property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setOTHERROLE(String value) {
                this.otherrole = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the othertype property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getOTHERTYPE() {
                return othertype;
            }

            /**
             * Sets the value of the othertype property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setOTHERTYPE(String value) {
                this.othertype = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "value" })
        public static class AltRecordID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "TYPE")
            protected String type;

            /**
             * Gets the value of the value property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setTYPE(String value) {
                this.type = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "value" })
        public static class MetsDocumentID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "TYPE")
            protected String type;

            /**
             * Gets the value of the value property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setTYPE(String value) {
                this.type = value;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.loc.gov/METS/}structLinkType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StructLink extends StructLinkType {

    }

}
