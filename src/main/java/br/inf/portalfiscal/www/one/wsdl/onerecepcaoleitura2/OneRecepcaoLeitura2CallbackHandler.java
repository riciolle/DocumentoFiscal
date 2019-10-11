/**
 * OneRecepcaoLeitura2CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2;


/**
 *  OneRecepcaoLeitura2CallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class OneRecepcaoLeitura2CallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public OneRecepcaoLeitura2CallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public OneRecepcaoLeitura2CallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for oneRecepcaoLeitura2 method
     * override this method for handling normal response from oneRecepcaoLeitura2 operation
     */
    public void receiveResultoneRecepcaoLeitura2(
        br.inf.portalfiscal.www.one.wsdl.onerecepcaoleitura2.OneRecepcaoLeitura2ResultDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from oneRecepcaoLeitura2 operation
     */
    public void receiveErroroneRecepcaoLeitura2(java.lang.Exception e) {
    }
}
