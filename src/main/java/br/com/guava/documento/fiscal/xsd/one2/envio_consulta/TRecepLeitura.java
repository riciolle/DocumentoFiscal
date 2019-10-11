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
 * Schema XML de valida��o da �rea de dados da mensagem de recep��o leitura (todos tipos de operadores)
 * 
 * <p>Classe Java de TRecepLeitura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRecepLeitura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/one}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/one}TVerAplic"/>
 *         &lt;element name="tpTransm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="A"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhTransm" type="{http://www.portalfiscal.inf.br/one}TDateTimeUTC"/>
 *         &lt;element name="infLeitura" type="{http://www.portalfiscal.inf.br/one}TinfLeitura"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/one}TVersao" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "oneRecepLeitura")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRecepLeitura", propOrder = {
    "tpAmb",
    "verAplic",
    "tpTransm",
    "dhTransm",
    "infLeitura"
})
public class TRecepLeitura {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String tpTransm;
    @XmlElement(required = true)
    protected String dhTransm;
    @XmlElement(required = true)
    protected TinfLeitura infLeitura;
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
     * Obt�m o valor da propriedade tpTransm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpTransm() {
        return tpTransm;
    }

    /**
     * Define o valor da propriedade tpTransm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpTransm(String value) {
        this.tpTransm = value;
    }

    /**
     * Obt�m o valor da propriedade dhTransm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhTransm() {
        return dhTransm;
    }

    /**
     * Define o valor da propriedade dhTransm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhTransm(String value) {
        this.dhTransm = value;
    }

    /**
     * Obt�m o valor da propriedade infLeitura.
     * 
     * @return
     *     possible object is
     *     {@link TinfLeitura }
     *     
     */
    public TinfLeitura getInfLeitura() {
        return infLeitura;
    }

    /**
     * Define o valor da propriedade infLeitura.
     * 
     * @param value
     *     allowed object is
     *     {@link TinfLeitura }
     *     
     */
    public void setInfLeitura(TinfLeitura value) {
        this.infLeitura = value;
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
