/**
 * Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jan 15, 2016 (09:43:21 UTC) WSDL2Java emitter.
 */
package CrearAlumno_pkg;

public class Input  implements java.io.Serializable {
    private java.lang.String FLastName;

    private java.lang.String SLastName;

    private java.lang.String name;

    private int telephone;

    private java.lang.String email;

    private java.lang.String delegation;

    private java.lang.String passw;

    private java.lang.String direction;

    public Input() {
    }

    public Input(
           java.lang.String FLastName,
           java.lang.String SLastName,
           java.lang.String name,
           int telephone,
           java.lang.String email,
           java.lang.String delegation,
           java.lang.String passw,
           java.lang.String direction) {
           this.FLastName = FLastName;
           this.SLastName = SLastName;
           this.name = name;
           this.telephone = telephone;
           this.email = email;
           this.delegation = delegation;
           this.passw = passw;
           this.direction = direction;
    }


    /**
     * Gets the FLastName value for this Input.
     *
     * @return FLastName
     */
    public java.lang.String getFLastName() {
        return FLastName;
    }


    /**
     * Sets the FLastName value for this Input.
     *
     * @param FLastName
     */
    public void setFLastName(java.lang.String FLastName) {
        this.FLastName = FLastName;
    }


    /**
     * Gets the SLastName value for this Input.
     *
     * @return SLastName
     */
    public java.lang.String getSLastName() {
        return SLastName;
    }


    /**
     * Sets the SLastName value for this Input.
     *
     * @param SLastName
     */
    public void setSLastName(java.lang.String SLastName) {
        this.SLastName = SLastName;
    }


    /**
     * Gets the name value for this Input.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Input.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the telephone value for this Input.
     *
     * @return telephone
     */
    public int getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this Input.
     *
     * @param telephone
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the email value for this Input.
     *
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Input.
     *
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the delegation value for this Input.
     *
     * @return delegation
     */
    public java.lang.String getDelegation() {
        return delegation;
    }


    /**
     * Sets the delegation value for this Input.
     *
     * @param delegation
     */
    public void setDelegation(java.lang.String delegation) {
        this.delegation = delegation;
    }


    /**
     * Gets the passw value for this Input.
     *
     * @return passw
     */
    public java.lang.String getPassw() {
        return passw;
    }


    /**
     * Sets the passw value for this Input.
     *
     * @param passw
     */
    public void setPassw(java.lang.String passw) {
        this.passw = passw;
    }


    /**
     * Gets the direction value for this Input.
     *
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this Input.
     *
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Input)) return false;
        Input other = (Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.FLastName==null && other.getFLastName()==null) ||
             (this.FLastName!=null &&
              this.FLastName.equals(other.getFLastName()))) &&
            ((this.SLastName==null && other.getSLastName()==null) ||
             (this.SLastName!=null &&
              this.SLastName.equals(other.getSLastName()))) &&
            ((this.name==null && other.getName()==null) ||
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.telephone == other.getTelephone() &&
            ((this.email==null && other.getEmail()==null) ||
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.delegation==null && other.getDelegation()==null) ||
             (this.delegation!=null &&
              this.delegation.equals(other.getDelegation()))) &&
            ((this.passw==null && other.getPassw()==null) ||
             (this.passw!=null &&
              this.passw.equals(other.getPassw()))) &&
            ((this.direction==null && other.getDirection()==null) ||
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getFLastName() != null) {
            _hashCode += getFLastName().hashCode();
        }
        if (getSLastName() != null) {
            _hashCode += getSLastName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getTelephone();
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDelegation() != null) {
            _hashCode += getDelegation().hashCode();
        }
        if (getPassw() != null) {
            _hashCode += getPassw().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:CrearAlumno", "Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Delegation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
