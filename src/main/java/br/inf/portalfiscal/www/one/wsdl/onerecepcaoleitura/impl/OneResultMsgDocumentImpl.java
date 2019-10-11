/*
 * An XML document type.
 * Localname: oneResultMsg
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura
 * Java type: br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.impl;
/**
 * A document containing one oneResultMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura) element.
 *
 * This is a complex type.
 */
public class OneResultMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument
{
    
    public OneResultMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONERESULTMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura", "oneResultMsg");
    
    
    /**
     * Gets the "oneResultMsg" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg getOneResultMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().find_element_user(ONERESULTMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "oneResultMsg" element
     */
    public boolean isNilOneResultMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().find_element_user(ONERESULTMSG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "oneResultMsg" element
     */
    public void setOneResultMsg(br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg oneResultMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().find_element_user(ONERESULTMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().add_element_user(ONERESULTMSG$0);
            }
            target.set(oneResultMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "oneResultMsg" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg addNewOneResultMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().add_element_user(ONERESULTMSG$0);
            return target;
        }
    }
    
    /**
     * Nils the "oneResultMsg" element
     */
    public void setNilOneResultMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().find_element_user(ONERESULTMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg)get_store().add_element_user(ONERESULTMSG$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML oneResultMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura).
     *
     * This is a complex type.
     */
    public static class OneResultMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura.OneResultMsgDocument.OneResultMsg
    {
        
        public OneResultMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
