//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.23 at 02:20:15 PM BRST 
//


package br.com.guava.documento.fiscal.xsd.cte;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * Tipo Documento Fiscal Eletrônico CT-e
 * 
 * <p>Java class for TCTeDFe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCTeDFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procCTe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="2" minOccurs="2">
 *                   &lt;any/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;whiteSpace value="preserve"/>
 *                       &lt;enumeration value="1.03"/>
 *                       &lt;enumeration value="1.04"/>
 *                       &lt;enumeration value="2.00"/>
 *                       &lt;enumeration value="3.00"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procCancCTe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="2" minOccurs="2">
 *                   &lt;any/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;whiteSpace value="preserve"/>
 *                       &lt;enumeration value="1.03"/>
 *                       &lt;enumeration value="1.04"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procEventoCTe" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="2" minOccurs="2">
 *                   &lt;any/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;whiteSpace value="preserve"/>
 *                       &lt;enumeration value="1.04"/>
 *                       &lt;enumeration value="2.00"/>
 *                       &lt;enumeration value="3.00"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCTeDFe", propOrder = {
    "procCTe",
    "procCancCTe",
    "procEventoCTe"
})
public class TCTeDFe {

    @XmlElement(required = true)
    protected CteProc procCTe;
    protected TCTeDFe.ProcCancCTe procCancCTe;
    protected List<ProcEventoCTe> procEventoCTe;

    /**
     * Gets the value of the procCTe property.
     * 
     * @return
     *     possible object is
     *     {@link CteProc }
     *     
     */
    public CteProc getProcCTe() {
        return procCTe;
    }

    /**
     * Sets the value of the procCTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CteProc }
     *     
     */
    public void setProcCTe(CteProc value) {
        this.procCTe = value;
    }

    /**
     * Gets the value of the procCancCTe property.
     * 
     * @return
     *     possible object is
     *     {@link TCTeDFe.ProcCancCTe }
     *     
     */
    public TCTeDFe.ProcCancCTe getProcCancCTe() {
        return procCancCTe;
    }

    /**
     * Sets the value of the procCancCTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTeDFe.ProcCancCTe }
     *     
     */
    public void setProcCancCTe(TCTeDFe.ProcCancCTe value) {
        this.procCancCTe = value;
    }

    /**
     * Gets the value of the procEventoCTe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procEventoCTe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcEventoCTe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCTeDFe.ProcEventoCTe }
     * 
     * 
     */
    public List<ProcEventoCTe> getProcEventoCTe() {
        if (procEventoCTe == null) {
            procEventoCTe = new ArrayList<ProcEventoCTe>();
        }
        return this.procEventoCTe;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="2" minOccurs="2">
     *         &lt;any/>
     *       &lt;/sequence>
     *       &lt;attribute name="versao" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;whiteSpace value="preserve"/>
     *             &lt;enumeration value="1.03"/>
     *             &lt;enumeration value="1.04"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ProcCancCTe {

        @XmlAnyElement
        protected List<Element> any;
        @XmlAttribute(required = true)
        protected String versao;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

        /**
         * Gets the value of the versao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Sets the value of the versao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersao(String value) {
            this.versao = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="2" minOccurs="2">
     *         &lt;any/>
     *       &lt;/sequence>
     *       &lt;attribute name="versao" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;whiteSpace value="preserve"/>
     *             &lt;enumeration value="1.03"/>
     *             &lt;enumeration value="1.04"/>
     *             &lt;enumeration value="2.00"/>
     *             &lt;enumeration value="3.00"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ProcCTe {

        @XmlAnyElement
        protected List<Element> any;
        @XmlAttribute(required = true)
        protected String versao;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

        /**
         * Gets the value of the versao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Sets the value of the versao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersao(String value) {
            this.versao = value;
        }

    }

}
