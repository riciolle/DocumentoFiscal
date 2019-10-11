//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.10.11 às 04:00:42 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TinfLeituraCompleta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
    protected String placa;
    protected String tpVeiculo;
    protected String velocidade;
    protected byte[] foto;
    protected String indiceConfianca;
    protected String pesoBrutoTotal;
    protected String nroEixos;

    /**
     * Obtém o valor da propriedade cuf.
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
     * Define o valor da propriedade cuf.
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
     * Obtém o valor da propriedade dhPass.
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
     * Define o valor da propriedade dhPass.
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
     * Obtém o valor da propriedade cOperador.
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
     * Define o valor da propriedade cOperador.
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
     * Obtém o valor da propriedade cocr.
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
     * Define o valor da propriedade cocr.
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
     * Obtém o valor da propriedade csld.
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
     * Define o valor da propriedade csld.
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
     * Obtém o valor da propriedade latitude.
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
     * Define o valor da propriedade latitude.
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
     * Obtém o valor da propriedade longitude.
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
     * Define o valor da propriedade longitude.
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
     * Obtém o valor da propriedade placa.
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
     * Define o valor da propriedade placa.
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
     * Obtém o valor da propriedade tpVeiculo.
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
     * Define o valor da propriedade tpVeiculo.
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
     * Obtém o valor da propriedade velocidade.
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
     * Define o valor da propriedade velocidade.
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
     * Obtém o valor da propriedade foto.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * Define o valor da propriedade foto.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto(byte[] value) {
        this.foto = value;
    }

    /**
     * Obtém o valor da propriedade indiceConfianca.
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
     * Define o valor da propriedade indiceConfianca.
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
     * Obtém o valor da propriedade pesoBrutoTotal.
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
     * Define o valor da propriedade pesoBrutoTotal.
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
     * Obtém o valor da propriedade nroEixos.
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
     * Define o valor da propriedade nroEixos.
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
