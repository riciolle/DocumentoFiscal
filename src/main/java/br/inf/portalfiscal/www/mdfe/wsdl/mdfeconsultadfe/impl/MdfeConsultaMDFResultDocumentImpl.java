/*
 * An XML document type.
 * Localname: mdfeConsultaMDFResult
 * Namespace: http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta
 * Java type: br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.impl;
/**
 * A document containing one mdfeConsultaMDFResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta) element.
 *
 * This is a complex type.
 */
public class MdfeConsultaMDFResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public MdfeConsultaMDFResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDFECONSULTAMDFRESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta", "mdfeConsultaMDFResult");
    
    
    /**
     * Gets the "mdfeConsultaMDFResult" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult getMdfeConsultaMDFResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult)get_store().find_element_user(MDFECONSULTAMDFRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mdfeConsultaMDFResult" element
     */
    public void setMdfeConsultaMDFResult(br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult mdfeConsultaMDFResult)
    {
        generatedSetterHelperImpl(mdfeConsultaMDFResult, MDFECONSULTAMDFRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mdfeConsultaMDFResult" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult addNewMdfeConsultaMDFResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult)get_store().add_element_user(MDFECONSULTAMDFRESULT$0);
            return target;
        }
    }
    /**
     * An XML mdfeConsultaMDFResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsulta).
     *
     * This is a complex type.
     */
    public static class MdfeConsultaMDFResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsultaMDFResultDocument.MdfeConsultaMDFResult
    {
        private static final long serialVersionUID = 1L;
        
        public MdfeConsultaMDFResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
