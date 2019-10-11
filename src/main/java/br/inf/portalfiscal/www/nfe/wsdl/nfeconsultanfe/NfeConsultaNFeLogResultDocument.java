/*
 * An XML document type.
 * Localname: nfeConsultaNFeLogResult
 * Namespace: http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe
 * Java type: br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe;


/**
 * A document containing one nfeConsultaNFeLogResult(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe) element.
 *
 * This is a complex type.
 */
public interface NfeConsultaNFeLogResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NfeConsultaNFeLogResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC021CF88F92B0952FDBC1E6DE18B1AF").resolveHandle("nfeconsultanfelogresulted20doctype");
    
    /**
     * Gets the "nfeConsultaNFeLogResult" element
     */
    br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult getNfeConsultaNFeLogResult();
    
    /**
     * Sets the "nfeConsultaNFeLogResult" element
     */
    void setNfeConsultaNFeLogResult(br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult nfeConsultaNFeLogResult);
    
    /**
     * Appends and returns a new empty "nfeConsultaNFeLogResult" element
     */
    br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult addNewNfeConsultaNFeLogResult();
    
    /**
     * An XML nfeConsultaNFeLogResult(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe).
     *
     * This is a complex type.
     */
    public interface NfeConsultaNFeLogResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NfeConsultaNFeLogResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC021CF88F92B0952FDBC1E6DE18B1AF").resolveHandle("nfeconsultanfelogresult4bdeelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult newInstance() {
              return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument newInstance() {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
