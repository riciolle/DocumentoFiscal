package br.com.guava.documento.fiscal.tunnel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import org.apache.commons.httpclient.protocol.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.guava.documento.fiscal.socket.factory.SocketFactoryDinamico;

/**
 * 
 * @author leonardo.riciolle
 *
 */
public class ConfiguracaoSSL {

	private static Logger LOGGER = LoggerFactory.getLogger(ConfiguracaoSSL.class);
	
	public static boolean validarProxy;
	
	public static String proxy;
	
	public static String proxyPort;
	
	public static String proxyUser;
	
	public static String proxyPassword;
	
	public ConfiguracaoSSL() {
		
	}

	public ConfiguracaoSSL (String proxy, 
						    String proxyPort,
						    String proxyUser, 
						    String proxyPassword) {

		ConfiguracaoSSL.proxy = proxy;
		ConfiguracaoSSL.proxyPort = proxyPort;
		ConfiguracaoSSL.proxyUser = proxyUser;
		ConfiguracaoSSL.proxyPassword = proxyPassword;
	}
	
	public void configuracaoSSL(String caminhoCacerts, 
							   	String caminhoCertificado,
							    String senhaCertificado) {

		String file = caminhoCacerts;
		File fileCertificado = new File(caminhoCertificado);

		try {
			InputStream entrada = new FileInputStream(fileCertificado);
			KeyStore ks = KeyStore.getInstance("JKS");
			ks.load(entrada, senhaCertificado.toCharArray());
			X509Certificate certificate = (X509Certificate) ks.getCertificate(ks.aliases().nextElement().toString());
			PrivateKey privateKey = (PrivateKey) ks.getKey(ks.aliases().nextElement().toString(), senhaCertificado.toCharArray());
			SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey);
			Protocol protocol = new Protocol("https", socketFactoryDinamico, 443);
			socketFactoryDinamico.setFileCacerts(file);
			Protocol.registerProtocol("https", protocol);
			LOGGER.info("############# Certificado carregado com sucesso ! #############");

		} catch (IOException ioException) {
			ioException.printStackTrace();
			LOGGER.error("############# Erro ao carregar o certificado ou cacets #############" + ioException);
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.info("Senha do Certificado Digital esta incorreta ou Certificado inválido." + exception);
		}
	}
}
