/*
 * An XML document type.
 * Localname: nfeDadosMsg
 * Namespace: http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe
 * Java type: br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl;
/**
 * A document containing one nfeDadosMsg(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe) element.
 *
 * This is a complex type.
 */
public class NfeDadosMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument
{
    
    public NfeDadosMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NFEDADOSMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe", "nfeDadosMsg");
    
    
    /**
     * Gets the "nfeDadosMsg" element
     */
    public br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg getNfeDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg)get_store().find_element_user(NFEDADOSMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nfeDadosMsg" element
     */
    public void setNfeDadosMsg(br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg nfeDadosMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg)get_store().find_element_user(NFEDADOSMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg)get_store().add_element_user(NFEDADOSMSG$0);
            }
            target.set(nfeDadosMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "nfeDadosMsg" element
     */
    public br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg addNewNfeDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg)get_store().add_element_user(NFEDADOSMSG$0);
            return target;
        }
    }
    /**
     * An XML nfeDadosMsg(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe).
     *
     * This is a complex type.
     */
    public static class NfeDadosMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeDadosMsgDocument.NfeDadosMsg
    {
        
        public NfeDadosMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
