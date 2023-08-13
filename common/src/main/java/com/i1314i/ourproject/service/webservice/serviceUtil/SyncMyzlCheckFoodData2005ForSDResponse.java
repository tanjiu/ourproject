/**
 * SyncMyzlCheckFoodData2005ForSDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncMyzlCheckFoodData2005ForSDResponse  implements java.io.Serializable {
    private java.lang.String syncMyzlCheckFoodData2005ForSDResult;

    public SyncMyzlCheckFoodData2005ForSDResponse() {
    }

    public SyncMyzlCheckFoodData2005ForSDResponse(
           java.lang.String syncMyzlCheckFoodData2005ForSDResult) {
           this.syncMyzlCheckFoodData2005ForSDResult = syncMyzlCheckFoodData2005ForSDResult;
    }


    /**
     * Gets the syncMyzlCheckFoodData2005ForSDResult value for this SyncMyzlCheckFoodData2005ForSDResponse.
     * 
     * @return syncMyzlCheckFoodData2005ForSDResult
     */
    public java.lang.String getSyncMyzlCheckFoodData2005ForSDResult() {
        return syncMyzlCheckFoodData2005ForSDResult;
    }


    /**
     * Sets the syncMyzlCheckFoodData2005ForSDResult value for this SyncMyzlCheckFoodData2005ForSDResponse.
     * 
     * @param syncMyzlCheckFoodData2005ForSDResult
     */
    public void setSyncMyzlCheckFoodData2005ForSDResult(java.lang.String syncMyzlCheckFoodData2005ForSDResult) {
        this.syncMyzlCheckFoodData2005ForSDResult = syncMyzlCheckFoodData2005ForSDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncMyzlCheckFoodData2005ForSDResponse)) return false;
        SyncMyzlCheckFoodData2005ForSDResponse other = (SyncMyzlCheckFoodData2005ForSDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncMyzlCheckFoodData2005ForSDResult==null && other.getSyncMyzlCheckFoodData2005ForSDResult()==null) || 
             (this.syncMyzlCheckFoodData2005ForSDResult!=null &&
              this.syncMyzlCheckFoodData2005ForSDResult.equals(other.getSyncMyzlCheckFoodData2005ForSDResult())));
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
        if (getSyncMyzlCheckFoodData2005ForSDResult() != null) {
            _hashCode += getSyncMyzlCheckFoodData2005ForSDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncMyzlCheckFoodData2005ForSDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncMyzlCheckFoodData2005ForSDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncMyzlCheckFoodData2005ForSDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncMyzlCheckFoodData2005ForSDResult"));
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
