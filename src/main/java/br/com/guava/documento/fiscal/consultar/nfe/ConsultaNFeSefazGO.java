package br.com.guava.documento.fiscal.consultar.nfe;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.xmlbeans.XmlObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.guava.documento.fiscal.tunnel.ConfiguracaoSSL;
import br.com.guava.documento.fiscal.xsd.nfe.ObjectFactory;
import br.com.guava.documento.fiscal.xsd.nfe.TConsNFeLog;
import br.com.guava.documento.fiscal.xsd.nfe.TRetConsNFeLog;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsgDocument;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeStub;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl.NfeCabecMsgDocumentImpl;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl.NfeCabecMsgImpl;
import br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl.NfeDadosMsgDocumentImpl;

public class ConsultaNFeSefazGO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaNFeSefazGO.class);

	private static String versao_dados;
	
	private static String tp_amb;
	
	private static String url;
	
	private static final String CABECALHO_XML_FRAGMENT = "<xml-fragment xmlns:env=\"http://www.w3.org/2003/05/soap-envelope\">";
	
	private static final String RODAPE_XML_FRAGMENT = "</xml-fragment>";
	
	private static NfeDadosMsg NFE_DADOS_MSG_INSTANCE;
	
	private static NfeCabecMsg NFE_CABEC_MSG_INSTANCE;
	
	private static NfeDadosMsgDocument NFE_DADOS_MSG_DOCUMENT_INSTANCE;
	
	private static NfeCabecMsgDocument NFE_CABEC_MSG_DOCUMENT_INSTANCE;
	
	private static Unmarshaller unmarshaller;
	
	private static JAXBContext contextTConsNFeLog;
	
	private static JAXBElement<TConsNFeLog> elementTConsNFeLog;
	
	private static NfeCabecMsgDocumentImpl nfeCabecMsgDocumentImpl;
	
	private static NfeDadosMsgDocumentImpl nfeDadosMsgDocumentImpl;
	
	public static void main(String[] args) {
		// Seta a configuração de proxy
		ConfiguracaoSSL.validarProxy = true;
		ConfiguracaoSSL configuracaoSSL = new ConfiguracaoSSL(null, null, null, null);
		configuracaoSSL.configuracaoSSL("", "", "");
		// Após carregar o certificado basta fazer a consulta
		consultaNFeSefazGO("");
	}	
	
	private static void initStaticContent() {
		
		NFE_DADOS_MSG_INSTANCE = NfeDadosMsg.Factory.newInstance();
		
		NFE_CABEC_MSG_INSTANCE = NfeCabecMsg.Factory.newInstance();
		
		NFE_DADOS_MSG_DOCUMENT_INSTANCE = NfeDadosMsgDocument.Factory.newInstance();
		
		NFE_CABEC_MSG_DOCUMENT_INSTANCE = NfeCabecMsgDocument.Factory.newInstance();
		
	}
	
	public static TRetConsNFeLog consultaNFeSefazGO(String chaveNFe) {
		
		if (NFE_DADOS_MSG_INSTANCE == null || 
				NFE_CABEC_MSG_INSTANCE == null || 
				NFE_DADOS_MSG_DOCUMENT_INSTANCE == null || 
				NFE_CABEC_MSG_DOCUMENT_INSTANCE == null ) {
			initStaticContent();
		}
		
		StringWriter xml = new StringWriter();
		TConsNFeLog tConsSitNFe = new TConsNFeLog();
		NfeConsultaNFeLogResultDocument nfeConsultaNFeLogResultDocument = null;
		TRetConsNFeLog tRetConsNFeLog = new TRetConsNFeLog();
		
		try {
			
			NfeConsultaNFeStub stub = new NfeConsultaNFeStub(url);
			NfeCabecMsgImpl cab = (NfeCabecMsgImpl) NFE_CABEC_MSG_INSTANCE;
			cab.setVersaoDados(versao_dados);

			nfeCabecMsgDocumentImpl = (NfeCabecMsgDocumentImpl) NFE_CABEC_MSG_DOCUMENT_INSTANCE;
			nfeCabecMsgDocumentImpl.setNfeCabecMsg(NFE_CABEC_MSG_INSTANCE);
			nfeCabecMsgDocumentImpl.getNfeCabecMsg().set(XmlObject.Factory.parse(cab.toString()));

			//INFORMAÇÔES PARA SEREM CONSULTADAS
			tConsSitNFe.setVersao(versao_dados);
			tConsSitNFe.setTpAmb(tp_amb);
			tConsSitNFe.setChNFe(chaveNFe);

			contextTConsNFeLog = JAXBContext.newInstance(TConsNFeLog.class);
			Marshaller marshaller = contextTConsNFeLog.createMarshaller();
			elementTConsNFeLog = new ObjectFactory().createConsNFeLog(tConsSitNFe);
			marshaller.marshal(elementTConsNFeLog, xml);

			nfeDadosMsgDocumentImpl = (NfeDadosMsgDocumentImpl) NFE_DADOS_MSG_DOCUMENT_INSTANCE; 
			nfeDadosMsgDocumentImpl.setNfeDadosMsg(NFE_DADOS_MSG_INSTANCE);
			nfeDadosMsgDocumentImpl.getNfeDadosMsg().set(XmlObject.Factory.parse(xml.toString()));

			nfeConsultaNFeLogResultDocument = stub.nfeConsultaNFeLog(nfeDadosMsgDocumentImpl, nfeCabecMsgDocumentImpl, false);
			
			tRetConsNFeLog = tRetConsNFeLog(nfeConsultaNFeLogResultDocument.getNfeConsultaNFeLogResult().xmlText());
			
			return tRetConsNFeLog;
		} catch (Exception exception) {
			LOGGER.error("Consulta Nota Fiscal SEFAZ-GO" + exception);
			exception.printStackTrace();
		}
		
		return tRetConsNFeLog;
		
	}
	
	private static TRetConsNFeLog tRetConsNFeLog(String xml) {    
		TRetConsNFeLog tRetConsSitNFe = null;  
        try {  
        	String xmlTRetConsNFeLog = xml.toString().replaceAll(CABECALHO_XML_FRAGMENT, "").replace(RODAPE_XML_FRAGMENT, "");
            unmarshaller = JAXBContext.newInstance(TRetConsNFeLog.class).createUnmarshaller();  
            tRetConsSitNFe = unmarshaller.unmarshal(new StreamSource(new StringReader(xmlTRetConsNFeLog)), TRetConsNFeLog.class).getValue();  
            return tRetConsSitNFe;  
        } catch (Exception e) {  
        	LOGGER.error(e.getMessage()); 
        }  
        return tRetConsSitNFe; 
    } 
}
