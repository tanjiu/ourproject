/**
 * SyncMyzlCheckFoodData2005Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncMyzlCheckFoodData2005Response  implements java.io.Serializable {
    private java.lang.String syncMyzlCheckFoodData2005Result;

    public SyncMyzlCheckFoodData2005Response() {
    }

    public SyncMyzlCheckFoodData2005Response(
           java.lang.String syncMyzlCheckFoodData2005Result) {
           this.syncMyzlCheckFoodData2005Result = syncMyzlCheckFoodData2005Result;
    }


    /**
     * Gets the syncMyzlCheckFoodData2005Result value for this SyncMyzlCheckFoodData2005Response.
     * 
     * @return syncMyzlCheckFoodData2005Result
     */
    public java.lang.String getSyncMyzlCheckFoodData2005Result() {
        return syncMyzlCheckFoodData2005Result;
    }


    /**
     * Sets the syncMyzlCheckFoodData2005Result value for this SyncMyzlCheckFoodData2005Response.
     * 
     * @param syncMyzlCheckFoodData2005Result
     */
    public void setSyncMyzlCheckFoodData2005Result(java.lang.String syncMyzlCheckFoodData2005Result) {
        this.syncMyzlCheckFoodData2005Result = syncMyzlCheckFoodData2005Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncMyzlCheckFoodData2005Response)) return false;
        SyncMyzlCheckFoodData2005Response other = (SyncMyzlCheckFoodData2005Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncMyzlCheckFoodData2005Result==null && other.getSyncMyzlCheckFoodData2005Result()==null) || 
             (this.syncMyzlCheckFoodData2005Result!=null &&
              this.syncMyzlCheckFoodData2005Result.equals(other.getSyncMyzlCheckFoodData2005Result())));
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
        if (getSyncMyzlCheckFoodData2005Result() != null) {
            _hashCode += getSyncMyzlCheckFoodData2005Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncMyzlCheckFoodData2005Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncMyzlCheckFoodData2005Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncMyzlCheckFoodData2005Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SyncMyzlCheckFoodData2005Result"));
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
