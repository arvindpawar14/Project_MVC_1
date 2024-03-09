package com.tech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.cto.Student;

@Controller
public class StudentController {
	public StudentController() {
		System.out.println("inside StudentController Constructor ");
	}

	@RequestMapping("/create")
	public ModelAndView create(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("email") String email, @RequestParam("phone") String phone) {
		System.out.println("-----Inside Create Method----");
	//	System.out.println(fname + "------" + lname + "------" + email + "-----" + phone);
		
		Student s1=new Student();
		s1.setFname(fname);
		s1.setLname(lname);
		s1.setEmail(email);
		s1.setPhone(phone);
		
		
		
//		create.addObject("FNAME", fname);
//		create.addObject("LNAME", lname);
//		create.addObject("EMAIL", email);
//		create.addObject("MOBILE", phone);
		ModelAndView create = new ModelAndView("createpage");
		
		create.addObject("GET_ALL_DATA", s1);
		return create;
	}
	@RequestMapping("/getAll")
	public ModelAndView viewData() {
		List<Student> std =new ArrayList<>();
		Student s1=new Student("Arvind", "Pawar", "arvind@gmail.com", "7767909704");
		Student s2=new Student("Sachin", "Pawar", "sachin@gmail.com", "8625818345");
		Student s3=new Student("Pravin", "Pawar", "pravin@gmail.com", "7030204510");
		Student s4=new Student("Dnyaneshwar", "Rathod", "dnyaneshwar@gmail.com", "9657518940");
		Student s5=new Student("Abarao", "Chavhan", "abarao@gmail.com", "8987898799");
		
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		
		ModelAndView view = new ModelAndView("GET_ALL_STUDENT");
		view.addObject("GET_ALL", std);
		return view;
	}
}
