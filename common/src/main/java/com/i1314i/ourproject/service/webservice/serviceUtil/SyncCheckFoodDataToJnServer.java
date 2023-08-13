/**
 * SyncCheckFoodDataToJnServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncCheckFoodDataToJnServer  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlCheck xmlCheck;

    private com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlChechDetails xmlChechDetails;

    public SyncCheckFoodDataToJnServer() {
    }

    public SyncCheckFoodDataToJnServer(
           com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlCheck xmlCheck,
           com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlChechDetails xmlChechDetails) {
           this.xmlCheck = xmlCheck;
           this.xmlChechDetails = xmlChechDetails;
    }


    /**
     * Gets the xmlCheck value for this SyncCheckFoodDataToJnServer.
     * 
     * @return xmlCheck
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlCheck getXmlCheck() {
        return xmlCheck;
    }


    /**
     * Sets the xmlCheck value for this SyncCheckFoodDataToJnServer.
     * 
     * @param xmlCheck
     */
    public void setXmlCheck(com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlCheck xmlCheck) {
        this.xmlCheck = xmlCheck;
    }


    /**
     * Gets the xmlChechDetails value for this SyncCheckFoodDataToJnServer.
     * 
     * @return xmlChechDetails
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlChechDetails getXmlChechDetails() {
        return xmlChechDetails;
    }


    /**
     * Sets the xmlChechDetails value for this SyncCheckFoodDataToJnServer.
     * 
     * @param xmlChechDetails
     */
    public void setXmlChechDetails(com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlChechDetails xmlChechDetails) {
        this.xmlChechDetails = xmlChechDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncCheckFoodDataToJnServer)) return false;
        SyncCheckFoodDataToJnServer other = (SyncCheckFoodDataToJnServer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xmlCheck==null && other.getXmlCheck()==null) || 
             (this.xmlCheck!=null &&
              this.xmlCheck.equals(other.getXmlCheck()))) &&
            ((this.xmlChechDetails==null && other.getXmlChechDetails()==null) || 
             (this.xmlChechDetails!=null &&
              this.xmlChechDetails.equals(other.getXmlChechDetails())));
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
        if (getXmlCheck() != null) {
            _hashCode += getXmlCheck().hashCode();
        }
        if (getXmlChechDetails() != null) {
            _hashCode += getXmlChechDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncCheckFoodDataToJnServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncCheckFoodDataToJnServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XmlCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SyncCheckFoodDataToJnServer>XmlCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlChechDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XmlChechDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SyncCheckFoodDataToJnServer>XmlChechDetails"));
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
