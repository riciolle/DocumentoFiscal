//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.11 at 04:28:33 PM BRT 
//


package br.com.guava.documento.fiscal.xsd.one.manutencao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.guava.documento.fiscal.xsd.one.manutencao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OneRecepLeitura2_QNAME = new QName("http://www.portalfiscal.inf.br/one", "oneRecepLeitura2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.guava.documento.fiscal.xsd.one.manutencao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TConsLeitura }
     * 
     */
    public TConsLeitura createTConsLeitura() {
        return new TConsLeitura();
    }

    /**
     * Create an instance of {@link TinfLeituraOCR }
     * 
     */
    public TinfLeituraOCR createTinfLeituraOCR() {
        return new TinfLeituraOCR();
    }

    /**
     * Create an instance of {@link TLeitura }
     * 
     */
    public TLeitura createTLeitura() {
        return new TLeitura();
    }

    /**
     * Create an instance of {@link TRetConsLeitura }
     * 
     */
    public TRetConsLeitura createTRetConsLeitura() {
        return new TRetConsLeitura();
    }

    /**
     * Create an instance of {@link TRetConsLeitura.LoteDistLeitura }
     * 
     */
    public TRetConsLeitura.LoteDistLeitura createTRetConsLeituraLoteDistLeitura() {
        return new TRetConsLeitura.LoteDistLeitura();
    }

    /**
     * Create an instance of {@link TLeitura.InfMDFe }
     * 
     */
    public TLeitura.InfMDFe createTLeituraInfMDFe() {
        return new TLeitura.InfMDFe();
    }

    /**
     * Create an instance of {@link TRecepLeitura2 }
     * 
     */
    public TRecepLeitura2 createTRecepLeitura2() {
        return new TRecepLeitura2();
    }

    /**
     * Create an instance of {@link TRetRecepLeitura2 }
     * 
     */
    public TRetRecepLeitura2 createTRetRecepLeitura2() {
        return new TRetRecepLeitura2();
    }

    /**
     * Create an instance of {@link TinfLeituraCompleta }
     * 
     */
    public TinfLeituraCompleta createTinfLeituraCompleta() {
        return new TinfLeituraCompleta();
    }

    /**
     * Create an instance of {@link TinfLeitura }
     * 
     */
    public TinfLeitura createTinfLeitura() {
        return new TinfLeitura();
    }

    /**
     * Create an instance of {@link TLeitura.InfCompl }
     * 
     */
    public TLeitura.InfCompl createTLeituraInfCompl() {
        return new TLeitura.InfCompl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRecepLeitura2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/one", name = "oneRecepLeitura2")
    public JAXBElement<TRecepLeitura2> createOneRecepLeitura2(TRecepLeitura2 value) {
        return new JAXBElement<TRecepLeitura2>(_OneRecepLeitura2_QNAME, TRecepLeitura2 .class, null, value);
    }

}
