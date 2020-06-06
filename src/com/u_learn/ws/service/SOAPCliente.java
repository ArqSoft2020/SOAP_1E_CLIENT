package com.u_learn.ws.service;

import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import org.tempuri.CoursePojo;

public class SOAPCliente {
	
	public static String id ="";
	
	public SOAPCliente(String id) {
		this.id=id;
	}
	
	public static String getId() {
		return id;
	}


	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		SoapCoursesListServiceLocator locator = new SoapCoursesListServiceLocator();
		
		try {
			CoursesList servicioCursos = locator.getCoursesList();
			List<CoursePojo> listcp = null;
			CoursePojo[] arraycp = servicioCursos.getCourseInformation(id).clone();
			RESTCourses rCourses = new RESTCourses(arraycp);
	
						
		}catch(ServiceException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
	}
	

}
