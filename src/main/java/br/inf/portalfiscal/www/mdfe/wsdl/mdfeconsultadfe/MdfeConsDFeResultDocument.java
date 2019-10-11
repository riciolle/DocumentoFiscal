/*
 * An XML document type.
 * Localname: mdfeConsDFeResult
 * Namespace: http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe
 * Java type: br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe;


/**
 * A document containing one mdfeConsDFeResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe) element.
 *
 * This is a complex type.
 */
public interface MdfeConsDFeResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MdfeConsDFeResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s60AE2D933AC8DC49DEBC0A373F7501F8").resolveHandle("mdfeconsdferesult6c6fdoctype");
    
    /**
     * Gets the "mdfeConsDFeResult" element
     */
    br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult getMdfeConsDFeResult();
    
    /**
     * Sets the "mdfeConsDFeResult" element
     */
    void setMdfeConsDFeResult(br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult mdfeConsDFeResult);
    
    /**
     * Appends and returns a new empty "mdfeConsDFeResult" element
     */
    br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult addNewMdfeConsDFeResult();
    
    /**
     * An XML mdfeConsDFeResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe).
     *
     * This is a complex type.
     */
    public interface MdfeConsDFeResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MdfeConsDFeResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s60AE2D933AC8DC49DEBC0A373F7501F8").resolveHandle("mdfeconsdferesult890aelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult newInstance() {
              return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument newInstance() {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
