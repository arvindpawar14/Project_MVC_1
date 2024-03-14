package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.cto.Student;
import com.tech.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;

	public StudentController() {
		System.out.println("---Inside StudentController Constructor----");
	}

	@RequestMapping("/create")
	public ModelAndView StudentDetails(@RequestParam("fname") String fname, @RequestParam("mname") String mname,
			@RequestParam("lname") String lname, @RequestParam("email") String email,
			@RequestParam("phone") String phone) {
		System.out.println("inside StudentDBController.getAll2 ");

		System.out.println(fname + "  " + mname + "  " + lname + "  " + email + "  " + phone);
		Student s1 = new Student();
		s1.setFname(fname);
		s1.setMname(mname);
		s1.setLname(lname);
		s1.setEmail(email);
		s1.setPhone(phone);

		ModelAndView view = new ModelAndView("createpage");
		view.addObject("STD_LIST", s1);
		return view;

	}

	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		System.out.println("inside GetAll Method in Student Controller");
		List<Student> stdlist = studentservice.StdList();
		System.out.println("response from service ");
		System.out.println(stdlist);
		ModelAndView mav = new ModelAndView("get-all-student");
		mav.addObject("STD_LIST", stdlist);
		return mav;
	}
}
