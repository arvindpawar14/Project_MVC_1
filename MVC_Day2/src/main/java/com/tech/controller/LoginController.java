package com.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	public LoginController() {
		System.out.println("------Inside LoginController Constructor-----");
	}

	/*
	 * @RequestMapping("/Login") public ModelAndView getName() {
	 * System.out.println("---Inside GetName Method----"); ModelAndView view=new
	 * ModelAndView("success"); return view; }
	 * 
	 * @RequestMapping("/create") public ModelAndView create() {
	 * System.out.println("-----Inside Create Method----"); ModelAndView create=new
	 * ModelAndView("createpage"); return create;
	 * 
	 * }
	 */

	@RequestMapping("/Login")
	public ModelAndView getName(@RequestParam("uname") String username,@RequestParam("pass") String password) {
		System.out.println("---Inside GetName Method----");

		if(username.equals("admin") && password.equals("admin123")) {
			System.out.println(username+"---------"+password);
			ModelAndView view = new ModelAndView("success");
			return view;
		}
		else {
			System.out.println("----Inside Failure Page---");
			ModelAndView view = new ModelAndView("fail");
			return view;
		}
		
	}

	
}
