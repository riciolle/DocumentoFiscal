/*
 * XML Type:  nfeCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe
 * Java type: br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.impl;
/**
 * An XML nfeCabecMsg(@http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe).
 *
 * This is a complex type.
 */
public class NfeCabecMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.nfe.wsdl.nfeconsultanfe.NfeCabecMsg
{
    
    public NfeCabecMsgImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSAODADOS$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsultaNFe", "versaoDados");
    
    
    /**
     * Gets the "versaoDados" element
     */
    public java.lang.String getVersaoDados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSAODADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "versaoDados" element
     */
    public org.apache.xmlbeans.XmlString xgetVersaoDados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSAODADOS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "versaoDados" element
     */
    public boolean isSetVersaoDados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSAODADOS$0) != 0;
        }
    }
    
    /**
     * Sets the "versaoDados" element
     */
    public void setVersaoDados(java.lang.String versaoDados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSAODADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSAODADOS$0);
            }
            target.setStringValue(versaoDados);
        }
    }
    
    /**
     * Sets (as xml) the "versaoDados" element
     */
    public void xsetVersaoDados(org.apache.xmlbeans.XmlString versaoDados)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSAODADOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSAODADOS$0);
            }
            target.set(versaoDados);
        }
    }
    
    /**
     * Unsets the "versaoDados" element
     */
    public void unsetVersaoDados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSAODADOS$0, 0);
        }
    }
}
