package com.spring.dao.impl;

import com.spring.dao.UserDAO;
import com.spring.model.User;

public class UserDAOImpl implements UserDAO{
	@Override
	public void save(User u){
		
		//System.out.println("save start...");
		System.out.println("a user saved");
	}
	
	public void delete(){
		System.out.println("deleted!");
	}

}
