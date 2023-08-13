/**
 * GetResultCollectDataBetDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class GetResultCollectDataBetDates  implements java.io.Serializable {
    private java.lang.String bdate;

    private java.lang.String edate;

    private java.lang.String regionID;

    public GetResultCollectDataBetDates() {
    }

    public GetResultCollectDataBetDates(
           java.lang.String bdate,
           java.lang.String edate,
           java.lang.String regionID) {
           this.bdate = bdate;
           this.edate = edate;
           this.regionID = regionID;
    }


    /**
     * Gets the bdate value for this GetResultCollectDataBetDates.
     * 
     * @return bdate
     */
    public java.lang.String getBdate() {
        return bdate;
    }


    /**
     * Sets the bdate value for this GetResultCollectDataBetDates.
     * 
     * @param bdate
     */
    public void setBdate(java.lang.String bdate) {
        this.bdate = bdate;
    }


    /**
     * Gets the edate value for this GetResultCollectDataBetDates.
     * 
     * @return edate
     */
    public java.lang.String getEdate() {
        return edate;
    }


    /**
     * Sets the edate value for this GetResultCollectDataBetDates.
     * 
     * @param edate
     */
    public void setEdate(java.lang.String edate) {
        this.edate = edate;
    }


    /**
     * Gets the regionID value for this GetResultCollectDataBetDates.
     * 
     * @return regionID
     */
    public java.lang.String getRegionID() {
        return regionID;
    }


    /**
     * Sets the regionID value for this GetResultCollectDataBetDates.
     * 
     * @param regionID
     */
    public void setRegionID(java.lang.String regionID) {
        this.regionID = regionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResultCollectDataBetDates)) return false;
        GetResultCollectDataBetDates other = (GetResultCollectDataBetDates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bdate==null && other.getBdate()==null) || 
             (this.bdate!=null &&
              this.bdate.equals(other.getBdate()))) &&
            ((this.edate==null && other.getEdate()==null) || 
             (this.edate!=null &&
              this.edate.equals(other.getEdate()))) &&
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
        if (getBdate() != null) {
            _hashCode += getBdate().hashCode();
        }
        if (getEdate() != null) {
            _hashCode += getEdate().hashCode();
        }
        if (getRegionID() != null) {
            _hashCode += getRegionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetResultCollectDataBetDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetResultCollectDataBetDates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Bdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Edate"));
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
