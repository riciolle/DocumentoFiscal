package br.com.guava.documento.fiscal.tunnel;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.PasswordAuthentication;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.commons.codec.binary.Base64;  
  
/** 
* Class for creating a SSLTunnelSocket. This socket is used to maken a 
* connection through a proxy. 
* 
* @author leonardo.riciolle 
*/  
public class SSLTunnelSocketFactory {  
  
    private SSLSocketFactory socketFactory;  
    private String tunnelHost;  
    private int tunnelPort;  
    private static final int TIMEOUT_WS = 120;  
  
    /** 
     * Creates a new SSLTunnelSocketFactory. 
     * 
     * @param proxyHost The proxy host. 
     * @param proxyPort The proxy port. 
     * @param sslContext The SSLContext 
     */  
    public SSLTunnelSocketFactory(String proxyHost, String proxyPort, SSLContext sslContext) {  
        tunnelHost = proxyHost;  
        tunnelPort = Integer.parseInt(proxyPort);  
        socketFactory = (SSLSocketFactory) sslContext.getSocketFactory();  
    }  
  
    /** 
     * Creates a new SSLTunnelSocket. 
     * 
     * @param host The host. 
     * @param port The port. 
     * @param passwordAuthentication The PasswordAuthentication for the 
     * proxyServer. If not authentication is needed or there's no proxy server 
     * null. 
     * @return A SSLSocket 
     * @throws IOException If an error occurred. 
     * @throws UnknownHostException If the host can't be found. 
     */  
    public Socket createSocket(String host, int port, PasswordAuthentication passwordAuthentication) throws IOException, UnknownHostException {  
  
        Socket tunnel = new Socket(tunnelHost, tunnelPort);         
          
        doTunnelHandshake(tunnel, host, port, passwordAuthentication);  
  
        // Create SSLSocket    
        SSLSocket socket = (SSLSocket) socketFactory.createSocket(tunnel, host, port, true);  
          
        socket.setSoTimeout(TIMEOUT_WS * 1000);  
          
        try {  
            socket.startHandshake();  
        } catch (SSLHandshakeException e) {  
            /** 
             * PKIX path building failed: 
             * sun.security.provider.certpath.SunCertPathBuilderException: 
             * unable to find valid certification path to requested target N�o 
             * tratado, pois sempre ocorre essa exce��o quando o cacerts nao 
             * esta gerado. 
             */  
        } catch (SSLException e) {  
            //FIXME Tratar exception;  
        }  
  
        return socket;  
    }  
  
    /** 
     * Starts the handshake. 
     * 
     * @param tunnel The TunnelSocket. 
     * @param host The host. 
     * @param port The port. 
     * @param passwordAuthentication The PasswordAuthentication for the 
     * proxyServer. If not authentication is needed or there's no proxy server 
     * nul 
     * @throws IOException If an error occurred. 
     */  
    private void doTunnelHandshake(Socket tunnel, String host, int port, PasswordAuthentication passwordAuthentication) throws IOException {  
  
        OutputStream out = tunnel.getOutputStream();  
        byte[] loginData = null;  
  
        if (passwordAuthentication != null) {  
            loginData = Base64.encodeBase64((passwordAuthentication.getUserName() + ":" + new String(passwordAuthentication.getPassword())).getBytes());  
        }  
  
        String msg = "CONNECT " + host + ":" + port + " HTTP/1.0\r\n" + (loginData.toString() != null ? "Proxy-Authorization: Basic " + loginData.toString() + "\r\n" : "") + "Accept: */* \r\n\r\n";  
  
        System.out.println(msg);  
          
        byte b[];  
  
        try {  
            b = msg.getBytes("ASCII7");  
        } catch (UnsupportedEncodingException ignored) {  
            b = msg.getBytes();  
        }  
        out.write(b);  
        out.flush();  
  
        // store the reply for creating an error message in case of an exception    
        byte reply[] = new byte[200];  
        int replyLen = 0;  
        int newlinesSeen = 0;  
        boolean headerDone = false; /* Done on first newline */  
  
        InputStream in = tunnel.getInputStream();  
  
        while (newlinesSeen < 2) {  
            int i = in.read();  
            if (i < 0) {  
                throw new IOException("SSLTunnelSocketFactory - Unexpected EOF from proxy");  
            }  
            if (i == '\n') {  
                headerDone = true;  
                ++newlinesSeen;  
            } else if (i != '\r') {  
                newlinesSeen = 0;  
                if (!headerDone && replyLen < reply.length) {  
                    reply[replyLen++] = (byte) i;  
                }  
            }  
        }  
  
  
        String replyStr;  
        try {  
            replyStr = new String(reply, 0, replyLen, "ASCII7");  
        } catch (UnsupportedEncodingException ignored) {  
            replyStr = new String(reply, 0, replyLen);  
        }  
  
        // Look for 200 connection established    
        if (replyStr.toLowerCase().indexOf("200 connection established") == -1) {  
            throw new IOException("SSLTunnelSocketFactory - Unable to tunnel through " + tunnelHost + ":" + tunnelPort + ".  Proxy returns \"" + replyStr + "\"");  
        }  
    }  
}