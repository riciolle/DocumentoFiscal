/*
 * An XML document type.
 * Localname: oneCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2
 * Java type: br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.impl;
/**
 * A document containing one oneCabecMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2) element.
 *
 * This is a complex type.
 */
public class OneCabecMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument
{
    
    public OneCabecMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONECABECMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2", "oneCabecMsg");
    
    
    /**
     * Gets the "oneCabecMsg" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg getOneCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg)get_store().find_element_user(ONECABECMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oneCabecMsg" element
     */
    public void setOneCabecMsg(br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg oneCabecMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg)get_store().find_element_user(ONECABECMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg)get_store().add_element_user(ONECABECMSG$0);
            }
            target.set(oneCabecMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "oneCabecMsg" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg addNewOneCabecMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg)get_store().add_element_user(ONECABECMSG$0);
            return target;
        }
    }
}
