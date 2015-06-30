package com.spring.service;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.LogInterceptor;
import com.spring.dao.UserDAO;
import com.spring.dao.impl.UserDAOImpl;
import com.spring.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		//System.out.println("sb");
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext();
 		//UserDAO userDAO = (UserDAO)factory.getBean("u");
		//service.setUserDAO(userDAO);
		User u =new User();
		u.setUsername("123");
		u.setPassword("321");
		/*Object service;
		service.add(u);*/
	}
	
	@Test
	public void testProxy(){
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		UserDAO userDAOProxy =(UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), new Class[]{UserDAO.class} , li);
		userDAOProxy.delete();
		userDAOProxy.save(new User());
		
	}

}
