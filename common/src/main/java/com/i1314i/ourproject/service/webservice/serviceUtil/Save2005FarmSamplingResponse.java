/**
 * Save2005FarmSamplingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class Save2005FarmSamplingResponse  implements java.io.Serializable {
    private java.lang.String save2005FarmSamplingResult;

    public Save2005FarmSamplingResponse() {
    }

    public Save2005FarmSamplingResponse(
           java.lang.String save2005FarmSamplingResult) {
           this.save2005FarmSamplingResult = save2005FarmSamplingResult;
    }


    /**
     * Gets the save2005FarmSamplingResult value for this Save2005FarmSamplingResponse.
     * 
     * @return save2005FarmSamplingResult
     */
    public java.lang.String getSave2005FarmSamplingResult() {
        return save2005FarmSamplingResult;
    }


    /**
     * Sets the save2005FarmSamplingResult value for this Save2005FarmSamplingResponse.
     * 
     * @param save2005FarmSamplingResult
     */
    public void setSave2005FarmSamplingResult(java.lang.String save2005FarmSamplingResult) {
        this.save2005FarmSamplingResult = save2005FarmSamplingResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Save2005FarmSamplingResponse)) return false;
        Save2005FarmSamplingResponse other = (Save2005FarmSamplingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.save2005FarmSamplingResult==null && other.getSave2005FarmSamplingResult()==null) || 
             (this.save2005FarmSamplingResult!=null &&
              this.save2005FarmSamplingResult.equals(other.getSave2005FarmSamplingResult())));
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
        if (getSave2005FarmSamplingResult() != null) {
            _hashCode += getSave2005FarmSamplingResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Save2005FarmSamplingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Save2005FarmSamplingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("save2005FarmSamplingResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Save2005FarmSamplingResult"));
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
