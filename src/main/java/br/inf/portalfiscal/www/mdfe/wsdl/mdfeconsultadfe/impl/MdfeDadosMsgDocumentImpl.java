/*
 * An XML document type.
 * Localname: mdfeDadosMsg
 * Namespace: http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe
 * Java type: br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.impl;
/**
 * A document containing one mdfeDadosMsg(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe) element.
 *
 * This is a complex type.
 */
public class MdfeDadosMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument
{
    
    public MdfeDadosMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDFEDADOSMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe", "mdfeDadosMsg");
    
    
    /**
     * Gets the "mdfeDadosMsg" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg getMdfeDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg)get_store().find_element_user(MDFEDADOSMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mdfeDadosMsg" element
     */
    public void setMdfeDadosMsg(br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg mdfeDadosMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg)get_store().find_element_user(MDFEDADOSMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg)get_store().add_element_user(MDFEDADOSMSG$0);
            }
            target.set(mdfeDadosMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "mdfeDadosMsg" element
     */
    public br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg addNewMdfeDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg target = null;
            target = (br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg)get_store().add_element_user(MDFEDADOSMSG$0);
            return target;
        }
    }
    /**
     * An XML mdfeDadosMsg(@http://www.portalfiscal.inf.br/mdfe/wsdl/MDFeConsultaDFe).
     *
     * This is a complex type.
     */
    public static class MdfeDadosMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.mdfe.wsdl.mdfeconsultadfe.MdfeDadosMsgDocument.MdfeDadosMsg
    {
        
        public MdfeDadosMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
