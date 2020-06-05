/**
 * CoursePojo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CoursePojo  implements java.io.Serializable {
    private java.lang.String calificacion;

    private java.lang.String categoria;

    private java.lang.String duracion;

    private java.lang.Integer idCurso;

    private java.lang.Integer idProfesor;

    private java.lang.String nombre;

    public CoursePojo() {
    }

    public CoursePojo(
           java.lang.String calificacion,
           java.lang.String categoria,
           java.lang.String duracion,
           java.lang.Integer idCurso,
           java.lang.Integer idProfesor,
           java.lang.String nombre) {
           this.calificacion = calificacion;
           this.categoria = categoria;
           this.duracion = duracion;
           this.idCurso = idCurso;
           this.idProfesor = idProfesor;
           this.nombre = nombre;
    }


    /**
     * Gets the calificacion value for this CoursePojo.
     * 
     * @return calificacion
     */
    public java.lang.String getCalificacion() {
        return calificacion;
    }


    /**
     * Sets the calificacion value for this CoursePojo.
     * 
     * @param calificacion
     */
    public void setCalificacion(java.lang.String calificacion) {
        this.calificacion = calificacion;
    }


    /**
     * Gets the categoria value for this CoursePojo.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this CoursePojo.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the duracion value for this CoursePojo.
     * 
     * @return duracion
     */
    public java.lang.String getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this CoursePojo.
     * 
     * @param duracion
     */
    public void setDuracion(java.lang.String duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the idCurso value for this CoursePojo.
     * 
     * @return idCurso
     */
    public java.lang.Integer getIdCurso() {
        return idCurso;
    }


    /**
     * Sets the idCurso value for this CoursePojo.
     * 
     * @param idCurso
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
    }


    /**
     * Gets the idProfesor value for this CoursePojo.
     * 
     * @return idProfesor
     */
    public java.lang.Integer getIdProfesor() {
        return idProfesor;
    }


    /**
     * Sets the idProfesor value for this CoursePojo.
     * 
     * @param idProfesor
     */
    public void setIdProfesor(java.lang.Integer idProfesor) {
        this.idProfesor = idProfesor;
    }


    /**
     * Gets the nombre value for this CoursePojo.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this CoursePojo.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoursePojo)) return false;
        CoursePojo other = (CoursePojo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calificacion==null && other.getCalificacion()==null) || 
             (this.calificacion!=null &&
              this.calificacion.equals(other.getCalificacion()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.duracion==null && other.getDuracion()==null) || 
             (this.duracion!=null &&
              this.duracion.equals(other.getDuracion()))) &&
            ((this.idCurso==null && other.getIdCurso()==null) || 
             (this.idCurso!=null &&
              this.idCurso.equals(other.getIdCurso()))) &&
            ((this.idProfesor==null && other.getIdProfesor()==null) || 
             (this.idProfesor!=null &&
              this.idProfesor.equals(other.getIdProfesor()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getCalificacion() != null) {
            _hashCode += getCalificacion().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getDuracion() != null) {
            _hashCode += getDuracion().hashCode();
        }
        if (getIdCurso() != null) {
            _hashCode += getIdCurso().hashCode();
        }
        if (getIdProfesor() != null) {
            _hashCode += getIdProfesor().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoursePojo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "coursePojo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "calificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "duracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCurso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "idCurso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProfesor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "idProfesor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "nombre"));
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
