/**
 * SyncFarmsInfoListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncFarmsInfoListResponse  implements java.io.Serializable {
    private java.lang.String syncFarmsInfoListResult;

    public SyncFarmsInfoListResponse() {
    }

    public SyncFarmsInfoListResponse(
           java.lang.String syncFarmsInfoListResult) {
           this.syncFarmsInfoListResult = syncFarmsInfoListResult;
    }


    /**
     * Gets the syncFarmsInfoListResult value for this SyncFarmsInfoListResponse.
     * 
     * @return syncFarmsInfoListResult
     */
    public java.lang.String getSyncFarmsInfoListResult() {
        return syncFarmsInfoListResult;
    }


    /**
     * Sets the syncFarmsInfoListResult value for this SyncFarmsInfoListResponse.
     * 
     * @param syncFarmsInfoListResult
     */
    public void setSyncFarmsInfoListResult(java.lang.String syncFarmsInfoListResult) {
        this.syncFarmsInfoListResult = syncFarmsInfoListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncFarmsInfoListResponse)) return false;
        SyncFarmsInfoListResponse other = (SyncFarmsInfoListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncFarmsInfoListResult==null && other.getSyncFarmsInfoListResult()==null) || 
             (this.syncFarmsInfoListResult!=null &&
              this.syncFarmsInfoListResult.equals(other.getSyncFarmsInfoListResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSyncFarmsInfoListResult() != null) {
            _hashCode += getSyncFarmsInfoListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncFarmsInfoListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncFarmsInfoListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncFarmsInfoListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncFarmsInfoListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
