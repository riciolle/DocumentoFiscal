/*
 * An XML document type.
 * Localname: oneManutencaoOCRResult
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR
 * Java type: br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr;


/**
 * A document containing one oneManutencaoOCRResult(@http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR) element.
 *
 * This is a complex type.
 */
public interface OneManutencaoOCRResultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneManutencaoOCRResultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7447D16C428DB248AF8018D5801CAE4").resolveHandle("onemanutencaoocrresultd195doctype");
    
    /**
     * Gets the "oneManutencaoOCRResult" element
     */
    br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult getOneManutencaoOCRResult();
    
    /**
     * Sets the "oneManutencaoOCRResult" element
     */
    void setOneManutencaoOCRResult(br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult oneManutencaoOCRResult);
    
    /**
     * Appends and returns a new empty "oneManutencaoOCRResult" element
     */
    br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult addNewOneManutencaoOCRResult();
    
    /**
     * An XML oneManutencaoOCRResult(@http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR).
     *
     * This is a complex type.
     */
    public interface OneManutencaoOCRResult extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OneManutencaoOCRResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7447D16C428DB248AF8018D5801CAE4").resolveHandle("onemanutencaoocrresult7e57elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult newInstance() {
              return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument newInstance() {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
