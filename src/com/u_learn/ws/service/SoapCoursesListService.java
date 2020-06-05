/**
 * SoapCoursesListService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.u_learn.ws.service;

public interface SoapCoursesListService extends javax.xml.rpc.Service {
    public java.lang.String getCoursesListAddress();

    public com.u_learn.ws.service.CoursesList getCoursesList() throws javax.xml.rpc.ServiceException;

    public com.u_learn.ws.service.CoursesList getCoursesList(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
