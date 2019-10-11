/*
 * An XML document type.
 * Localname: oneRecepcaoLeitura2Result
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2
 * Java type: br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.impl;
/**
 * A document containing one oneRecepcaoLeitura2Result(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2) element.
 *
 * This is a complex type.
 */
public class OneRecepcaoLeitura2ResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument
{
    
    public OneRecepcaoLeitura2ResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONERECEPCAOLEITURA2RESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2", "oneRecepcaoLeitura2Result");
    
    
    /**
     * Gets the "oneRecepcaoLeitura2Result" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result getOneRecepcaoLeitura2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result)get_store().find_element_user(ONERECEPCAOLEITURA2RESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oneRecepcaoLeitura2Result" element
     */
    public void setOneRecepcaoLeitura2Result(br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result oneRecepcaoLeitura2Result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result)get_store().find_element_user(ONERECEPCAOLEITURA2RESULT$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result)get_store().add_element_user(ONERECEPCAOLEITURA2RESULT$0);
            }
            target.set(oneRecepcaoLeitura2Result);
        }
    }
    
    /**
     * Appends and returns a new empty "oneRecepcaoLeitura2Result" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result addNewOneRecepcaoLeitura2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result)get_store().add_element_user(ONERECEPCAOLEITURA2RESULT$0);
            return target;
        }
    }
    /**
     * An XML oneRecepcaoLeitura2Result(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2).
     *
     * This is a complex type.
     */
    public static class OneRecepcaoLeitura2ResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.OneRecepcaoLeitura2Result
    {
        
        public OneRecepcaoLeitura2ResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
