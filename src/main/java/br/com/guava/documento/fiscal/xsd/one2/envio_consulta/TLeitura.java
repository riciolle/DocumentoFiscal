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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * <p>Classe Java de TLeitura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TLeitura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip'/>
 *         &lt;element name="infMDFe" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chMDFe" type="{http://www.portalfiscal.inf.br/one}TChMDFe"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infCompl">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpLeitura">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/one}TString">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xEQP" type="{http://www.portalfiscal.inf.br/one}TString" minOccurs="0"/>
 *                   &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/one}TLatitude"/>
 *                   &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/one}TLongitude"/>
 *                   &lt;element name="placa" type="{http://www.portalfiscal.inf.br/one}TPlaca"/>
 *                   &lt;element name="tpSentido">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="E"/>
 *                         &lt;enumeration value="S"/>
 *                         &lt;enumeration value="I"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NSULeitura" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="NSU" use="required" type="{http://www.portalfiscal.inf.br/one}TNSU" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLeitura", propOrder = {
    "any",
    "infMDFe",
    "infCompl"
})
public class TLeitura {

    @XmlAnyElement
    protected Element any;
    protected List<TLeitura.InfMDFe> infMDFe;
    @XmlElement(required = true)
    protected TLeitura.InfCompl infCompl;
    @XmlAttribute(name = "NSU", required = true)
    protected String nsu;

    /**
     * Obt�m o valor da propriedade any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Define o valor da propriedade any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Gets the value of the infMDFe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infMDFe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfMDFe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLeitura.InfMDFe }
     * 
     * 
     */
    public List<TLeitura.InfMDFe> getInfMDFe() {
        if (infMDFe == null) {
            infMDFe = new ArrayList<TLeitura.InfMDFe>();
        }
        return this.infMDFe;
    }

    /**
     * Obt�m o valor da propriedade infCompl.
     * 
     * @return
     *     possible object is
     *     {@link TLeitura.InfCompl }
     *     
     */
    public TLeitura.InfCompl getInfCompl() {
        return infCompl;
    }

    /**
     * Define o valor da propriedade infCompl.
     * 
     * @param value
     *     allowed object is
     *     {@link TLeitura.InfCompl }
     *     
     */
    public void setInfCompl(TLeitura.InfCompl value) {
        this.infCompl = value;
    }

    /**
     * Obt�m o valor da propriedade nsu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSU() {
        return nsu;
    }

    /**
     * Define o valor da propriedade nsu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSU(String value) {
        this.nsu = value;
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
     *       &lt;sequence>
     *         &lt;element name="tpLeitura">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/one}TString">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xEQP" type="{http://www.portalfiscal.inf.br/one}TString" minOccurs="0"/>
     *         &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/one}TLatitude"/>
     *         &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/one}TLongitude"/>
     *         &lt;element name="placa" type="{http://www.portalfiscal.inf.br/one}TPlaca"/>
     *         &lt;element name="tpSentido">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="E"/>
     *               &lt;enumeration value="S"/>
     *               &lt;enumeration value="I"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NSULeitura" type="{http://www.portalfiscal.inf.br/one}TNSU"/>
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
        "tpLeitura",
        "xeqp",
        "latitude",
        "longitude",
        "placa",
        "tpSentido",
        "nsuLeitura"
    })
    public static class InfCompl {

        @XmlElement(required = true)
        protected String tpLeitura;
        @XmlElement(name = "xEQP")
        protected String xeqp;
        @XmlElement(required = true)
        protected String latitude;
        @XmlElement(required = true)
        protected String longitude;
        @XmlElement(required = true)
        protected String placa;
        @XmlElement(required = true)
        protected String tpSentido;
        @XmlElement(name = "NSULeitura", required = true)
        protected String nsuLeitura;

        /**
         * Obt�m o valor da propriedade tpLeitura.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpLeitura() {
            return tpLeitura;
        }

        /**
         * Define o valor da propriedade tpLeitura.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpLeitura(String value) {
            this.tpLeitura = value;
        }

        /**
         * Obt�m o valor da propriedade xeqp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXEQP() {
            return xeqp;
        }

        /**
         * Define o valor da propriedade xeqp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXEQP(String value) {
            this.xeqp = value;
        }

        /**
         * Obt�m o valor da propriedade latitude.
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
         * Obt�m o valor da propriedade longitude.
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
         * Obt�m o valor da propriedade placa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Define o valor da propriedade placa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

        /**
         * Obt�m o valor da propriedade tpSentido.
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
         * Obt�m o valor da propriedade nsuLeitura.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSULeitura() {
            return nsuLeitura;
        }

        /**
         * Define o valor da propriedade nsuLeitura.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSULeitura(String value) {
            this.nsuLeitura = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="chMDFe" type="{http://www.portalfiscal.inf.br/one}TChMDFe"/>
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
        "chMDFe"
    })
    public static class InfMDFe {

        @XmlElement(required = true)
        protected String chMDFe;

        /**
         * Obt�m o valor da propriedade chMDFe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChMDFe() {
            return chMDFe;
        }

        /**
         * Define o valor da propriedade chMDFe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChMDFe(String value) {
            this.chMDFe = value;
        }

    }

}
