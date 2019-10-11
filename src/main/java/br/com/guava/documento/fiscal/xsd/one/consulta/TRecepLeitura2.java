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
import javax.xml.bind.annotation.XmlType;


/**
 * Schema XML de validação da área de dados da mensagem de recepção leitura 2 (todos tipos de operadores)
 * 
 * <p>Classe Java de TRecepLeitura2 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRecepLeitura2">
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
 *         &lt;element name="dhTransm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infLeitura" type="{http://www.portalfiscal.inf.br/one}TinfLeituraCompleta"/>
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
@XmlType(name = "TRecepLeitura2", propOrder = {
    "tpAmb",
    "verAplic",
    "tpTransm",
    "dhTransm",
    "infLeitura"
})
public class TRecepLeitura2 {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String tpTransm;
    @XmlElement(required = true)
    protected String dhTransm;
    @XmlElement(required = true)
    protected TinfLeituraCompleta infLeitura;
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
     * Obtém o valor da propriedade tpTransm.
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
     * Obtém o valor da propriedade dhTransm.
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
     * Obtém o valor da propriedade infLeitura.
     * 
     * @return
     *     possible object is
     *     {@link TinfLeituraCompleta }
     *     
     */
    public TinfLeituraCompleta getInfLeitura() {
        return infLeitura;
    }

    /**
     * Define o valor da propriedade infLeitura.
     * 
     * @param value
     *     allowed object is
     *     {@link TinfLeituraCompleta }
     *     
     */
    public void setInfLeitura(TinfLeituraCompleta value) {
        this.infLeitura = value;
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
