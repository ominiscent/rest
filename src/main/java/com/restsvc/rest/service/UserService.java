package com.restsvc.rest.service;

import java.util.List;

import com.restsvc.rest.model.User;

public interface UserService {

	public int createUser(User user);
	
	public List<User> getAll();
}
