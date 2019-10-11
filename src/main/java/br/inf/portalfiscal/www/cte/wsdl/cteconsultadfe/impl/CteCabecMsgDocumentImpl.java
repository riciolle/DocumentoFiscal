/*
 * An XML document type.
 * Localname: cteCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe
 * Java type: br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.impl;
/**
 * A document containing one cteCabecMsg(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe) element.
 *
 * This is a complex type.
 */
public class CteCabecMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsgDocument
{
    
    public CteCabecMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTECABECMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe", "cteCabecMsg");
    
    
    /**
     * Gets the "cteCabecMsg" element
     */
    public br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg getCteCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg)get_store().find_element_user(CTECABECMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cteCabecMsg" element
     */
    public void setCteCabecMsg(br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg cteCabecMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg)get_store().find_element_user(CTECABECMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg)get_store().add_element_user(CTECABECMSG$0);
            }
            target.set(cteCabecMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "cteCabecMsg" element
     */
    public br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg addNewCteCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteCabecMsg)get_store().add_element_user(CTECABECMSG$0);
            return target;
        }
    }
}
