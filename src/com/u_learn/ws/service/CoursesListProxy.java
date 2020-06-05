package com.u_learn.ws.service;

public class CoursesListProxy implements com.u_learn.ws.service.CoursesList {
  private String _endpoint = null;
  private com.u_learn.ws.service.CoursesList coursesList = null;
  
  public CoursesListProxy() {
    _initCoursesListProxy();
  }
  
  public CoursesListProxy(String endpoint) {
    _endpoint = endpoint;
    _initCoursesListProxy();
  }
  
  private void _initCoursesListProxy() {
    try {
      coursesList = (new com.u_learn.ws.service.SoapCoursesListServiceLocator()).getCoursesList();
      if (coursesList != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)coursesList)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)coursesList)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (coursesList != null)
      ((javax.xml.rpc.Stub)coursesList)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.u_learn.ws.service.CoursesList getCoursesList() {
    if (coursesList == null)
      _initCoursesListProxy();
    return coursesList;
  }
  
  public org.tempuri.CoursePojo[] getCourseInformation(java.lang.String teacherId) throws java.rmi.RemoteException{
    if (coursesList == null)
      _initCoursesListProxy();
    return coursesList.getCourseInformation(teacherId);
  }
  
  
}