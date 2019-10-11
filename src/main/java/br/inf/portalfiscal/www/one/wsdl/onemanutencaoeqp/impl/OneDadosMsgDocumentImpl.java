/*
 * An XML document type.
 * Localname: oneDadosMsg
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoEQP
 * Java type: br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.impl;
/**
 * A document containing one oneDadosMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoEQP) element.
 *
 * This is a complex type.
 */
public class OneDadosMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument
{
    
    public OneDadosMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONEDADOSMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoEQP", "oneDadosMsg");
    
    
    /**
     * Gets the "oneDadosMsg" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg getOneDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg)get_store().find_element_user(ONEDADOSMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oneDadosMsg" element
     */
    public void setOneDadosMsg(br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg oneDadosMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg)get_store().find_element_user(ONEDADOSMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg)get_store().add_element_user(ONEDADOSMSG$0);
            }
            target.set(oneDadosMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "oneDadosMsg" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg addNewOneDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg)get_store().add_element_user(ONEDADOSMSG$0);
            return target;
        }
    }
    /**
     * An XML oneDadosMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoEQP).
     *
     * This is a complex type.
     */
    public static class OneDadosMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onemanutencaoeqp.OneDadosMsgDocument.OneDadosMsg
    {
        
        public OneDadosMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
