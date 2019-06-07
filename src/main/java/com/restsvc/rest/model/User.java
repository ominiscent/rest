package com.restsvc.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
private String firstname;
private String lastname;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public User(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}
public User() {
	super();
}

	
}
