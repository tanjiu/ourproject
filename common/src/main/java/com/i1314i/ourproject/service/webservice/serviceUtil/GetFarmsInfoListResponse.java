/**
 * GetFarmsInfoListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class GetFarmsInfoListResponse  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsInfoListResponseGetFarmsInfoListResult getFarmsInfoListResult;

    public GetFarmsInfoListResponse() {
    }

    public GetFarmsInfoListResponse(
           com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsInfoListResponseGetFarmsInfoListResult getFarmsInfoListResult) {
           this.getFarmsInfoListResult = getFarmsInfoListResult;
    }


    /**
     * Gets the getFarmsInfoListResult value for this GetFarmsInfoListResponse.
     * 
     * @return getFarmsInfoListResult
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsInfoListResponseGetFarmsInfoListResult getGetFarmsInfoListResult() {
        return getFarmsInfoListResult;
    }


    /**
     * Sets the getFarmsInfoListResult value for this GetFarmsInfoListResponse.
     * 
     * @param getFarmsInfoListResult
     */
    public void setGetFarmsInfoListResult(com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsInfoListResponseGetFarmsInfoListResult getFarmsInfoListResult) {
        this.getFarmsInfoListResult = getFarmsInfoListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFarmsInfoListResponse)) return false;
        GetFarmsInfoListResponse other = (GetFarmsInfoListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFarmsInfoListResult==null && other.getGetFarmsInfoListResult()==null) || 
             (this.getFarmsInfoListResult!=null &&
              this.getFarmsInfoListResult.equals(other.getGetFarmsInfoListResult())));
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
        if (getGetFarmsInfoListResult() != null) {
            _hashCode += getGetFarmsInfoListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFarmsInfoListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFarmsInfoListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFarmsInfoListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFarmsInfoListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFarmsInfoListResponse>GetFarmsInfoListResult"));
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
