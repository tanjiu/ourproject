/**
 * GetCheckDataByRIDOrFID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class GetCheckDataByRIDOrFID  implements java.io.Serializable {
    private java.lang.String strToken;

    private java.lang.String farmID;

    private java.lang.String regionID;

    private java.lang.String startTime;

    private java.lang.String endTime;

    public GetCheckDataByRIDOrFID() {
    }

    public GetCheckDataByRIDOrFID(
           java.lang.String strToken,
           java.lang.String farmID,
           java.lang.String regionID,
           java.lang.String startTime,
           java.lang.String endTime) {
           this.strToken = strToken;
           this.farmID = farmID;
           this.regionID = regionID;
           this.startTime = startTime;
           this.endTime = endTime;
    }


    /**
     * Gets the strToken value for this GetCheckDataByRIDOrFID.
     * 
     * @return strToken
     */
    public java.lang.String getStrToken() {
        return strToken;
    }


    /**
     * Sets the strToken value for this GetCheckDataByRIDOrFID.
     * 
     * @param strToken
     */
    public void setStrToken(java.lang.String strToken) {
        this.strToken = strToken;
    }


    /**
     * Gets the farmID value for this GetCheckDataByRIDOrFID.
     * 
     * @return farmID
     */
    public java.lang.String getFarmID() {
        return farmID;
    }


    /**
     * Sets the farmID value for this GetCheckDataByRIDOrFID.
     * 
     * @param farmID
     */
    public void setFarmID(java.lang.String farmID) {
        this.farmID = farmID;
    }


    /**
     * Gets the regionID value for this GetCheckDataByRIDOrFID.
     * 
     * @return regionID
     */
    public java.lang.String getRegionID() {
        return regionID;
    }


    /**
     * Sets the regionID value for this GetCheckDataByRIDOrFID.
     * 
     * @param regionID
     */
    public void setRegionID(java.lang.String regionID) {
        this.regionID = regionID;
    }


    /**
     * Gets the startTime value for this GetCheckDataByRIDOrFID.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this GetCheckDataByRIDOrFID.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this GetCheckDataByRIDOrFID.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this GetCheckDataByRIDOrFID.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCheckDataByRIDOrFID)) return false;
        GetCheckDataByRIDOrFID other = (GetCheckDataByRIDOrFID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strToken==null && other.getStrToken()==null) || 
             (this.strToken!=null &&
              this.strToken.equals(other.getStrToken()))) &&
            ((this.farmID==null && other.getFarmID()==null) || 
             (this.farmID!=null &&
              this.farmID.equals(other.getFarmID()))) &&
            ((this.regionID==null && other.getRegionID()==null) || 
             (this.regionID!=null &&
              this.regionID.equals(other.getRegionID()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime())));
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
        if (getStrToken() != null) {
            _hashCode += getStrToken().hashCode();
        }
        if (getFarmID() != null) {
            _hashCode += getFarmID().hashCode();
        }
        if (getRegionID() != null) {
            _hashCode += getRegionID().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCheckDataByRIDOrFID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCheckDataByRIDOrFID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("farmID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FarmID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndTime"));
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
