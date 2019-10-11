/*
 * An XML document type.
 * Localname: cteDadosMsg
 * Namespace: http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe
 * Java type: br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument
 *
 * Automatically generated - do not modify.
 */
package br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.impl;
/**
 * A document containing one cteDadosMsg(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe) element.
 *
 * This is a complex type.
 */
public class CteDadosMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument
{
    
    public CteDadosMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTEDADOSMSG$0 = 
        new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe", "cteDadosMsg");
    
    
    /**
     * Gets the "cteDadosMsg" element
     */
    public br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg getCteDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg)get_store().find_element_user(CTEDADOSMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cteDadosMsg" element
     */
    public void setCteDadosMsg(br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg cteDadosMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg)get_store().find_element_user(CTEDADOSMSG$0, 0);
            if (target == null)
            {
                target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg)get_store().add_element_user(CTEDADOSMSG$0);
            }
            target.set(cteDadosMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "cteDadosMsg" element
     */
    public br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg addNewCteDadosMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg target = null;
            target = (br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg)get_store().add_element_user(CTEDADOSMSG$0);
            return target;
        }
    }
    /**
     * An XML cteDadosMsg(@http://www.portalfiscal.inf.br/cte/wsdl/cteConsultaDFe).
     *
     * This is a complex type.
     */
    public static class CteDadosMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.inf.portalfiscal.www.cte.wsdl.cteconsultadfe.CteDadosMsgDocument.CteDadosMsg
    {
        
        public CteDadosMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
