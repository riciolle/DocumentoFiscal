//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: AM.10.20 �s 11:17:53 AM BRST 
//


package br.com.guava.documento.fiscal.xsd.sefaz.nacional.mdfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Documento Fiscal Eletr�nico MDF-e
 * 
 * <p>Classe Java de TMDFeDFe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TMDFeDFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procMDFe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="2" minOccurs="2">
 *                   &lt;any/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerProcMDFe" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procEventoMDFe" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="2" minOccurs="2">
 *                   &lt;any/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerProcMDFe" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMDFeDFe", propOrder = {
    "procMDFe",
    "procEventoMDFe"
})
public class TMDFeDFe {

    @XmlElement(required = true)
    protected MdfeProc procMDFe;
    protected List<TProcEvento> procEventoMDFe;

    /**
     * Obt�m o valor da propriedade procMDFe.
     * 
     * @return
     *     possible object is
     *     {@link TMDFeDFe.ProcMDFe }
     *     
     */
    public MdfeProc getProcMDFe() {
        return procMDFe;
    }

    /**
     * Define o valor da propriedade procMDFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TMDFeDFe.ProcMDFe }
     *     
     */
    public void setProcMDFe(MdfeProc value) {
        this.procMDFe = value;
    }

    /**
     * Gets the value of the procEventoMDFe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procEventoMDFe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcEventoMDFe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMDFeDFe.ProcEventoMDFe }
     * 
     * 
     */
    public List<TProcEvento> getProcEventoMDFe() {
        if (procEventoMDFe == null) {
            procEventoMDFe = new ArrayList<TProcEvento>();
        }
        return this.procEventoMDFe;
    }

}