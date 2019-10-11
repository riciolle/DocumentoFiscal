//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: PM.05.04 �s 05:03:35 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one2.envio_consulta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de valida��o da �rea de dados da mensagem de distribui��o leitura
 * 
 * <p>Classe Java de TDistLeitura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDistLeitura">
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
 *         &lt;element name="NSUFin" type="{http://www.portalfiscal.inf.br/one}TNSU" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CNPJOper" type="{http://www.portalfiscal.inf.br/one}TCnpj"/>
 *             &lt;element name="cEQP" type="{http://www.portalfiscal.inf.br/one}TNSU" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/one}TCodUfIBGE"/>
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
@XmlRootElement(name = "oneDistLeitura")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDistLeitura", propOrder = {
    "tpAmb",
    "verAplic",
    "tpDist",
    "ultNSU",
    "nsuFin",
    "cnpjOper",
    "ceqp",
    "cuf"
})
public class TDistLeitura {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    protected String tpDist;
    @XmlElement(required = true)
    protected String ultNSU;
    @XmlElement(name = "NSUFin")
    protected String nsuFin;
    @XmlElement(name = "CNPJOper")
    protected String cnpjOper;
    @XmlElement(name = "cEQP")
    protected String ceqp;
    @XmlElement(name = "cUF")
    protected String cuf;
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
     * Obt�m o valor da propriedade tpDist.
     * 
     */
    public String getTpDist() {
        return tpDist;
    }

    /**
     * Define o valor da propriedade tpDist.
     * 
     */
    public void setTpDist(String value) {
        this.tpDist = value;
    }

    /**
     * Obt�m o valor da propriedade ultNSU.
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
     * Obt�m o valor da propriedade nsuFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSUFin() {
        return nsuFin;
    }

    /**
     * Define o valor da propriedade nsuFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSUFin(String value) {
        this.nsuFin = value;
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
