package com.restsvc.rest.service;

import java.util.List;

import com.restsvc.rest.dao.UserDao;
import com.restsvc.rest.dao.UserDaoImpl;
import com.restsvc.rest.model.User;

public class Service implements UserService{

	@Override
	public int createUser(User user) {
		UserDao dao=new UserDaoImpl();
		
		return dao.insertUser(user);
	}

	@Override
	public List<User> getAll() {
		UserDao dao=new UserDaoImpl();
		
		return dao.getAll();
	}

}
