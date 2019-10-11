//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.10.20 às 11:15:46 AM BRST 
//


package br.com.guava.documento.fiscal.xsd.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Pedido de Cancelamento de  NF-e processado
 * 
 * <p>Classe Java de TProcCancNFe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TProcCancNFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancNFe" type="{http://www.portalfiscal.inf.br/nfe}TCancNFe"/>
 *         &lt;element name="retCancNFe" type="{http://www.portalfiscal.inf.br/nfe}TRetCancNFe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerCancNFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcCancNFe", propOrder = {
    "cancNFe",
    "retCancNFe"
})
public class TProcCancNFe {

    @XmlElement(required = true)
    protected TCancNFe cancNFe;
    @XmlElement(required = true)
    protected TRetCancNFe retCancNFe;
    @XmlAttribute(name = "versao", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Obtém o valor da propriedade cancNFe.
     * 
     * @return
     *     possible object is
     *     {@link TCancNFe }
     *     
     */
    public TCancNFe getCancNFe() {
        return cancNFe;
    }

    /**
     * Define o valor da propriedade cancNFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TCancNFe }
     *     
     */
    public void setCancNFe(TCancNFe value) {
        this.cancNFe = value;
    }

    /**
     * Obtém o valor da propriedade retCancNFe.
     * 
     * @return
     *     possible object is
     *     {@link TRetCancNFe }
     *     
     */
    public TRetCancNFe getRetCancNFe() {
        return retCancNFe;
    }

    /**
     * Define o valor da propriedade retCancNFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetCancNFe }
     *     
     */
    public void setRetCancNFe(TRetCancNFe value) {
        this.retCancNFe = value;
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
