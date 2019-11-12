/**
 * AutenticacionControllerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controller;

public class AutenticacionControllerServiceLocator extends org.apache.axis.client.Service implements controller.AutenticacionControllerService {

    public AutenticacionControllerServiceLocator() {
    }


    public AutenticacionControllerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AutenticacionControllerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AutenticacionController
    private java.lang.String AutenticacionController_address = "http://localhost:8080/02_autenticacion_ws/services/AutenticacionController";

    public java.lang.String getAutenticacionControllerAddress() {
        return AutenticacionController_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AutenticacionControllerWSDDServiceName = "AutenticacionController";

    public java.lang.String getAutenticacionControllerWSDDServiceName() {
        return AutenticacionControllerWSDDServiceName;
    }

    public void setAutenticacionControllerWSDDServiceName(java.lang.String name) {
        AutenticacionControllerWSDDServiceName = name;
    }

    public controller.AutenticacionController getAutenticacionController() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AutenticacionController_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAutenticacionController(endpoint);
    }

    public controller.AutenticacionController getAutenticacionController(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            controller.AutenticacionControllerSoapBindingStub _stub = new controller.AutenticacionControllerSoapBindingStub(portAddress, this);
            _stub.setPortName(getAutenticacionControllerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAutenticacionControllerEndpointAddress(java.lang.String address) {
        AutenticacionController_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (controller.AutenticacionController.class.isAssignableFrom(serviceEndpointInterface)) {
                controller.AutenticacionControllerSoapBindingStub _stub = new controller.AutenticacionControllerSoapBindingStub(new java.net.URL(AutenticacionController_address), this);
                _stub.setPortName(getAutenticacionControllerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AutenticacionController".equals(inputPortName)) {
            return getAutenticacionController();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller", "AutenticacionControllerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller", "AutenticacionController"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AutenticacionController".equals(portName)) {
            setAutenticacionControllerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
