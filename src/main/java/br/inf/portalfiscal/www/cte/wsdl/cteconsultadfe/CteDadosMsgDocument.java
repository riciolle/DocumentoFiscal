/*
 * An XML document type.
 * Localname: cteDadosMsg
 * Namespace: http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe
 * Java type: br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe;


/**
 * A document containing one cteDadosMsg(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe) element.
 *
 * This is a complex type.
 */
public interface CteDadosMsgDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CteDadosMsgDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s62218526BE6108BFAF5A20952C7A84B3").resolveHandle("ctedadosmsg5da2doctype");
    
    /**
     * Gets the "cteDadosMsg" element
     */
    br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg getCteDadosMsg();
    
    /**
     * Sets the "cteDadosMsg" element
     */
    void setCteDadosMsg(br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg cteDadosMsg);
    
    /**
     * Appends and returns a new empty "cteDadosMsg" element
     */
    br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg addNewCteDadosMsg();
    
    /**
     * An XML cteDadosMsg(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe).
     *
     * This is a complex type.
     */
    public interface CteDadosMsg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CteDadosMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s62218526BE6108BFAF5A20952C7A84B3").resolveHandle("ctedadosmsg2cecelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg newInstance() {
              return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument newInstance() {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
