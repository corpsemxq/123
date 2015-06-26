package com.spring.dao.impl;

import com.spring.aop.LogInterceptor;
import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserDAOImpl3 implements UserDAO {
	
	private UserDAO userDAO= new UserDAOImpl();
	public void save(User u) {
		new LogInterceptor().beforeMethod();
		userDAO.save(u);

	}

}
