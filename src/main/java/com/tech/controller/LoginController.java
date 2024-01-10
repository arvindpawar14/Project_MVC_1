package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.LoginService;

@Controller
public class LoginController {
	public LoginController() {
		System.out.println("--Inside LoginController Constructor---");
	}

	@Autowired
	LoginService loginservice;
	
	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname") String uname, @RequestParam("pass") String pass) {
		System.out.println("inside LoginController.validate ");
		System.out.println(uname + "------" + pass);
		
	boolean result=	loginservice.validateuser(uname, pass);
	
	if(result) {
		System.out.println("---Success PAge---");
		ModelAndView mav=new ModelAndView("success");
		return mav;
		
	}
	else {
		System.out.println("--Failed----");
		ModelAndView mav=new ModelAndView("failure");
		return mav;
	}
	}

}
