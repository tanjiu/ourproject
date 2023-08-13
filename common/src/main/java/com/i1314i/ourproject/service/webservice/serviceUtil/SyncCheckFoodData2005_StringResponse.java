/**
 * SyncCheckFoodData2005_StringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncCheckFoodData2005_StringResponse  implements java.io.Serializable {
    private java.lang.String syncCheckFoodData2005_StringResult;

    public SyncCheckFoodData2005_StringResponse() {
    }

    public SyncCheckFoodData2005_StringResponse(
           java.lang.String syncCheckFoodData2005_StringResult) {
           this.syncCheckFoodData2005_StringResult = syncCheckFoodData2005_StringResult;
    }


    /**
     * Gets the syncCheckFoodData2005_StringResult value for this SyncCheckFoodData2005_StringResponse.
     * 
     * @return syncCheckFoodData2005_StringResult
     */
    public java.lang.String getSyncCheckFoodData2005_StringResult() {
        return syncCheckFoodData2005_StringResult;
    }


    /**
     * Sets the syncCheckFoodData2005_StringResult value for this SyncCheckFoodData2005_StringResponse.
     * 
     * @param syncCheckFoodData2005_StringResult
     */
    public void setSyncCheckFoodData2005_StringResult(java.lang.String syncCheckFoodData2005_StringResult) {
        this.syncCheckFoodData2005_StringResult = syncCheckFoodData2005_StringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncCheckFoodData2005_StringResponse)) return false;
        SyncCheckFoodData2005_StringResponse other = (SyncCheckFoodData2005_StringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncCheckFoodData2005_StringResult==null && other.getSyncCheckFoodData2005_StringResult()==null) || 
             (this.syncCheckFoodData2005_StringResult!=null &&
              this.syncCheckFoodData2005_StringResult.equals(other.getSyncCheckFoodData2005_StringResult())));
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
        if (getSyncCheckFoodData2005_StringResult() != null) {
            _hashCode += getSyncCheckFoodData2005_StringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncCheckFoodData2005_StringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncCheckFoodData2005_StringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncCheckFoodData2005_StringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncCheckFoodData2005_StringResult"));
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
