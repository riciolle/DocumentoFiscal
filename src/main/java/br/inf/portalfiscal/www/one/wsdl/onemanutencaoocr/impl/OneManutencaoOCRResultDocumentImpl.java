/*
 * An XML document type.
 * Localname: oneManutencaoOCRResult
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR
 * Java type: br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.impl;
/**
 * A document containing one oneManutencaoOCRResult(@http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR) element.
 *
 * This is a complex type.
 */
public class OneManutencaoOCRResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument
{
    
    public OneManutencaoOCRResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONEMANUTENCAOOCRRESULT$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR", "oneManutencaoOCRResult");
    
    
    /**
     * Gets the "oneManutencaoOCRResult" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult getOneManutencaoOCRResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult)get_store().find_element_user(ONEMANUTENCAOOCRRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oneManutencaoOCRResult" element
     */
    public void setOneManutencaoOCRResult(br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult oneManutencaoOCRResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult)get_store().find_element_user(ONEMANUTENCAOOCRRESULT$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult)get_store().add_element_user(ONEMANUTENCAOOCRRESULT$0);
            }
            target.set(oneManutencaoOCRResult);
        }
    }
    
    /**
     * Appends and returns a new empty "oneManutencaoOCRResult" element
     */
    public br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult addNewOneManutencaoOCRResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult target = null;
            target = (br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult)get_store().add_element_user(ONEMANUTENCAOOCRRESULT$0);
            return target;
        }
    }
    /**
     * An XML oneManutencaoOCRResult(@http://www.portalfiscal.inf.br/one/wsdl/oneManutencaoOCR).
     *
     * This is a complex type.
     */
    public static class OneManutencaoOCRResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onemanutencaoocr.OneManutencaoOCRResultDocument.OneManutencaoOCRResult
    {
        
        public OneManutencaoOCRResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
