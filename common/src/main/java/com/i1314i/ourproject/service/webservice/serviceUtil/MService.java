/**
 * MService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public interface MService extends javax.xml.rpc.Service {
    public java.lang.String getMServiceSoapAddress();

    public com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_PortType getMServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.i1314i.ourproject.service.webservice.serviceUtil.MServiceSoap_PortType getMServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
