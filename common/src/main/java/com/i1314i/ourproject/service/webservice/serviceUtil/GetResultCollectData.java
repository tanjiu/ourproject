/**
 * GetResultCollectData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class GetResultCollectData  implements java.io.Serializable {
    private java.lang.String checkDate;

    private java.lang.String regionID;

    public GetResultCollectData() {
    }

    public GetResultCollectData(
           java.lang.String checkDate,
           java.lang.String regionID) {
           this.checkDate = checkDate;
           this.regionID = regionID;
    }


    /**
     * Gets the checkDate value for this GetResultCollectData.
     * 
     * @return checkDate
     */
    public java.lang.String getCheckDate() {
        return checkDate;
    }


    /**
     * Sets the checkDate value for this GetResultCollectData.
     * 
     * @param checkDate
     */
    public void setCheckDate(java.lang.String checkDate) {
        this.checkDate = checkDate;
    }


    /**
     * Gets the regionID value for this GetResultCollectData.
     * 
     * @return regionID
     */
    public java.lang.String getRegionID() {
        return regionID;
    }


    /**
     * Sets the regionID value for this GetResultCollectData.
     * 
     * @param regionID
     */
    public void setRegionID(java.lang.String regionID) {
        this.regionID = regionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResultCollectData)) return false;
        GetResultCollectData other = (GetResultCollectData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkDate==null && other.getCheckDate()==null) || 
             (this.checkDate!=null &&
              this.checkDate.equals(other.getCheckDate()))) &&
            ((this.regionID==null && other.getRegionID()==null) || 
             (this.regionID!=null &&
              this.regionID.equals(other.getRegionID())));
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
        if (getCheckDate() != null) {
            _hashCode += getCheckDate().hashCode();
        }
        if (getRegionID() != null) {
            _hashCode += getRegionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetResultCollectData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetResultCollectData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegionID"));
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
