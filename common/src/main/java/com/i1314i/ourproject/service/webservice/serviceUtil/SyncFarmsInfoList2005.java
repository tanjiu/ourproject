/**
 * SyncFarmsInfoList2005.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SyncFarmsInfoList2005  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.SyncFarmsInfoList2005FarmsXMl farmsXMl;

    public SyncFarmsInfoList2005() {
    }

    public SyncFarmsInfoList2005(
           com.i1314i.ourproject.service.webservice.serviceUtil.SyncFarmsInfoList2005FarmsXMl farmsXMl) {
           this.farmsXMl = farmsXMl;
    }


    /**
     * Gets the farmsXMl value for this SyncFarmsInfoList2005.
     * 
     * @return farmsXMl
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SyncFarmsInfoList2005FarmsXMl getFarmsXMl() {
        return farmsXMl;
    }


    /**
     * Sets the farmsXMl value for this SyncFarmsInfoList2005.
     * 
     * @param farmsXMl
     */
    public void setFarmsXMl(com.i1314i.ourproject.service.webservice.serviceUtil.SyncFarmsInfoList2005FarmsXMl farmsXMl) {
        this.farmsXMl = farmsXMl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncFarmsInfoList2005)) return false;
        SyncFarmsInfoList2005 other = (SyncFarmsInfoList2005) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.farmsXMl==null && other.getFarmsXMl()==null) || 
             (this.farmsXMl!=null &&
              this.farmsXMl.equals(other.getFarmsXMl())));
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
        if (getFarmsXMl() != null) {
            _hashCode += getFarmsXMl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncFarmsInfoList2005.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SyncFarmsInfoList2005"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("farmsXMl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FarmsXMl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SyncFarmsInfoList2005>FarmsXMl"));
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
