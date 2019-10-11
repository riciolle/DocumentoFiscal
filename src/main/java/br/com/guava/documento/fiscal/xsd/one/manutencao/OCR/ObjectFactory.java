//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.12.12 às 11:13:07 AM BRST 
//


package br.com.guava.documento.fiscal.xsd.one.manutencao.OCR;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.centralit.dossie.teste package. 
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

    private final static QName _OneManOCR_QNAME = new QName("http://www.portalfiscal.inf.br/one", "oneManOCR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.centralit.dossie.teste
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TManOCR }
     * 
     */
    public TManOCR createTManOCR() {
        return new TManOCR();
    }

    /**
     * Create an instance of {@link TManSLD }
     * 
     */
    public TManSLD createTManSLD() {
        return new TManSLD();
    }

    /**
     * Create an instance of {@link TRetManSLD }
     * 
     */
    public TRetManSLD createTRetManSLD() {
        return new TRetManSLD();
    }

    /**
     * Create an instance of {@link TRetManOCR }
     * 
     */
    public TRetManOCR createTRetManOCR() {
        return new TRetManOCR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TManOCR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/one", name = "oneManOCR")
    public JAXBElement<TManOCR> createOneManOCR(TManOCR value) {
        return new JAXBElement<TManOCR>(_OneManOCR_QNAME, TManOCR.class, null, value);
    }

}
