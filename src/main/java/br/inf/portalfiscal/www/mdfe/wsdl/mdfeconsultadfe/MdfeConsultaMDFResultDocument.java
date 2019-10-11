/*
 * An XML document type.
 * Localname: mdfeConsultaMDFResult
 * Namespace: http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta
 * Java type: br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe;


/**
 * A document containing one mdfeConsultaMDFResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta) element.
 *
 * This is a complex type.
 */
public interface MdfeConsultaMDFResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MdfeConsultaMDFResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC229EBA967401AE478073D4A8E2F5636").resolveHandle("mdfeconsultamdfresult3adcdoctype");
    
    /**
     * Gets the "mdfeConsultaMDFResult" element
     */
    br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult getMdfeConsultaMDFResult();
    
    /**
     * Sets the "mdfeConsultaMDFResult" element
     */
    void setMdfeConsultaMDFResult(br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult mdfeConsultaMDFResult);
    
    /**
     * Appends and returns a new empty "mdfeConsultaMDFResult" element
     */
    br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult addNewMdfeConsultaMDFResult();
    
    /**
     * An XML mdfeConsultaMDFResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta).
     *
     * This is a complex type.
     */
    public interface MdfeConsultaMDFResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MdfeConsultaMDFResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC229EBA967401AE478073D4A8E2F5636").resolveHandle("mdfeconsultamdfresultacc9elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult newInstance() {
              return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument newInstance() {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
