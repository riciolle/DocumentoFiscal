/*
 * An XML document type.
 * Localname: nfeConsultaNFeLogResult
 * Namespace: http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe
 * Java type: br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl;
/**
 * A document containing one nfeConsultaNFeLogResult(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe) element.
 *
 * This is a complex type.
 */
public class NfeConsultaNFeLogResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument
{
    
    public NfeConsultaNFeLogResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NFECONSULTANFELOGRESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe", "nfeConsultaNFeLogResult");
    
    
    /**
     * Gets the "nfeConsultaNFeLogResult" element
     */
    public br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult getNfeConsultaNFeLogResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult)get_store().find_element_user(NFECONSULTANFELOGRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nfeConsultaNFeLogResult" element
     */
    public void setNfeConsultaNFeLogResult(br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult nfeConsultaNFeLogResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult)get_store().find_element_user(NFECONSULTANFELOGRESULT$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult)get_store().add_element_user(NFECONSULTANFELOGRESULT$0);
            }
            target.set(nfeConsultaNFeLogResult);
        }
    }
    
    /**
     * Appends and returns a new empty "nfeConsultaNFeLogResult" element
     */
    public br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult addNewNfeConsultaNFeLogResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult)get_store().add_element_user(NFECONSULTANFELOGRESULT$0);
            return target;
        }
    }
    /**
     * An XML nfeConsultaNFeLogResult(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe).
     *
     * This is a complex type.
     */
    public static class NfeConsultaNFeLogResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeConsultaNFeLogResultDocument.NfeConsultaNFeLogResult
    {
        
        public NfeConsultaNFeLogResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
