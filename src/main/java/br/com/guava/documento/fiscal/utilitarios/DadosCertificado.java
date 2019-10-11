package br.com.guava.documento.fiscal.utilitarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author leonardo.riciolle
 *
 */
public class DadosCertificado {

	public static final Logger LOGGER = LoggerFactory.getLogger(DadosCertificado.class);

	public static void main(String[] args) {
		try {
			LOGGER.info("--------------------------------------------------------");
			LOGGER.info("Aplicação Iniciada");
			/**
			 * A instancia do KeyStore pode variar de acordo com cada certificado.
			 * Nesse exemplo foi utilizado um certifico Serpro .p12  
			 */
			KeyStore keyStore = KeyStore.getInstance(("PKCS12"));
//			KeyStore keyStore = KeyStore.getInstance("Windows-MY", "SunMSCAPI");
			InputStream file = new FileInputStream("D:\\Desenvolvimento\\workspace_data_lake\\Documento_Fiscal\\src\\main\\resources\\certserpro2017.p12");
			keyStore.load(file, "serpro".toCharArray());

			Enumeration<String> al = keyStore.aliases();
			while (al.hasMoreElements()) {
				String alias = al.nextElement();
				LOGGER.info("--------------------------------------------------------");
				if (keyStore.containsAlias(alias)) {
					LOGGER.info("Emitido para........: " + alias);

					X509Certificate cert = (X509Certificate) keyStore.getCertificate(alias);
					LOGGER.info("SubjectDN...........: " + cert.getSubjectDN().toString());
					LOGGER.info("Version.............: " + cert.getVersion());
					LOGGER.info("SerialNumber........: " + cert.getSerialNumber());
					LOGGER.info("SigAlgName..........: " + cert.getSigAlgName());
					LOGGER.info("Válido a partir de..: " + LocalDateTime.parse(cert.getNotBefore().toInstant().toString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME));
					LOGGER.info("Válido atá..........: " + LocalDateTime.parse(cert.getNotAfter().toInstant().toString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME));
				} else {
					LOGGER.info("Alias doesn't exists : " + alias);
				}
			}
		} catch (Exception e) {
			LOGGER.error("Erro ao validar certificado \n" + e);
		}
		LOGGER.info("--------------------------------------------------------");
		LOGGER.info("Aplicação Finalizada");
	}

}
