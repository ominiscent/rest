package com.restsvc.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.restsvc.rest.model.User;

public class UserDaoImpl implements UserDao {

	

	@Override
	public List<User> getAll() {
		
		List<User> user=new ArrayList<User>();
		user.add(new User("Mayur","Desale"));
		user.add(new User("Shubham","Lokhande"));
		user.add(new User("Om","Kolte"));
		user.add(new User("Vinay","Hinukale"));
		
		
		return user;
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
