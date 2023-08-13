/**
 * SyncFamrsDataToServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncFamrsDataToServer  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.SyncFamrsDataToServerDataXml dataXml;

    public SyncFamrsDataToServer() {
    }

    public SyncFamrsDataToServer(
           com.i1314i.ourproject.service.webservice.serviceUtil.SyncFamrsDataToServerDataXml dataXml) {
           this.dataXml = dataXml;
    }


    /**
     * Gets the dataXml value for this SyncFamrsDataToServer.
     * 
     * @return dataXml
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SyncFamrsDataToServerDataXml getDataXml() {
        return dataXml;
    }


    /**
     * Sets the dataXml value for this SyncFamrsDataToServer.
     * 
     * @param dataXml
     */
    public void setDataXml(com.i1314i.ourproject.service.webservice.serviceUtil.SyncFamrsDataToServerDataXml dataXml) {
        this.dataXml = dataXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncFamrsDataToServer)) return false;
        SyncFamrsDataToServer other = (SyncFamrsDataToServer) obj;
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
        new org.apache.axis.description.TypeDesc(SyncFamrsDataToServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncFamrsDataToServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DataXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SyncFamrsDataToServer>DataXml"));
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
