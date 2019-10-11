/*
 * An XML document type.
 * Localname: cteConsDFeResult
 * Namespace: http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe
 * Java type: br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe;


/**
 * A document containing one cteConsDFeResult(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe) element.
 *
 * This is a complex type.
 */
public interface CteConsDFeResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CteConsDFeResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s62218526BE6108BFAF5A20952C7A84B3").resolveHandle("cteconsdferesultbb5fdoctype");
    
    /**
     * Gets the "cteConsDFeResult" element
     */
    br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult getCteConsDFeResult();
    
    /**
     * Sets the "cteConsDFeResult" element
     */
    void setCteConsDFeResult(br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult cteConsDFeResult);
    
    /**
     * Appends and returns a new empty "cteConsDFeResult" element
     */
    br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult addNewCteConsDFeResult();
    
    /**
     * An XML cteConsDFeResult(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe).
     *
     * This is a complex type.
     */
    public interface CteConsDFeResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CteConsDFeResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s62218526BE6108BFAF5A20952C7A84B3").resolveHandle("cteconsdferesult2f96elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult newInstance() {
              return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument newInstance() {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
