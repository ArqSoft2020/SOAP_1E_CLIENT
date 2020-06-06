package com.u_learn.ws.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.tempuri.CoursePojo;

@Path("/courses")
public class RESTCourses {
	
	private CoursePojo[] cpList=null;
	
	public RESTCourses(CoursePojo[] cp) {
		this.cpList = cp.clone();
		
	}
	@GET
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCourseById(@PathParam("id") String id) {
		
		CoursePojo cp1 = null;
		SOAPCliente soapcl= new SOAPCliente(id);
		
		
		return Response.ok(cpList).build();
	}
	


}
