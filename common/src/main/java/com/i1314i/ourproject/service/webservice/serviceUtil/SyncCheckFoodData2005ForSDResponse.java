/**
 * SyncCheckFoodData2005ForSDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncCheckFoodData2005ForSDResponse  implements java.io.Serializable {
    private java.lang.String syncCheckFoodData2005ForSDResult;

    public SyncCheckFoodData2005ForSDResponse() {
    }

    public SyncCheckFoodData2005ForSDResponse(
           java.lang.String syncCheckFoodData2005ForSDResult) {
           this.syncCheckFoodData2005ForSDResult = syncCheckFoodData2005ForSDResult;
    }


    /**
     * Gets the syncCheckFoodData2005ForSDResult value for this SyncCheckFoodData2005ForSDResponse.
     * 
     * @return syncCheckFoodData2005ForSDResult
     */
    public java.lang.String getSyncCheckFoodData2005ForSDResult() {
        return syncCheckFoodData2005ForSDResult;
    }


    /**
     * Sets the syncCheckFoodData2005ForSDResult value for this SyncCheckFoodData2005ForSDResponse.
     * 
     * @param syncCheckFoodData2005ForSDResult
     */
    public void setSyncCheckFoodData2005ForSDResult(java.lang.String syncCheckFoodData2005ForSDResult) {
        this.syncCheckFoodData2005ForSDResult = syncCheckFoodData2005ForSDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncCheckFoodData2005ForSDResponse)) return false;
        SyncCheckFoodData2005ForSDResponse other = (SyncCheckFoodData2005ForSDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncCheckFoodData2005ForSDResult==null && other.getSyncCheckFoodData2005ForSDResult()==null) || 
             (this.syncCheckFoodData2005ForSDResult!=null &&
              this.syncCheckFoodData2005ForSDResult.equals(other.getSyncCheckFoodData2005ForSDResult())));
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
        if (getSyncCheckFoodData2005ForSDResult() != null) {
            _hashCode += getSyncCheckFoodData2005ForSDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncCheckFoodData2005ForSDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncCheckFoodData2005ForSDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncCheckFoodData2005ForSDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncCheckFoodData2005ForSDResult"));
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
