//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.01.11 às 05:07:22 PM BRST 
//


package br.com.guava.documento.fiscal.xsd.sefaz.nacional.mdfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDFe" type="{http://www.portalfiscal.inf.br/mdfe}TMDFe"/>
 *         &lt;element name="protMDFe" type="{http://www.portalfiscal.inf.br/mdfe}TProtMDFe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerMDe" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/mdfe}TIPv4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mdfeProc", propOrder = {
    "mdFe",
    "protMDFe"
})
public class MdfeProc {

    @XmlElement(name = "MDFe", required = true)
    protected TMDFe mdFe;
    @XmlElement(required = true)
    protected TProtMDFe protMDFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * Obtém o valor da propriedade mdFe.
     * 
     * @return
     *     possible object is
     *     {@link TMDFe }
     *     
     */
    public TMDFe getMDFe() {
        return mdFe;
    }

    /**
     * Define o valor da propriedade mdFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TMDFe }
     *     
     */
    public void setMDFe(TMDFe value) {
        this.mdFe = value;
    }

    /**
     * Obtém o valor da propriedade protMDFe.
     * 
     * @return
     *     possible object is
     *     {@link TProtMDFe }
     *     
     */
    public TProtMDFe getProtMDFe() {
        return protMDFe;
    }

    /**
     * Define o valor da propriedade protMDFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TProtMDFe }
     *     
     */
    public void setProtMDFe(TProtMDFe value) {
        this.protMDFe = value;
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

    /**
     * Obtém o valor da propriedade ipTransmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

}
