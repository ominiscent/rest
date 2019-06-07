package com.restsvc.rest.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restsvc.rest.model.User;
import com.restsvc.rest.service.Service;
import com.restsvc.rest.service.UserService;

@Path(value = "/user")
public class control {
	
	@POST
	@Path(value = "/add")
	public String insert(@FormParam("fname") String fname, @FormParam("lname") String lname ) {
		
		UserService svc=new Service();
		User user = new User(fname,lname);
		svc.createUser(user);
		return "Success <a href='/all'>Show All</a>";
	}
	
	@GET
	@Path(value = "/all")
	@Produces(MediaType.TEXT_XML)
	public List<User> FetchAll(){
		UserService svc=new Service();
		List<User> plist=svc.getAll();
		return plist;
	}
	
}
