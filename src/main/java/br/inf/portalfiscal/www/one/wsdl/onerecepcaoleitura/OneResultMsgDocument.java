/*
 * An XML document type.
 * Localname: oneResultMsg
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura
 * Java type: br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura;


/**
 * A document containing one oneResultMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura) element.
 *
 * This is a complex type.
 */
public interface OneResultMsgDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneResultMsgDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7C468C4C7E4E1A2A698B8527D7B1F19E").resolveHandle("oneresultmsg1918doctype");
    
    /**
     * Gets the "oneResultMsg" element
     */
    br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg getOneResultMsg();
    
    /**
     * Tests for nil "oneResultMsg" element
     */
    boolean isNilOneResultMsg();
    
    /**
     * Sets the "oneResultMsg" element
     */
    void setOneResultMsg(br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg oneResultMsg);
    
    /**
     * Appends and returns a new empty "oneResultMsg" element
     */
    br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg addNewOneResultMsg();
    
    /**
     * Nils the "oneResultMsg" element
     */
    void setNilOneResultMsg();
    
    /**
     * An XML oneResultMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura).
     *
     * This is a complex type.
     */
    public interface OneResultMsg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneResultMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7C468C4C7E4E1A2A698B8527D7B1F19E").resolveHandle("oneresultmsg1792elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg newInstance() {
              return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument newInstance() {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
