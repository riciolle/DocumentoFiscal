//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.10.20 às 11:15:46 AM BRST 
//


package br.com.guava.documento.fiscal.xsd.nfe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Tipo Registro de Eventos da NFe - NFeLog
 * 
 * <p>Classe Java de TNFeLog complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TNFeLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procNFe" type="{http://www.portalfiscal.inf.br/nfe}TNfeProc"/>
 *         &lt;element name="procCanc" type="{http://www.portalfiscal.inf.br/nfe}TProcCancNFe" minOccurs="0"/>
 *         &lt;element name="eveNFe" type="{http://www.portalfiscal.inf.br/nfe}TProcEvento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerNFeLog" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNFeLog", propOrder = {
    "procNFe",
    "procCanc",
    "eveNFe"
})
public class TNFeLog {

    @XmlElement(required = true)
    protected TNfeProc procNFe;
    protected TProcCancNFe procCanc;
    protected List<TProcEvento> eveNFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade procNFe.
     * 
     * @return
     *     possible object is
     *     {@link TNfeProc }
     *     
     */
    public TNfeProc getProcNFe() {
        return procNFe;
    }

    /**
     * Define o valor da propriedade procNFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TNfeProc }
     *     
     */
    public void setProcNFe(TNfeProc value) {
        this.procNFe = value;
    }

    /**
     * Obtém o valor da propriedade procCanc.
     * 
     * @return
     *     possible object is
     *     {@link TProcCancNFe }
     *     
     */
    public TProcCancNFe getProcCanc() {
        return procCanc;
    }

    /**
     * Define o valor da propriedade procCanc.
     * 
     * @param value
     *     allowed object is
     *     {@link TProcCancNFe }
     *     
     */
    public void setProcCanc(TProcCancNFe value) {
        this.procCanc = value;
    }

    /**
     * Gets the value of the eveNFe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eveNFe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEveNFe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TProcEvento }
     * 
     * 
     */
    public List<TProcEvento> getEveNFe() {
        if (eveNFe == null) {
            eveNFe = new ArrayList<TProcEvento>();
        }
        return this.eveNFe;
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
