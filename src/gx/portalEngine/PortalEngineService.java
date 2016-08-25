/**
 * PortalEngineService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package gx.portalEngine;

public interface PortalEngineService extends javax.xml.rpc.Service {
    public java.lang.String getPortalEngineAddress();

    public gx.portalEngine.PortalEngine_PortType getPortalEngine() throws javax.xml.rpc.ServiceException;

    public gx.portalEngine.PortalEngine_PortType getPortalEngine(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
