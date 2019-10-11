/*
 * An XML document type.
 * Localname: oneRecepcaoLeitura2Result
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2
 * Java type: br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2;


/**
 * A document containing one oneRecepcaoLeitura2Result(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2) element.
 *
 * This is a complex type.
 */
public interface OneRecepcaoLeitura2ResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneRecepcaoLeitura2ResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD10FF323629B2C824386B7DC92176D77").resolveHandle("onerecepcaoleitura2resultb0b5doctype");
    
    /**
     * Gets the "oneRecepcaoLeitura2Result" element
     */
    br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result getOneRecepcaoLeitura2Result();
    
    /**
     * Sets the "oneRecepcaoLeitura2Result" element
     */
    void setOneRecepcaoLeitura2Result(br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result oneRecepcaoLeitura2Result);
    
    /**
     * Appends and returns a new empty "oneRecepcaoLeitura2Result" element
     */
    br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result addNewOneRecepcaoLeitura2Result();
    
    /**
     * An XML oneRecepcaoLeitura2Result(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2).
     *
     * This is a complex type.
     */
    public interface OneRecepcaoLeitura2Result extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneRecepcaoLeitura2Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD10FF323629B2C824386B7DC92176D77").resolveHandle("onerecepcaoleitura2result42ecelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result newInstance() {
              return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument newInstance() {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
