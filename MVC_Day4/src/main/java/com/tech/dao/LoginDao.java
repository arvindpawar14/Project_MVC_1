package com.tech.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	public LoginDao() {
		System.out.println("Inside LoginDao Constructor");
	}
	public boolean validate(String uname, String pass) {
		if(uname.equals("admin") && pass.equals("admin123")) {
			System.out.println("----user Validate---");
			return true;
		}
		else {
			System.out.println("----user Is Validate---");
			return false;
		}
	}
}
