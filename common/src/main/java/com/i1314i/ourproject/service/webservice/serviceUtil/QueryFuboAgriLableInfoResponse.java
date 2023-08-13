/**
 * QueryFuboAgriLableInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class QueryFuboAgriLableInfoResponse  implements java.io.Serializable {
    private java.lang.String queryFuboAgriLableInfoResult;

    public QueryFuboAgriLableInfoResponse() {
    }

    public QueryFuboAgriLableInfoResponse(
           java.lang.String queryFuboAgriLableInfoResult) {
           this.queryFuboAgriLableInfoResult = queryFuboAgriLableInfoResult;
    }


    /**
     * Gets the queryFuboAgriLableInfoResult value for this QueryFuboAgriLableInfoResponse.
     * 
     * @return queryFuboAgriLableInfoResult
     */
    public java.lang.String getQueryFuboAgriLableInfoResult() {
        return queryFuboAgriLableInfoResult;
    }


    /**
     * Sets the queryFuboAgriLableInfoResult value for this QueryFuboAgriLableInfoResponse.
     * 
     * @param queryFuboAgriLableInfoResult
     */
    public void setQueryFuboAgriLableInfoResult(java.lang.String queryFuboAgriLableInfoResult) {
        this.queryFuboAgriLableInfoResult = queryFuboAgriLableInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryFuboAgriLableInfoResponse)) return false;
        QueryFuboAgriLableInfoResponse other = (QueryFuboAgriLableInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryFuboAgriLableInfoResult==null && other.getQueryFuboAgriLableInfoResult()==null) || 
             (this.queryFuboAgriLableInfoResult!=null &&
              this.queryFuboAgriLableInfoResult.equals(other.getQueryFuboAgriLableInfoResult())));
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
        if (getQueryFuboAgriLableInfoResult() != null) {
            _hashCode += getQueryFuboAgriLableInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryFuboAgriLableInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryFuboAgriLableInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryFuboAgriLableInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryFuboAgriLableInfoResult"));
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
