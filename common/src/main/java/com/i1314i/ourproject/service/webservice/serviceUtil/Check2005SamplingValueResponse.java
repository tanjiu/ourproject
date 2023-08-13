/**
 * Check2005SamplingValueResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class Check2005SamplingValueResponse  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueResponseCheck2005SamplingValueResult check2005SamplingValueResult;

    public Check2005SamplingValueResponse() {
    }

    public Check2005SamplingValueResponse(
           com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueResponseCheck2005SamplingValueResult check2005SamplingValueResult) {
           this.check2005SamplingValueResult = check2005SamplingValueResult;
    }


    /**
     * Gets the check2005SamplingValueResult value for this Check2005SamplingValueResponse.
     * 
     * @return check2005SamplingValueResult
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueResponseCheck2005SamplingValueResult getCheck2005SamplingValueResult() {
        return check2005SamplingValueResult;
    }


    /**
     * Sets the check2005SamplingValueResult value for this Check2005SamplingValueResponse.
     * 
     * @param check2005SamplingValueResult
     */
    public void setCheck2005SamplingValueResult(com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueResponseCheck2005SamplingValueResult check2005SamplingValueResult) {
        this.check2005SamplingValueResult = check2005SamplingValueResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Check2005SamplingValueResponse)) return false;
        Check2005SamplingValueResponse other = (Check2005SamplingValueResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.check2005SamplingValueResult==null && other.getCheck2005SamplingValueResult()==null) || 
             (this.check2005SamplingValueResult!=null &&
              this.check2005SamplingValueResult.equals(other.getCheck2005SamplingValueResult())));
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
        if (getCheck2005SamplingValueResult() != null) {
            _hashCode += getCheck2005SamplingValueResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Check2005SamplingValueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Check2005SamplingValueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check2005SamplingValueResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Check2005SamplingValueResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Check2005SamplingValueResponse>Check2005SamplingValueResult"));
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
