/**
 * QueryFuboAgriBaseInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class QueryFuboAgriBaseInfoResponse  implements java.io.Serializable {
    private java.lang.String queryFuboAgriBaseInfoResult;

    public QueryFuboAgriBaseInfoResponse() {
    }

    public QueryFuboAgriBaseInfoResponse(
           java.lang.String queryFuboAgriBaseInfoResult) {
           this.queryFuboAgriBaseInfoResult = queryFuboAgriBaseInfoResult;
    }


    /**
     * Gets the queryFuboAgriBaseInfoResult value for this QueryFuboAgriBaseInfoResponse.
     * 
     * @return queryFuboAgriBaseInfoResult
     */
    public java.lang.String getQueryFuboAgriBaseInfoResult() {
        return queryFuboAgriBaseInfoResult;
    }


    /**
     * Sets the queryFuboAgriBaseInfoResult value for this QueryFuboAgriBaseInfoResponse.
     * 
     * @param queryFuboAgriBaseInfoResult
     */
    public void setQueryFuboAgriBaseInfoResult(java.lang.String queryFuboAgriBaseInfoResult) {
        this.queryFuboAgriBaseInfoResult = queryFuboAgriBaseInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFuboAgriBaseInfoResponse)) return false;
        QueryFuboAgriBaseInfoResponse other = (QueryFuboAgriBaseInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryFuboAgriBaseInfoResult==null && other.getQueryFuboAgriBaseInfoResult()==null) || 
             (this.queryFuboAgriBaseInfoResult!=null &&
              this.queryFuboAgriBaseInfoResult.equals(other.getQueryFuboAgriBaseInfoResult())));
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
        if (getQueryFuboAgriBaseInfoResult() != null) {
            _hashCode += getQueryFuboAgriBaseInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryFuboAgriBaseInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryFuboAgriBaseInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryFuboAgriBaseInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryFuboAgriBaseInfoResult"));
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
