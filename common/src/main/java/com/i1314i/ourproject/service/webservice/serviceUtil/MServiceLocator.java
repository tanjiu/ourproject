/**
 * MServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class MServiceLocator extends org.apache.axis.client.Service implements com.i1314i.ourproject.service.webservice.serviceUtil.MService {

    public MServiceLocator() {
    }


    public MServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MServiceSoap
    private java.lang.String MServiceSoap_address = "http://121.41.122.62/WebService/MService.asmx";

    public java.lang.String getMServiceSoapAddress() {
        return MServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MServiceSoapWSDDServiceName = "MServiceSoap";

    public java.lang.String getMServiceSoapWSDDServiceName() {
        return MServiceSoapWSDDServiceName;
    }

    public void setMServiceSoapWSDDServiceName(java.lang.String name) {
        MServiceSoapWSDDServiceName = name;
    }

    public com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_PortType getMServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMServiceSoap(endpoint);
    }

    public com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_PortType getMServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub _stub = new com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getMServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMServiceSoapEndpointAddress(java.lang.String address) {
        MServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub _stub = new com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_BindingStub(new java.net.URL(MServiceSoap_address), this);
                _stub.setPortName(getMServiceSoapWSDDServiceName());
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
        if ("MServiceSoap".equals(inputPortName)) {
            return getMServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "MService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "MServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MServiceSoap".equals(portName)) {
            setMServiceSoapEndpointAddress(address);
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
