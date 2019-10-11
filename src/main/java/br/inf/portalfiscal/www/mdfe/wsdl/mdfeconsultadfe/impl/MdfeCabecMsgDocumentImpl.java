/*
 * An XML document type.
 * Localname: mdfeCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe
 * Java type: br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.impl;
/**
 * A document containing one mdfeCabecMsg(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe) element.
 *
 * This is a complex type.
 */
public class MdfeCabecMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsgDocument
{
    
    public MdfeCabecMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDFECABECMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe", "mdfeCabecMsg");
    
    
    /**
     * Gets the "mdfeCabecMsg" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg getMdfeCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg)get_store().find_element_user(MDFECABECMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mdfeCabecMsg" element
     */
    public void setMdfeCabecMsg(br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg mdfeCabecMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg)get_store().find_element_user(MDFECABECMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg)get_store().add_element_user(MDFECABECMSG$0);
            }
            target.set(mdfeCabecMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "mdfeCabecMsg" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg addNewMdfeCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeCabecMsg)get_store().add_element_user(MDFECABECMSG$0);
            return target;
        }
    }
}
