/**
 * SyncCheckDataToServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncCheckDataToServer  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckDataToServerDataXml dataXml;

    public SyncCheckDataToServer() {
    }

    public SyncCheckDataToServer(
           com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckDataToServerDataXml dataXml) {
           this.dataXml = dataXml;
    }


    /**
     * Gets the dataXml value for this SyncCheckDataToServer.
     * 
     * @return dataXml
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckDataToServerDataXml getDataXml() {
        return dataXml;
    }


    /**
     * Sets the dataXml value for this SyncCheckDataToServer.
     * 
     * @param dataXml
     */
    public void setDataXml(com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckDataToServerDataXml dataXml) {
        this.dataXml = dataXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncCheckDataToServer)) return false;
        SyncCheckDataToServer other = (SyncCheckDataToServer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataXml==null && other.getDataXml()==null) || 
             (this.dataXml!=null &&
              this.dataXml.equals(other.getDataXml())));
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
        if (getDataXml() != null) {
            _hashCode += getDataXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncCheckDataToServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncCheckDataToServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DataXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SyncCheckDataToServer>DataXml"));
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
