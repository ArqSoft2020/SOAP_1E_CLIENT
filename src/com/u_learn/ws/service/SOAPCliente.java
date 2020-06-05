package com.u_learn.ws.service;

import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import org.tempuri.CoursePojo;

public class SOAPCliente {
	
	public static void main(String[] args) {
		
		SoapCoursesListServiceLocator locator = new SoapCoursesListServiceLocator();
		
		try {
			CoursesList servicioCursos = locator.getCoursesList();
			String id="3";
			CoursePojo[] cPojo= servicioCursos.getCourseInformation(id);
			System.out.println("Respuesta: \nDirecc. Usuario:"+ cPojo[0].getNombre());
			
		}catch(ServiceException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
	}
	

}
