/**
 * Save2005FarmSampling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class Save2005FarmSampling  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String farmID;

    private com.i1314i.ourproject.service.webservice.serviceUtil.Save2005FarmSamplingTaskDataSet taskDataSet;

    public Save2005FarmSampling() {
    }

    public Save2005FarmSampling(
           java.lang.String code,
           java.lang.String farmID,
           com.i1314i.ourproject.service.webservice.serviceUtil.Save2005FarmSamplingTaskDataSet taskDataSet) {
           this.code = code;
           this.farmID = farmID;
           this.taskDataSet = taskDataSet;
    }


    /**
     * Gets the code value for this Save2005FarmSampling.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this Save2005FarmSampling.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the farmID value for this Save2005FarmSampling.
     * 
     * @return farmID
     */
    public java.lang.String getFarmID() {
        return farmID;
    }


    /**
     * Sets the farmID value for this Save2005FarmSampling.
     * 
     * @param farmID
     */
    public void setFarmID(java.lang.String farmID) {
        this.farmID = farmID;
    }


    /**
     * Gets the taskDataSet value for this Save2005FarmSampling.
     * 
     * @return taskDataSet
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.Save2005FarmSamplingTaskDataSet getTaskDataSet() {
        return taskDataSet;
    }


    /**
     * Sets the taskDataSet value for this Save2005FarmSampling.
     * 
     * @param taskDataSet
     */
    public void setTaskDataSet(com.i1314i.ourproject.service.webservice.serviceUtil.Save2005FarmSamplingTaskDataSet taskDataSet) {
        this.taskDataSet = taskDataSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Save2005FarmSampling)) return false;
        Save2005FarmSampling other = (Save2005FarmSampling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.farmID==null && other.getFarmID()==null) || 
             (this.farmID!=null &&
              this.farmID.equals(other.getFarmID()))) &&
            ((this.taskDataSet==null && other.getTaskDataSet()==null) || 
             (this.taskDataSet!=null &&
              this.taskDataSet.equals(other.getTaskDataSet())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getFarmID() != null) {
            _hashCode += getFarmID().hashCode();
        }
        if (getTaskDataSet() != null) {
            _hashCode += getTaskDataSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Save2005FarmSampling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Save2005FarmSampling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "code"));
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
        elemField.setFieldName("taskDataSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TaskDataSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Save2005FarmSampling>TaskDataSet"));
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
