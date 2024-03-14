package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.LoginDao;

@Service
public class LoginService {
	@Autowired
	LoginDao logindao;

	public LoginService() {
		System.out.println("--Inside LoginService Constructor---");
	}

	public boolean validate(String username, String password) {
		System.out.println("---- LoginService Validate User---");
		boolean userPresent = logindao.validate(username, password);
		return userPresent;

	}
}
