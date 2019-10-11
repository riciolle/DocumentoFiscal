/*
 * An XML document type.
 * Localname: oneConsultaLeituraResult
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneConsultaLeitura
 * Java type: br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.impl;
/**
 * A document containing one oneConsultaLeituraResult(@http://www.portalfiscal.inf.br/one/wsdl/oneConsultaLeitura) element.
 *
 * This is a complex type.
 */
public class OneConsultaLeituraResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument
{
    
    public OneConsultaLeituraResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONECONSULTALEITURARESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneConsultaLeitura", "oneConsultaLeituraResult");
    
    
    /**
     * Gets the "oneConsultaLeituraResult" element
     */
    public br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult getOneConsultaLeituraResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult)get_store().find_element_user(ONECONSULTALEITURARESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oneConsultaLeituraResult" element
     */
    public void setOneConsultaLeituraResult(br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult oneConsultaLeituraResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult)get_store().find_element_user(ONECONSULTALEITURARESULT$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult)get_store().add_element_user(ONECONSULTALEITURARESULT$0);
            }
            target.set(oneConsultaLeituraResult);
        }
    }
    
    /**
     * Appends and returns a new empty "oneConsultaLeituraResult" element
     */
    public br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult addNewOneConsultaLeituraResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult)get_store().add_element_user(ONECONSULTALEITURARESULT$0);
            return target;
        }
    }
    /**
     * An XML oneConsultaLeituraResult(@http://www.portalfiscal.inf.br/one/wsdl/oneConsultaLeitura).
     *
     * This is a complex type.
     */
    public static class OneConsultaLeituraResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.oneconsultaleitura.OneConsultaLeituraResultDocument.OneConsultaLeituraResult
    {
        
        public OneConsultaLeituraResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
