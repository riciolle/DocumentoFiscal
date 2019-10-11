//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: PM.05.04 �s 05:03:35 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one2.envio_consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TinfLeitura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TinfLeitura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/one}TCodUfIBGE"/>
 *         &lt;element name="dhPass" type="{http://www.portalfiscal.inf.br/one}TDateTimeUTC"/>
 *         &lt;element name="CNPJOper" type="{http://www.portalfiscal.inf.br/one}TCnpj"/>
 *         &lt;choice>
 *           &lt;element name="cEQP" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *           &lt;sequence>
 *             &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/one}TLatitude"/>
 *             &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/one}TLongitude"/>
 *             &lt;element name="tpSentido">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="E"/>
 *                   &lt;enumeration value="S"/>
 *                   &lt;enumeration value="I"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
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
 *         &lt;element name="foto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;minLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
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
@XmlType(name = "TinfLeitura", propOrder = {
    "cuf",
    "dhPass",
    "cnpjOper",
    "ceqp",
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
public class TinfLeitura {

    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String dhPass;
    @XmlElement(name = "CNPJOper", required = true)
    protected String cnpjOper;
    @XmlElement(name = "cEQP")
    protected String ceqp;
    protected String latitude;
    protected String longitude;
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
     * Obt�m o valor da propriedade cuf.
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
     * Obt�m o valor da propriedade dhPass.
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
     * Obt�m o valor da propriedade cnpjOper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJOper() {
        return cnpjOper;
    }

    /**
     * Define o valor da propriedade cnpjOper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJOper(String value) {
        this.cnpjOper = value;
    }

    /**
     * Obt�m o valor da propriedade ceqp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEQP() {
        return ceqp;
    }

    /**
     * Define o valor da propriedade ceqp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEQP(String value) {
        this.ceqp = value;
    }

    /**
     * Obt�m o valor da propriedade latitude.
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
     * Obt�m o valor da propriedade longitude.
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
     * Obt�m o valor da propriedade tpSentido.
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
     * Define o valor da propriedade tpSentido.
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
     * Obt�m o valor da propriedade placa.
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
     * Obt�m o valor da propriedade tpVeiculo.
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
     * Obt�m o valor da propriedade velocidade.
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
     * Obt�m o valor da propriedade foto.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define o valor da propriedade foto.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Obt�m o valor da propriedade indiceConfianca.
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
     * Obt�m o valor da propriedade pesoBrutoTotal.
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
     * Obt�m o valor da propriedade nroEixos.
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
