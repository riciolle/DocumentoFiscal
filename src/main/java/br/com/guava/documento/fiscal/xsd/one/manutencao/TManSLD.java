//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.11 at 11:08:17 AM BRT 
//


package br.com.guava.documento.fiscal.xsd.one.manutencao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de validação da área de dados da mensagem de manutenção SLD
 * 
 * <p>Java class for TManSLD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TManSLD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/one}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/one}TVerAplic"/>
 *         &lt;element name="tpMan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dReg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/one}TData">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cOperador" type="{http://www.portalfiscal.inf.br/one}TOperador"/>
 *         &lt;element name="cSLD" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *         &lt;element name="xSLD" type="{http://www.portalfiscal.inf.br/one}TString"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/one}TCodUfIBGE"/>
 *         &lt;element name="tpSentido">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/one}TLatitude"/>
 *         &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/one}TLongitude"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/one}TVersao" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TManSLD", propOrder = {
    "tpAmb",
    "verAplic",
    "tpMan",
    "dReg",
    "cOperador",
    "csld",
    "xsld",
    "cuf",
    "tpSentido",
    "latitude",
    "longitude"
})
public class TManSLD {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    protected long tpMan;
    @XmlElement(required = true)
    protected String dReg;
    @XmlElement(required = true)
    protected String cOperador;
    @XmlElement(name = "cSLD", required = true)
    protected String csld;
    @XmlElement(name = "xSLD", required = true)
    protected String xsld;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String tpSentido;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String longitude;
    @XmlAttribute(required = true)
    protected String versao;

    /**
     * Gets the value of the tpAmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the verAplic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Sets the value of the verAplic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Gets the value of the tpMan property.
     * 
     */
    public long getTpMan() {
        return tpMan;
    }

    /**
     * Sets the value of the tpMan property.
     * 
     */
    public void setTpMan(long value) {
        this.tpMan = value;
    }

    /**
     * Gets the value of the dReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDReg() {
        return dReg;
    }

    /**
     * Sets the value of the dReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDReg(String value) {
        this.dReg = value;
    }

    /**
     * Gets the value of the cOperador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOperador() {
        return cOperador;
    }

    /**
     * Sets the value of the cOperador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOperador(String value) {
        this.cOperador = value;
    }

    /**
     * Gets the value of the csld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSLD() {
        return csld;
    }

    /**
     * Sets the value of the csld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSLD(String value) {
        this.csld = value;
    }

    /**
     * Gets the value of the xsld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSLD() {
        return xsld;
    }

    /**
     * Sets the value of the xsld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSLD(String value) {
        this.xsld = value;
    }

    /**
     * Gets the value of the cuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Sets the value of the cuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Gets the value of the tpSentido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpSentido() {
        return tpSentido;
    }

    /**
     * Sets the value of the tpSentido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpSentido(String value) {
        this.tpSentido = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
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
