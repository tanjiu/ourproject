/**
 * SyncFoodCheckDataValidate2005Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncFoodCheckDataValidate2005Response  implements java.io.Serializable {
    private java.lang.String syncFoodCheckDataValidate2005Result;

    public SyncFoodCheckDataValidate2005Response() {
    }

    public SyncFoodCheckDataValidate2005Response(
           java.lang.String syncFoodCheckDataValidate2005Result) {
           this.syncFoodCheckDataValidate2005Result = syncFoodCheckDataValidate2005Result;
    }


    /**
     * Gets the syncFoodCheckDataValidate2005Result value for this SyncFoodCheckDataValidate2005Response.
     * 
     * @return syncFoodCheckDataValidate2005Result
     */
    public java.lang.String getSyncFoodCheckDataValidate2005Result() {
        return syncFoodCheckDataValidate2005Result;
    }


    /**
     * Sets the syncFoodCheckDataValidate2005Result value for this SyncFoodCheckDataValidate2005Response.
     * 
     * @param syncFoodCheckDataValidate2005Result
     */
    public void setSyncFoodCheckDataValidate2005Result(java.lang.String syncFoodCheckDataValidate2005Result) {
        this.syncFoodCheckDataValidate2005Result = syncFoodCheckDataValidate2005Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncFoodCheckDataValidate2005Response)) return false;
        SyncFoodCheckDataValidate2005Response other = (SyncFoodCheckDataValidate2005Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncFoodCheckDataValidate2005Result==null && other.getSyncFoodCheckDataValidate2005Result()==null) || 
             (this.syncFoodCheckDataValidate2005Result!=null &&
              this.syncFoodCheckDataValidate2005Result.equals(other.getSyncFoodCheckDataValidate2005Result())));
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
        if (getSyncFoodCheckDataValidate2005Result() != null) {
            _hashCode += getSyncFoodCheckDataValidate2005Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncFoodCheckDataValidate2005Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncFoodCheckDataValidate2005Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncFoodCheckDataValidate2005Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncFoodCheckDataValidate2005Result"));
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
