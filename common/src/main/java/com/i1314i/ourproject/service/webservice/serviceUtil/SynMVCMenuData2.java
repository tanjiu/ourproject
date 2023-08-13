/**
 * SynMVCMenuData2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SynMVCMenuData2  implements java.io.Serializable {
    private java.lang.String xmlRegion;

    private int slen;

    public SynMVCMenuData2() {
    }

    public SynMVCMenuData2(
           java.lang.String xmlRegion,
           int slen) {
           this.xmlRegion = xmlRegion;
           this.slen = slen;
    }


    /**
     * Gets the xmlRegion value for this SynMVCMenuData2.
     * 
     * @return xmlRegion
     */
    public java.lang.String getXmlRegion() {
        return xmlRegion;
    }


    /**
     * Sets the xmlRegion value for this SynMVCMenuData2.
     * 
     * @param xmlRegion
     */
    public void setXmlRegion(java.lang.String xmlRegion) {
        this.xmlRegion = xmlRegion;
    }


    /**
     * Gets the slen value for this SynMVCMenuData2.
     * 
     * @return slen
     */
    public int getSlen() {
        return slen;
    }


    /**
     * Sets the slen value for this SynMVCMenuData2.
     * 
     * @param slen
     */
    public void setSlen(int slen) {
        this.slen = slen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynMVCMenuData2)) return false;
        SynMVCMenuData2 other = (SynMVCMenuData2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xmlRegion==null && other.getXmlRegion()==null) || 
             (this.xmlRegion!=null &&
              this.xmlRegion.equals(other.getXmlRegion()))) &&
            this.slen == other.getSlen();
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
        if (getXmlRegion() != null) {
            _hashCode += getXmlRegion().hashCode();
        }
        _hashCode += getSlen();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynMVCMenuData2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SynMVCMenuData2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XmlRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "slen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
