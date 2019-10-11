/*
 * An XML document type.
 * Localname: nfeCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe
 * Java type: br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl;
/**
 * A document containing one nfeCabecMsg(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe) element.
 *
 * This is a complex type.
 */
public class NfeCabecMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsgDocument
{
    
    public NfeCabecMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NFECABECMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe", "nfeCabecMsg");
    
    
    /**
     * Gets the "nfeCabecMsg" element
     */
    public br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg getNfeCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg)get_store().find_element_user(NFECABECMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nfeCabecMsg" element
     */
    public void setNfeCabecMsg(br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg nfeCabecMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg)get_store().find_element_user(NFECABECMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg)get_store().add_element_user(NFECABECMSG$0);
            }
            target.set(nfeCabecMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "nfeCabecMsg" element
     */
    public br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg addNewNfeCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg target = null;
            target = (br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg)get_store().add_element_user(NFECABECMSG$0);
            return target;
        }
    }
}
