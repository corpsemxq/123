package com.spring.dao.impl;

import com.spring.model.User;

public class UserDAOImpl2 extends UserDAOImpl {
	@Override
	public void save(User u){
		System.out.println("save start...11111111111");
		super.save(u);
	}


}
