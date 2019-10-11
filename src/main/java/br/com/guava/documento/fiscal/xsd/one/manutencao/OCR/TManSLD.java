//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.12.12 às 11:13:07 AM BRST 
//


package br.com.guava.documento.fiscal.xsd.one.manutencao.OCR;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de validação da área de dados da mensagem de manutenção SLD
 * 
 * <p>Classe Java de TManSLD complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade tpAmb.
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
     * Obtém o valor da propriedade verAplic.
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
     * Obtém o valor da propriedade tpMan.
     * 
     */
    public long getTpMan() {
        return tpMan;
    }

    /**
     * Define o valor da propriedade tpMan.
     * 
     */
    public void setTpMan(long value) {
        this.tpMan = value;
    }

    /**
     * Obtém o valor da propriedade dReg.
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
     * Define o valor da propriedade dReg.
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
     * Obtém o valor da propriedade xsld.
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
     * Define o valor da propriedade xsld.
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
     * Obtém o valor da propriedade tpSentido.
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
     * Obtém o valor da propriedade versao.
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
