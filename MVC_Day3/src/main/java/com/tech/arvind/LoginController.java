package com.tech.arvind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	public LoginController() {
		System.out.println("Inside Login Controller");
	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("uname") String username, @RequestParam("pass") String password) {
		System.out.println("Inside Login Method");
		System.out.println(username + "    " + password);
		if (username.equals("admin") && password.equals("admin123")) {
			ModelAndView mav = new ModelAndView("success");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("fail");
			return mav;
		}
	}
}
