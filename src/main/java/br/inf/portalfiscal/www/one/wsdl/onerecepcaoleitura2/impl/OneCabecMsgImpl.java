/*
 * XML Type:  oneCabecMsg
 * Namespace: http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2
 * Java type: br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.impl;
/**
 * An XML oneCabecMsg(@http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2).
 *
 * This is a complex type.
 */
public class OneCabecMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsg
{
    
    public OneCabecMsgImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORGAO$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2", "cOrgao");
    private static final javax.xml.namespace.QName VERSAODADOS$2 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2", "versaoDados");
    
    
    /**
     * Gets the "cOrgao" element
     */
    public java.lang.String getCOrgao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORGAO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cOrgao" element
     */
    public org.apache.xmlbeans.XmlString xgetCOrgao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORGAO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "cOrgao" element
     */
    public boolean isSetCOrgao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORGAO$0) != 0;
        }
    }
    
    /**
     * Sets the "cOrgao" element
     */
    public void setCOrgao(java.lang.String cOrgao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORGAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORGAO$0);
            }
            target.setStringValue(cOrgao);
        }
    }
    
    /**
     * Sets (as xml) the "cOrgao" element
     */
    public void xsetCOrgao(org.apache.xmlbeans.XmlString cOrgao)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORGAO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORGAO$0);
            }
            target.set(cOrgao);
        }
    }
    
    /**
     * Unsets the "cOrgao" element
     */
    public void unsetCOrgao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORGAO$0, 0);
        }
    }
    
    /**
     * Gets the "versaoDados" element
     */
    public java.lang.String getVersaoDados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSAODADOS$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSAODADOS$2, 0);
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
            return get_store().count_elements(VERSAODADOS$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSAODADOS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSAODADOS$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSAODADOS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSAODADOS$2);
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
            get_store().remove_element(VERSAODADOS$2, 0);
        }
    }
}
