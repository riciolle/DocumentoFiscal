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


/**
 * Tipo Evento
 * 
 * <p>Classe Java de TConfRec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConfRec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infConfRec">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *                   &lt;choice>
 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *                   &lt;/choice>
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
 *                   &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TdetEvento"/>
 *                   &lt;element name="dtRecDev" type="{http://www.portalfiscal.inf.br/nfe}TVerEnvEvento"/>
 *                   &lt;element name="infFisco" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="regLog" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Signature" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerEvento" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConfRec", propOrder = {
    "infConfRec",
    "signature"
})
public class TConfRec {

    @XmlElement(required = true)
    protected TConfRec.InfConfRec infConfRec;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade infConfRec.
     * 
     * @return
     *     possible object is
     *     {@link TConfRec.InfConfRec }
     *     
     */
    public TConfRec.InfConfRec getInfConfRec() {
        return infConfRec;
    }

    /**
     * Define o valor da propriedade infConfRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TConfRec.InfConfRec }
     *     
     */
    public void setInfConfRec(TConfRec.InfConfRec value) {
        this.infConfRec = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
     *         &lt;choice>
     *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
     *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
     *         &lt;/choice>
     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
     *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TdetEvento"/>
     *         &lt;element name="dtRecDev" type="{http://www.portalfiscal.inf.br/nfe}TVerEnvEvento"/>
     *         &lt;element name="infFisco" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="regLog" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "cuf",
        "tpAmb",
        "cnpj",
        "cpf",
        "chNFe",
        "cStat",
        "dtRecDev",
        "infFisco"
    })
    public static class InfConfRec {

        @XmlElement(name = "cUF", required = true)
        protected String cuf;
        @XmlElement(required = true)
        protected String tpAmb;
        @XmlElement(name = "CNPJ")
        protected String cnpj;
        @XmlElement(name = "CPF")
        protected String cpf;
        @XmlElement(required = true)
        protected String chNFe;
        @XmlElement(required = true)
        protected String cStat;
        @XmlElement(required = true)
        protected String dtRecDev;
        protected TConfRec.InfConfRec.InfFisco infFisco;

        /**
         * Obtém o valor da propriedade cuf.
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
         * Obtém o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade cpf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPF() {
            return cpf;
        }

        /**
         * Define o valor da propriedade cpf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPF(String value) {
            this.cpf = value;
        }

        /**
         * Obtém o valor da propriedade chNFe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Define o valor da propriedade chNFe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

        /**
         * Obtém o valor da propriedade cStat.
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
         * Obtém o valor da propriedade dtRecDev.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDtRecDev() {
            return dtRecDev;
        }

        /**
         * Define o valor da propriedade dtRecDev.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDtRecDev(String value) {
            this.dtRecDev = value;
        }

        /**
         * Obtém o valor da propriedade infFisco.
         * 
         * @return
         *     possible object is
         *     {@link TConfRec.InfConfRec.InfFisco }
         *     
         */
        public TConfRec.InfConfRec.InfFisco getInfFisco() {
            return infFisco;
        }

        /**
         * Define o valor da propriedade infFisco.
         * 
         * @param value
         *     allowed object is
         *     {@link TConfRec.InfConfRec.InfFisco }
         *     
         */
        public void setInfFisco(TConfRec.InfConfRec.InfFisco value) {
            this.infFisco = value;
        }


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
         *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="regLog" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
            "cnpj",
            "login",
            "regLog"
        })
        public static class InfFisco {

            @XmlElement(name = "CNPJ", required = true)
            protected Object cnpj;
            @XmlElement(required = true)
            protected Object login;
            @XmlElement(required = true)
            protected Object regLog;

            /**
             * Obtém o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCNPJ(Object value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade login.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getLogin() {
                return login;
            }

            /**
             * Define o valor da propriedade login.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setLogin(Object value) {
                this.login = value;
            }

            /**
             * Obtém o valor da propriedade regLog.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRegLog() {
                return regLog;
            }

            /**
             * Define o valor da propriedade regLog.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRegLog(Object value) {
                this.regLog = value;
            }

        }

    }

}
