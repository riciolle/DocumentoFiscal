//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: PM.05.04 �s 05:03:35 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one2.envio_consulta;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de valida��o de retorno da mensagem de distribui��o leitura
 * 
 * <p>Classe Java de TRetDistLeitura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetDistLeitura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/one}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/one}TVerAplic"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/one}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/one}TMotivo"/>
 *         &lt;element name="dhResp" type="{http://www.portalfiscal.inf.br/one}TDateTimeUTC"/>
 *         &lt;element name="ultNSU" type="{http://www.portalfiscal.inf.br/one}TNSU" minOccurs="0"/>
 *         &lt;element name="ultNSUONE" type="{http://www.portalfiscal.inf.br/one}TNSU" minOccurs="0"/>
 *         &lt;element name="loteDistLeitura" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="50">
 *                   &lt;element name="leitura" type="{http://www.portalfiscal.inf.br/one}TLeitura"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "TRetDistLeitura", propOrder = {
    "tpAmb",
    "verAplic",
    "cStat",
    "xMotivo",
    "dhResp",
    "ultNSU",
    "ultNSUONE",
    "loteDistLeitura"
})
public class TRetDistLeitura {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    @XmlElement(required = true)
    protected String dhResp;
    protected String ultNSU;
    protected String ultNSUONE;
    protected TRetDistLeitura.LoteDistLeitura loteDistLeitura;
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
     * Obt�m o valor da propriedade cStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Define o valor da propriedade cStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Obt�m o valor da propriedade xMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Define o valor da propriedade xMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Obt�m o valor da propriedade dhResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhResp() {
        return dhResp;
    }

    /**
     * Define o valor da propriedade dhResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhResp(String value) {
        this.dhResp = value;
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
     * Obt�m o valor da propriedade ultNSUONE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltNSUONE() {
        return ultNSUONE;
    }

    /**
     * Define o valor da propriedade ultNSUONE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltNSUONE(String value) {
        this.ultNSUONE = value;
    }

    /**
     * Obt�m o valor da propriedade loteDistLeitura.
     * 
     * @return
     *     possible object is
     *     {@link TRetDistLeitura.LoteDistLeitura }
     *     
     */
    public TRetDistLeitura.LoteDistLeitura getLoteDistLeitura() {
        return loteDistLeitura;
    }

    /**
     * Define o valor da propriedade loteDistLeitura.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetDistLeitura.LoteDistLeitura }
     *     
     */
    public void setLoteDistLeitura(TRetDistLeitura.LoteDistLeitura value) {
        this.loteDistLeitura = value;
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="50">
     *         &lt;element name="leitura" type="{http://www.portalfiscal.inf.br/one}TLeitura"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "leitura"
    })
    public static class LoteDistLeitura {

        @XmlElement(required = true)
        protected List<TLeitura> leitura;

        /**
         * Gets the value of the leitura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the leitura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeitura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TLeitura }
         * 
         * 
         */
        public List<TLeitura> getLeitura() {
            if (leitura == null) {
                leitura = new ArrayList<TLeitura>();
            }
            return this.leitura;
        }

    }

}
