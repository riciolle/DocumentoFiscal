//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.11 at 04:28:33 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one.manutencao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TinfLeituraCompleta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TinfLeituraCompleta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/one}TCodUfIBGE"/>
 *         &lt;element name="dhPass">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cOperador">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/one}TOperador">
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="cOCR" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *           &lt;element name="cSLD" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *           &lt;sequence>
 *             &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/one}TLatitude"/>
 *             &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/one}TLongitude"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="placa" type="{http://www.portalfiscal.inf.br/one}TPlaca"/>
 *         &lt;element name="tpVeiculo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/one}TString">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="velocidade" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/one}TDec_0302">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="indiceConfianca" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="100|[0]?[0-9]?[0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pesoBrutoTotal" type="{http://www.portalfiscal.inf.br/one}TDec_1104Opc" minOccurs="0"/>
 *         &lt;element name="nroEixos" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="(0-10)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "TinfLeituraCompleta", propOrder = {
    "cuf",
    "dhPass",
    "cOperador",
    "cocr",
    "csld",
    "latitude",
    "longitude",
    "tpSentido",
    "placa",
    "tpVeiculo",
    "velocidade",
    "foto",
    "indiceConfianca",
    "pesoBrutoTotal",
    "nroEixos"
})
public class TinfLeituraCompleta {

    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String dhPass;
    @XmlElement(required = true)
    protected String cOperador;
    @XmlElement(name = "cOCR")
    protected String cocr;
    @XmlElement(name = "cSLD")
    protected String csld;
    protected String latitude;
    protected String longitude;
    @XmlElement(required = true)
    protected String tpSentido;
    @XmlElement(required = true)
    protected String placa;
    protected String tpVeiculo;
    protected String velocidade;
    protected String foto;
    protected String indiceConfianca;
    protected String pesoBrutoTotal;
    protected String nroEixos;

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
     * Gets the value of the dhPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhPass() {
        return dhPass;
    }

    /**
     * Sets the value of the dhPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhPass(String value) {
        this.dhPass = value;
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
     * Gets the value of the cocr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOCR() {
        return cocr;
    }

    /**
     * Sets the value of the cocr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOCR(String value) {
        this.cocr = value;
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
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the tpVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpVeiculo() {
        return tpVeiculo;
    }

    /**
     * Sets the value of the tpVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpVeiculo(String value) {
        this.tpVeiculo = value;
    }

    /**
     * Gets the value of the velocidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocidade() {
        return velocidade;
    }

    /**
     * Sets the value of the velocidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocidade(String value) {
        this.velocidade = value;
    }

    /**
     * Gets the value of the foto property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Sets the value of the foto property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Gets the value of the indiceConfianca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndiceConfianca() {
        return indiceConfianca;
    }

    /**
     * Sets the value of the indiceConfianca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndiceConfianca(String value) {
        this.indiceConfianca = value;
    }

    /**
     * Gets the value of the pesoBrutoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    /**
     * Sets the value of the pesoBrutoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBrutoTotal(String value) {
        this.pesoBrutoTotal = value;
    }

    /**
     * Gets the value of the nroEixos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroEixos() {
        return nroEixos;
    }

    /**
     * Sets the value of the nroEixos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroEixos(String value) {
        this.nroEixos = value;
    }

}
