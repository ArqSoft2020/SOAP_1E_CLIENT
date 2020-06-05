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

public class SOAPCliente {
	
	public static void main(String[] args) {
		
		SoapCoursesListService locator = new SoapCoursesListService() {
			
			@Override
			public URL getWSDLDocumentLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public TypeMappingRegistry getTypeMappingRegistry() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public QName getServiceName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterator getPorts() throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Remote getPort(QName arg0, Class arg1) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Remote getPort(Class arg0) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HandlerRegistry getHandlerRegistry() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Call[] getCalls(QName arg0) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Call createCall(QName arg0, String arg1) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Call createCall(QName arg0, QName arg1) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Call createCall(QName arg0) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Call createCall() throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCoursesListAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CoursesList getCoursesList(URL portAddress) throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CoursesList getCoursesList() throws ServiceException {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	

}
