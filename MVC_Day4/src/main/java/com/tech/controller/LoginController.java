package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginservice;

	public LoginController() {
		System.out.println("------LoginController Constructor----");
	}

	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname") String username, @RequestParam("pass") String password) {
		boolean user = loginservice.validate(username, password);
		System.out.println("response from service --->" +user);
		if(user) {
			ModelAndView mav=new ModelAndView("success");
			return mav;
		}
		else {
			ModelAndView mav=new ModelAndView("fail");
			return mav;
		}
		
	}

}
