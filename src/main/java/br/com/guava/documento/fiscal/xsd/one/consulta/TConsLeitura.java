//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.10.11 às 04:00:42 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one.consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de validação da área de dados da mensagem de consulta leitura
 * 
 * <p>Classe Java de TConsLeitura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConsLeitura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/one}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/one}TVerAplic"/>
 *         &lt;element name="tpDist">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ultNSU" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *         &lt;element name="cOperador" type="{http://www.portalfiscal.inf.br/one}TOperador" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="cSLD" type="{http://www.portalfiscal.inf.br/one}TNSU" minOccurs="0"/>
 *           &lt;element name="cOCR" type="{http://www.portalfiscal.inf.br/one}TNSU" minOccurs="0"/>
 *         &lt;/choice>
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
@XmlType(name = "TConsLeitura", propOrder = {
    "tpAmb",
    "verAplic",
    "tpDist",
    "ultNSU",
    "cOperador",
    "csld",
    "cocr"
})
@XmlSeeAlso({
    OneConsLeitura.class
})
public class TConsLeitura {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    protected long tpDist;
    @XmlElement(required = true)
    protected String ultNSU;
    protected String cOperador;
    @XmlElement(name = "cSLD")
    protected String csld;
    @XmlElement(name = "cOCR")
    protected String cocr;
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
     * Obtém o valor da propriedade tpDist.
     * 
     */
    public long getTpDist() {
        return tpDist;
    }

    /**
     * Define o valor da propriedade tpDist.
     * 
     */
    public void setTpDist(long value) {
        this.tpDist = value;
    }

    /**
     * Obtém o valor da propriedade ultNSU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltNSU() {
        return ultNSU;
    }

    /**
     * Define o valor da propriedade ultNSU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltNSU(String value) {
        this.ultNSU = value;
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
