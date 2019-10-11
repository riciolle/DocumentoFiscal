//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: AM.05.03 �s 10:26:33 AM BRT 
//


package br.com.guava.documento.fiscal.xsd.one2.manutencao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de valida��o da �rea de dados da mensagem de manuten��o equipamentos
 * 
 * <p>Classe Java de TManEQP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TManEQP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/one}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/one}TVerAplic"/>
 *         &lt;element name="tpMan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhReg" type="{http://www.portalfiscal.inf.br/one}TDateTimeUTC"/>
 *         &lt;element name="CNPJOper" type="{http://www.portalfiscal.inf.br/one}TCnpj"/>
 *         &lt;element name="cEQP" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *         &lt;element name="xEQP" type="{http://www.portalfiscal.inf.br/one}TString"/>
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
 *         &lt;element name="tpEQP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "TManEQP", propOrder = {
    "tpAmb",
    "verAplic",
    "tpMan",
    "dhReg",
    "cnpjOper",
    "ceqp",
    "xeqp",
    "cuf",
    "tpSentido",
    "latitude",
    "longitude",
    "tpEQP"
})
public class TManEQP {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String tpMan;
    @XmlElement(required = true)
    protected String dhReg;
    @XmlElement(name = "CNPJOper", required = true)
    protected String cnpjOper;
    @XmlElement(name = "cEQP", required = true)
    protected String ceqp;
    @XmlElement(name = "xEQP", required = true)
    protected String xeqp;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String tpSentido;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(required = true)
    protected String tpEQP;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obt�m o valor da propriedade tpAmb.
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
     * Define o valor da propriedade tpAmb.
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
     * Obt�m o valor da propriedade verAplic.
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
     * Define o valor da propriedade verAplic.
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
     * Obt�m o valor da propriedade tpMan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpMan() {
        return tpMan;
    }

    /**
     * Define o valor da propriedade tpMan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpMan(String value) {
        this.tpMan = value;
    }

    /**
     * Obt�m o valor da propriedade dhReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhReg() {
        return dhReg;
    }

    /**
     * Define o valor da propriedade dhReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhReg(String value) {
        this.dhReg = value;
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
     * Obt�m o valor da propriedade xeqp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXEQP() {
        return xeqp;
    }

    /**
     * Define o valor da propriedade xeqp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXEQP(String value) {
        this.xeqp = value;
    }

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
     * Obt�m o valor da propriedade tpEQP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpEQP() {
        return tpEQP;
    }

    /**
     * Define o valor da propriedade tpEQP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpEQP(String value) {
        this.tpEQP = value;
    }

    /**
     * Obt�m o valor da propriedade versao.
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
     * Define o valor da propriedade versao.
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
