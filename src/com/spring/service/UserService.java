package com.spring.service;

import com.spring.dao.UserDAO;
import com.spring.dao.impl.UserDAOImpl;
import com.spring.model.User;

public class UserService {
	private UserDAO userDAO = new UserDAOImpl();
	public void add(User user){
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

}
