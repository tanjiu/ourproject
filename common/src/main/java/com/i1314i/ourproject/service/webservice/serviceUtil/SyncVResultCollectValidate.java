/**
 * SyncVResultCollectValidate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncVResultCollectValidate  implements java.io.Serializable {
    private java.lang.String farmID;

    private java.lang.String pwd;

    private java.lang.String code;

    private com.i1314i.ourproject.service.webservice.serviceUtil.SyncVResultCollectValidateXmlCheck xmlCheck;

    public SyncVResultCollectValidate() {
    }

    public SyncVResultCollectValidate(
           java.lang.String farmID,
           java.lang.String pwd,
           java.lang.String code,
           com.i1314i.ourproject.service.webservice.serviceUtil.SyncVResultCollectValidateXmlCheck xmlCheck) {
           this.farmID = farmID;
           this.pwd = pwd;
           this.code = code;
           this.xmlCheck = xmlCheck;
    }


    /**
     * Gets the farmID value for this SyncVResultCollectValidate.
     * 
     * @return farmID
     */
    public java.lang.String getFarmID() {
        return farmID;
    }


    /**
     * Sets the farmID value for this SyncVResultCollectValidate.
     * 
     * @param farmID
     */
    public void setFarmID(java.lang.String farmID) {
        this.farmID = farmID;
    }


    /**
     * Gets the pwd value for this SyncVResultCollectValidate.
     * 
     * @return pwd
     */
    public java.lang.String getPwd() {
        return pwd;
    }


    /**
     * Sets the pwd value for this SyncVResultCollectValidate.
     * 
     * @param pwd
     */
    public void setPwd(java.lang.String pwd) {
        this.pwd = pwd;
    }


    /**
     * Gets the code value for this SyncVResultCollectValidate.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this SyncVResultCollectValidate.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the xmlCheck value for this SyncVResultCollectValidate.
     * 
     * @return xmlCheck
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SyncVResultCollectValidateXmlCheck getXmlCheck() {
        return xmlCheck;
    }


    /**
     * Sets the xmlCheck value for this SyncVResultCollectValidate.
     * 
     * @param xmlCheck
     */
    public void setXmlCheck(com.i1314i.ourproject.service.webservice.serviceUtil.SyncVResultCollectValidateXmlCheck xmlCheck) {
        this.xmlCheck = xmlCheck;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncVResultCollectValidate)) return false;
        SyncVResultCollectValidate other = (SyncVResultCollectValidate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.farmID==null && other.getFarmID()==null) || 
             (this.farmID!=null &&
              this.farmID.equals(other.getFarmID()))) &&
            ((this.pwd==null && other.getPwd()==null) || 
             (this.pwd!=null &&
              this.pwd.equals(other.getPwd()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.xmlCheck==null && other.getXmlCheck()==null) || 
             (this.xmlCheck!=null &&
              this.xmlCheck.equals(other.getXmlCheck())));
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
        if (getFarmID() != null) {
            _hashCode += getFarmID().hashCode();
        }
        if (getPwd() != null) {
            _hashCode += getPwd().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getXmlCheck() != null) {
            _hashCode += getXmlCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncVResultCollectValidate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncVResultCollectValidate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("farmID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FarmID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Pwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XmlCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SyncVResultCollectValidate>XmlCheck"));
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
