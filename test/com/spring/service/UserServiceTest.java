package com.spring.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.spring.*;
import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		//System.out.println("sb");
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext();
		UserService service = (UserService)factory.getBean("userService");
		//UserDAO userDAO = (UserDAO)factory.getBean("u");
		//service.setUserDAO(userDAO);
		User u =new User();
		service.add(u);
	}

}
