/**
 * SynPassPortUserGroupUsers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SynPassPortUserGroupUsers  implements java.io.Serializable {
    private com.i1314i.ourproject.service.webservice.serviceUtil.SynPassPortUserGroupUsersXmlDatas xmlDatas;

    public SynPassPortUserGroupUsers() {
    }

    public SynPassPortUserGroupUsers(
           com.i1314i.ourproject.service.webservice.serviceUtil.SynPassPortUserGroupUsersXmlDatas xmlDatas) {
           this.xmlDatas = xmlDatas;
    }


    /**
     * Gets the xmlDatas value for this SynPassPortUserGroupUsers.
     * 
     * @return xmlDatas
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.SynPassPortUserGroupUsersXmlDatas getXmlDatas() {
        return xmlDatas;
    }


    /**
     * Sets the xmlDatas value for this SynPassPortUserGroupUsers.
     * 
     * @param xmlDatas
     */
    public void setXmlDatas(com.i1314i.ourproject.service.webservice.serviceUtil.SynPassPortUserGroupUsersXmlDatas xmlDatas) {
        this.xmlDatas = xmlDatas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynPassPortUserGroupUsers)) return false;
        SynPassPortUserGroupUsers other = (SynPassPortUserGroupUsers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xmlDatas==null && other.getXmlDatas()==null) || 
             (this.xmlDatas!=null &&
              this.xmlDatas.equals(other.getXmlDatas())));
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
        if (getXmlDatas() != null) {
            _hashCode += getXmlDatas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynPassPortUserGroupUsers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SynPassPortUserGroupUsers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlDatas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "XmlDatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SynPassPortUserGroupUsers>XmlDatas"));
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
