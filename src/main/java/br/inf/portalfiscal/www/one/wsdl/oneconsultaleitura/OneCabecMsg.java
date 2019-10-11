/*
 * XML Type:  oneCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneConsultaLeitura
 * Java type: br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura;


/**
 * An XML oneCabecMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneConsultaLeitura).
 *
 * This is a complex type.
 */
public interface OneCabecMsg extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneCabecMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s212E2F8EA27DEB4B09F8F67D35AD2B93").resolveHandle("onecabecmsg8df4type");
    
    /**
     * Gets the "cOrgao" element
     */
    java.lang.String getCOrgao();
    
    /**
     * Gets (as xml) the "cOrgao" element
     */
    org.apache.xmlbeans.XmlString xgetCOrgao();
    
    /**
     * True if has "cOrgao" element
     */
    boolean isSetCOrgao();
    
    /**
     * Sets the "cOrgao" element
     */
    void setCOrgao(java.lang.String cOrgao);
    
    /**
     * Sets (as xml) the "cOrgao" element
     */
    void xsetCOrgao(org.apache.xmlbeans.XmlString cOrgao);
    
    /**
     * Unsets the "cOrgao" element
     */
    void unsetCOrgao();
    
    /**
     * Gets the "versaoDados" element
     */
    java.lang.String getVersaoDados();
    
    /**
     * Gets (as xml) the "versaoDados" element
     */
    org.apache.xmlbeans.XmlString xgetVersaoDados();
    
    /**
     * True if has "versaoDados" element
     */
    boolean isSetVersaoDados();
    
    /**
     * Sets the "versaoDados" element
     */
    void setVersaoDados(java.lang.String versaoDados);
    
    /**
     * Sets (as xml) the "versaoDados" element
     */
    void xsetVersaoDados(org.apache.xmlbeans.XmlString versaoDados);
    
    /**
     * Unsets the "versaoDados" element
     */
    void unsetVersaoDados();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg newInstance() {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneCabecMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
