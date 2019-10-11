/*
 * An XML document type.
 * Localname: mdfeConsDFeResult
 * Namespace: http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe
 * Java type: br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.impl;
/**
 * A document containing one mdfeConsDFeResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe) element.
 *
 * This is a complex type.
 */
public class MdfeConsDFeResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument
{
    
    public MdfeConsDFeResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDFECONSDFERESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe", "mdfeConsDFeResult");
    
    
    /**
     * Gets the "mdfeConsDFeResult" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult getMdfeConsDFeResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult)get_store().find_element_user(MDFECONSDFERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mdfeConsDFeResult" element
     */
    public void setMdfeConsDFeResult(br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult mdfeConsDFeResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult)get_store().find_element_user(MDFECONSDFERESULT$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult)get_store().add_element_user(MDFECONSDFERESULT$0);
            }
            target.set(mdfeConsDFeResult);
        }
    }
    
    /**
     * Appends and returns a new empty "mdfeConsDFeResult" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult addNewMdfeConsDFeResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult)get_store().add_element_user(MDFECONSDFERESULT$0);
            return target;
        }
    }
    /**
     * An XML mdfeConsDFeResult(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe).
     *
     * This is a complex type.
     */
    public static class MdfeConsDFeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeConsDFeResultDocument.MdfeConsDFeResult
    {
        
        public MdfeConsDFeResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
