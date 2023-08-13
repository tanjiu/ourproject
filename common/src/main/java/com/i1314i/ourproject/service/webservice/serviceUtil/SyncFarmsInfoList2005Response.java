/**
 * SyncFarmsInfoList2005Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncFarmsInfoList2005Response  implements java.io.Serializable {
    private java.lang.String syncFarmsInfoList2005Result;

    public SyncFarmsInfoList2005Response() {
    }

    public SyncFarmsInfoList2005Response(
           java.lang.String syncFarmsInfoList2005Result) {
           this.syncFarmsInfoList2005Result = syncFarmsInfoList2005Result;
    }


    /**
     * Gets the syncFarmsInfoList2005Result value for this SyncFarmsInfoList2005Response.
     * 
     * @return syncFarmsInfoList2005Result
     */
    public java.lang.String getSyncFarmsInfoList2005Result() {
        return syncFarmsInfoList2005Result;
    }


    /**
     * Sets the syncFarmsInfoList2005Result value for this SyncFarmsInfoList2005Response.
     * 
     * @param syncFarmsInfoList2005Result
     */
    public void setSyncFarmsInfoList2005Result(java.lang.String syncFarmsInfoList2005Result) {
        this.syncFarmsInfoList2005Result = syncFarmsInfoList2005Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncFarmsInfoList2005Response)) return false;
        SyncFarmsInfoList2005Response other = (SyncFarmsInfoList2005Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncFarmsInfoList2005Result==null && other.getSyncFarmsInfoList2005Result()==null) || 
             (this.syncFarmsInfoList2005Result!=null &&
              this.syncFarmsInfoList2005Result.equals(other.getSyncFarmsInfoList2005Result())));
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
        if (getSyncFarmsInfoList2005Result() != null) {
            _hashCode += getSyncFarmsInfoList2005Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncFarmsInfoList2005Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncFarmsInfoList2005Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncFarmsInfoList2005Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncFarmsInfoList2005Result"));
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
