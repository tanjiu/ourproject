/**
 * SaveIntelligent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public class SaveIntelligent  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String infoTypeID;

    private java.lang.String ID;

    private java.lang.String sendMan;

    private java.lang.String content;

    public SaveIntelligent() {
    }

    public SaveIntelligent(
           java.lang.String code,
           java.lang.String infoTypeID,
           java.lang.String ID,
           java.lang.String sendMan,
           java.lang.String content) {
           this.code = code;
           this.infoTypeID = infoTypeID;
           this.ID = ID;
           this.sendMan = sendMan;
           this.content = content;
    }


    /**
     * Gets the code value for this SaveIntelligent.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this SaveIntelligent.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the infoTypeID value for this SaveIntelligent.
     * 
     * @return infoTypeID
     */
    public java.lang.String getInfoTypeID() {
        return infoTypeID;
    }


    /**
     * Sets the infoTypeID value for this SaveIntelligent.
     * 
     * @param infoTypeID
     */
    public void setInfoTypeID(java.lang.String infoTypeID) {
        this.infoTypeID = infoTypeID;
    }


    /**
     * Gets the ID value for this SaveIntelligent.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this SaveIntelligent.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the sendMan value for this SaveIntelligent.
     * 
     * @return sendMan
     */
    public java.lang.String getSendMan() {
        return sendMan;
    }


    /**
     * Sets the sendMan value for this SaveIntelligent.
     * 
     * @param sendMan
     */
    public void setSendMan(java.lang.String sendMan) {
        this.sendMan = sendMan;
    }


    /**
     * Gets the content value for this SaveIntelligent.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this SaveIntelligent.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveIntelligent)) return false;
        SaveIntelligent other = (SaveIntelligent) obj;
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
            ((this.infoTypeID==null && other.getInfoTypeID()==null) || 
             (this.infoTypeID!=null &&
              this.infoTypeID.equals(other.getInfoTypeID()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.sendMan==null && other.getSendMan()==null) || 
             (this.sendMan!=null &&
              this.sendMan.equals(other.getSendMan()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent())));
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
        if (getInfoTypeID() != null) {
            _hashCode += getInfoTypeID().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getSendMan() != null) {
            _hashCode += getSendMan().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveIntelligent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SaveIntelligent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InfoTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendMan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendMan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Content"));
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
