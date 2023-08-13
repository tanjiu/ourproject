/**
 * SynMVCRegionData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SynMVCRegionData  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.SynMVCRegionDataXmlRegion xmlRegion;

    public SynMVCRegionData() {
    }

    public SynMVCRegionData(
           com.i1314i.ourproject.service.webservice.serviceUtil.SynMVCRegionDataXmlRegion xmlRegion) {
           this.xmlRegion = xmlRegion;
    }


    /**
     * Gets the xmlRegion value for this SynMVCRegionData.
     * 
     * @return xmlRegion
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SynMVCRegionDataXmlRegion getXmlRegion() {
        return xmlRegion;
    }


    /**
     * Sets the xmlRegion value for this SynMVCRegionData.
     * 
     * @param xmlRegion
     */
    public void setXmlRegion(com.i1314i.ourproject.service.webservice.serviceUtil.SynMVCRegionDataXmlRegion xmlRegion) {
        this.xmlRegion = xmlRegion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynMVCRegionData)) return false;
        SynMVCRegionData other = (SynMVCRegionData) obj;
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
              this.xmlRegion.equals(other.getXmlRegion())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynMVCRegionData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SynMVCRegionData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XmlRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SynMVCRegionData>XmlRegion"));
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
