/**
 * GetResultCollectDataBetDatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class GetResultCollectDataBetDatesResponse  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.GetResultCollectDataBetDatesResponseGetResultCollectDataBetDatesResult getResultCollectDataBetDatesResult;

    public GetResultCollectDataBetDatesResponse() {
    }

    public GetResultCollectDataBetDatesResponse(
           com.i1314i.ourproject.service.webservice.serviceUtil.GetResultCollectDataBetDatesResponseGetResultCollectDataBetDatesResult getResultCollectDataBetDatesResult) {
           this.getResultCollectDataBetDatesResult = getResultCollectDataBetDatesResult;
    }


    /**
     * Gets the getResultCollectDataBetDatesResult value for this GetResultCollectDataBetDatesResponse.
     * 
     * @return getResultCollectDataBetDatesResult
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetResultCollectDataBetDatesResponseGetResultCollectDataBetDatesResult getGetResultCollectDataBetDatesResult() {
        return getResultCollectDataBetDatesResult;
    }


    /**
     * Sets the getResultCollectDataBetDatesResult value for this GetResultCollectDataBetDatesResponse.
     * 
     * @param getResultCollectDataBetDatesResult
     */
    public void setGetResultCollectDataBetDatesResult(com.i1314i.ourproject.service.webservice.serviceUtil.GetResultCollectDataBetDatesResponseGetResultCollectDataBetDatesResult getResultCollectDataBetDatesResult) {
        this.getResultCollectDataBetDatesResult = getResultCollectDataBetDatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResultCollectDataBetDatesResponse)) return false;
        GetResultCollectDataBetDatesResponse other = (GetResultCollectDataBetDatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getResultCollectDataBetDatesResult==null && other.getGetResultCollectDataBetDatesResult()==null) || 
             (this.getResultCollectDataBetDatesResult!=null &&
              this.getResultCollectDataBetDatesResult.equals(other.getGetResultCollectDataBetDatesResult())));
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
        if (getGetResultCollectDataBetDatesResult() != null) {
            _hashCode += getGetResultCollectDataBetDatesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetResultCollectDataBetDatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetResultCollectDataBetDatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getResultCollectDataBetDatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetResultCollectDataBetDatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetResultCollectDataBetDatesResponse>GetResultCollectDataBetDatesResult"));
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
