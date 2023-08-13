/**
 * Check2005SamplingValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class Check2005SamplingValue  implements java.io.Serializable {
    private java.lang.String code;

    private com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueAtaskinfo ataskinfo;

    public Check2005SamplingValue() {
    }

    public Check2005SamplingValue(
           java.lang.String code,
           com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueAtaskinfo ataskinfo) {
           this.code = code;
           this.ataskinfo = ataskinfo;
    }


    /**
     * Gets the code value for this Check2005SamplingValue.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this Check2005SamplingValue.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the ataskinfo value for this Check2005SamplingValue.
     * 
     * @return ataskinfo
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueAtaskinfo getAtaskinfo() {
        return ataskinfo;
    }


    /**
     * Sets the ataskinfo value for this Check2005SamplingValue.
     * 
     * @param ataskinfo
     */
    public void setAtaskinfo(com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueAtaskinfo ataskinfo) {
        this.ataskinfo = ataskinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Check2005SamplingValue)) return false;
        Check2005SamplingValue other = (Check2005SamplingValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.ataskinfo==null && other.getAtaskinfo()==null) || 
             (this.ataskinfo!=null &&
              this.ataskinfo.equals(other.getAtaskinfo())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getAtaskinfo() != null) {
            _hashCode += getAtaskinfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Check2005SamplingValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Check2005SamplingValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ataskinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ataskinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Check2005SamplingValue>ataskinfo"));
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
