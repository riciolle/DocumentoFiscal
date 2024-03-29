/**
 * OneRecepcaoLeitura2Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2;


/*
 *  OneRecepcaoLeitura2Stub java implementation
 */
public class OneRecepcaoLeitura2Stub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public OneRecepcaoLeitura2Stub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public OneRecepcaoLeitura2Stub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public OneRecepcaoLeitura2Stub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://one-homologacao.svrs.rs.gov.br/ws/oneRecepcaoLeitura2/oneRecepcaoLeitura2.asmx");
    }

    /**
     * Default Constructor
     */
    public OneRecepcaoLeitura2Stub() throws org.apache.axis2.AxisFault {
        this(
            "https://one-homologacao.svrs.rs.gov.br/ws/oneRecepcaoLeitura2/oneRecepcaoLeitura2.asmx");
    }

    /**
     * Constructor taking the target endpoint
     */
    public OneRecepcaoLeitura2Stub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "OneRecepcaoLeitura2" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                "oneRecepcaoLeitura2"));
        _service.addOperation(__operation);

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2#oneRecepcaoLeitura2
     * @param oneDadosMsg0
     * @param oneCabecMsg1
     */
    public br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument oneRecepcaoLeitura2(
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument oneDadosMsg0,
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument oneCabecMsg1)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2/oneRecepcaoLeitura2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    oneDadosMsg0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                            "oneRecepcaoLeitura2")),
                    new javax.xml.namespace.QName(
                        "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                        "oneRecepcaoLeitura2"));

            env.build();

            // add the children only if the parameter is not null
            if (oneCabecMsg1 != null) {
                org.apache.axiom.om.OMElement omElementoneCabecMsg1 = toOM(oneCabecMsg1,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                                "oneRecepcaoLeitura2")));
                addHeader(omElementoneCabecMsg1, env);
            }

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "oneRecepcaoLeitura2"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "oneRecepcaoLeitura2"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "oneRecepcaoLeitura2"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2#startoneRecepcaoLeitura2
     * @param oneDadosMsg0
     * @param oneCabecMsg1
     */
    public void startoneRecepcaoLeitura2(
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument oneDadosMsg0,
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument oneCabecMsg1,
        final br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2CallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                        .setAction("http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2/oneRecepcaoLeitura2");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                oneDadosMsg0,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                        "oneRecepcaoLeitura2")),
                new javax.xml.namespace.QName(
                    "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                    "oneRecepcaoLeitura2"));

        // add the soap_headers only if they are not null
        if (oneCabecMsg1 != null) {
            org.apache.axiom.om.OMElement omElementoneCabecMsg1 = toOM(oneCabecMsg1,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.portalfiscal.inf.br/one/wsdl/oneRecepcaoLeitura2",
                            "oneRecepcaoLeitura2")));
            addHeader(omElementoneCabecMsg1, env);
        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultoneRecepcaoLeitura2((br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErroroneRecepcaoLeitura2(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "oneRecepcaoLeitura2"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "oneRecepcaoLeitura2"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "oneRecepcaoLeitura2"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErroroneRecepcaoLeitura2(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroroneRecepcaoLeitura2(f);
                                }
                            } else {
                                callback.receiveErroroneRecepcaoLeitura2(f);
                            }
                        } else {
                            callback.receiveErroroneRecepcaoLeitura2(f);
                        }
                    } else {
                        callback.receiveErroroneRecepcaoLeitura2(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErroroneRecepcaoLeitura2(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    //https://one-homologacao.svrs.rs.gov.br/ws/oneRecepcaoLeitura2/oneRecepcaoLeitura2.asmx
    private org.apache.axiom.om.OMElement toOM(
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();

        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();

        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        return toOM(param);
    }

    private org.apache.axiom.om.OMElement toOM(
        final br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument param)
        throws org.apache.axis2.AxisFault {
        org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();

        org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(new javax.xml.transform.sax.SAXSource(
                    new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param,
                        xmlOptions), new org.xml.sax.InputSource()));

        try {
            return builder.getDocumentElement(true);
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, optimizeContent));
        }

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param, java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
        try {
            if (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneDadosMsgDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }

            if (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }

            if (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }

            if (br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument.class.equals(
                        type)) {
                if (extraNamespaces != null) {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(),
                        new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(
                            extraNamespaces));
                } else {
                    return br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneCabecMsgDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                }
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
