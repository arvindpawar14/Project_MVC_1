package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.LoginDao;

@Service
public class LoginService {
	@Autowired
	LoginDao logindao;

	public LoginService() {
		System.out.println("--Inside LoginService Consructr--");
	}

	public boolean validateuser(String uname, String pass) {
		boolean valid = logindao.validateUser(uname, pass);
		return valid;

	}
}
