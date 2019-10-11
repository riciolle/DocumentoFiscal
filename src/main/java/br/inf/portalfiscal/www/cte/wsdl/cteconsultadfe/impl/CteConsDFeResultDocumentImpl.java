/*
 * An XML document type.
 * Localname: cteConsDFeResult
 * Namespace: http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe
 * Java type: br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.impl;
/**
 * A document containing one cteConsDFeResult(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe) element.
 *
 * This is a complex type.
 */
public class CteConsDFeResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument
{
    
    public CteConsDFeResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTECONSDFERESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe", "cteConsDFeResult");
    
    
    /**
     * Gets the "cteConsDFeResult" element
     */
    public br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult getCteConsDFeResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult)get_store().find_element_user(CTECONSDFERESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cteConsDFeResult" element
     */
    public void setCteConsDFeResult(br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult cteConsDFeResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult)get_store().find_element_user(CTECONSDFERESULT$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult)get_store().add_element_user(CTECONSDFERESULT$0);
            }
            target.set(cteConsDFeResult);
        }
    }
    
    /**
     * Appends and returns a new empty "cteConsDFeResult" element
     */
    public br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult addNewCteConsDFeResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult)get_store().add_element_user(CTECONSDFERESULT$0);
            return target;
        }
    }
    /**
     * An XML cteConsDFeResult(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe).
     *
     * This is a complex type.
     */
    public static class CteConsDFeResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteConsDFeResultDocument.CteConsDFeResult
    {
        
        public CteConsDFeResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
