//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: AM.10.20 �s 11:17:53 AM BRST 
//


package br.com.guava.documento.fiscal.xsd.sefaz.nacional.mdfe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.guava.documento.fiscal.xsd.sefaz.nacional.mdfe package. 
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

    private final static QName _MdfeConsultaDFe_QNAME = new QName("http://www.portalfiscal.inf.br/mdfe", "mdfeConsultaDFe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.guava.documento.fiscal.xsd.sefaz.nacional.mdfe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMDFeDFe }
     * 
     */
    public TMDFeDFe createTMDFeDFe() {
        return new TMDFeDFe();
    }

    /**
     * Create an instance of {@link TMDFeConsultaDFe }
     * 
     */
    public TMDFeConsultaDFe createTMDFeConsultaDFe() {
        return new TMDFeConsultaDFe();
    }

    /**
     * Create an instance of {@link TRetMDFeConsultaDFe }
     * 
     */
    public TRetMDFeConsultaDFe createTRetMDFeConsultaDFe() {
        return new TRetMDFeConsultaDFe();
    }

    /**
     * Create an instance of {@link TMDFeDFe.ProcMDFe }
     * 
     */
    public MdfeProc createTMDFeDFeProcMDFe() {
        return new MdfeProc();
    }

    /**
     * Create an instance of {@link TMDFeDFe.ProcEventoMDFe }
     * 
     */
    public TProcEvento createTMDFeDFeProcEventoMDFe() {
        return new TProcEvento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMDFeConsultaDFe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/mdfe", name = "mdfeConsultaDFe")
    public JAXBElement<TMDFeConsultaDFe> createMdfeConsultaDFe(TMDFeConsultaDFe value) {
        return new JAXBElement<TMDFeConsultaDFe>(_MdfeConsultaDFe_QNAME, TMDFeConsultaDFe.class, null, value);
    }

}
