/**
 * QueryFM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class QueryFM  implements java.io.Serializable {
    private java.lang.String productregcode;

    private java.lang.String ENCregNo;

    public QueryFM() {
    }

    public QueryFM(
           java.lang.String productregcode,
           java.lang.String ENCregNo) {
           this.productregcode = productregcode;
           this.ENCregNo = ENCregNo;
    }


    /**
     * Gets the productregcode value for this QueryFM.
     * 
     * @return productregcode
     */
    public java.lang.String getProductregcode() {
        return productregcode;
    }


    /**
     * Sets the productregcode value for this QueryFM.
     * 
     * @param productregcode
     */
    public void setProductregcode(java.lang.String productregcode) {
        this.productregcode = productregcode;
    }


    /**
     * Gets the ENCregNo value for this QueryFM.
     * 
     * @return ENCregNo
     */
    public java.lang.String getENCregNo() {
        return ENCregNo;
    }


    /**
     * Sets the ENCregNo value for this QueryFM.
     * 
     * @param ENCregNo
     */
    public void setENCregNo(java.lang.String ENCregNo) {
        this.ENCregNo = ENCregNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFM)) return false;
        QueryFM other = (QueryFM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productregcode==null && other.getProductregcode()==null) || 
             (this.productregcode!=null &&
              this.productregcode.equals(other.getProductregcode()))) &&
            ((this.ENCregNo==null && other.getENCregNo()==null) || 
             (this.ENCregNo!=null &&
              this.ENCregNo.equals(other.getENCregNo())));
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
        if (getProductregcode() != null) {
            _hashCode += getProductregcode().hashCode();
        }
        if (getENCregNo() != null) {
            _hashCode += getENCregNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryFM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryFM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productregcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "productregcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENCregNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ENCregNo"));
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
