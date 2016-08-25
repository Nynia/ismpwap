/**
 * PortalEngineServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package gx.portalEngine;

public class PortalEngineServiceLocator extends org.apache.axis.client.Service implements gx.portalEngine.PortalEngineService {

    public PortalEngineServiceLocator() {
    }


    public PortalEngineServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PortalEngineServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PortalEngine
    private java.lang.String PortalEngine_address = "http://132.228.241.114:8080/services/PortalEngine";

    public java.lang.String getPortalEngineAddress() {
        return PortalEngine_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PortalEngineWSDDServiceName = "PortalEngine";

    public java.lang.String getPortalEngineWSDDServiceName() {
        return PortalEngineWSDDServiceName;
    }

    public void setPortalEngineWSDDServiceName(java.lang.String name) {
        PortalEngineWSDDServiceName = name;
    }

    public gx.portalEngine.PortalEngine_PortType getPortalEngine() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PortalEngine_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortalEngine(endpoint);
    }

    public gx.portalEngine.PortalEngine_PortType getPortalEngine(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            gx.portalEngine.PortalEngineSoapBindingStub _stub = new gx.portalEngine.PortalEngineSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortalEngineWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortalEngineEndpointAddress(java.lang.String address) {
        PortalEngine_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (gx.portalEngine.PortalEngine_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                gx.portalEngine.PortalEngineSoapBindingStub _stub = new gx.portalEngine.PortalEngineSoapBindingStub(new java.net.URL(PortalEngine_address), this);
                _stub.setPortName(getPortalEngineWSDDServiceName());
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
        if ("PortalEngine".equals(inputPortName)) {
            return getPortalEngine();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "PortalEngineService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "PortalEngine"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PortalEngine".equals(portName)) {
            setPortalEngineEndpointAddress(address);
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
