package com.restsvc.rest.dao;

import java.util.List;

import com.restsvc.rest.model.User;

public interface UserDao {

	public int insertUser(User user);
	
	public List<User> getAll();
	
}
