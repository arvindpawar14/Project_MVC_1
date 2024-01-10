package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.Student;
import com.tech.service.StudentServiceImp;

@Controller
public class StudentController {
	@Autowired
	StudentServiceImp studentservice;

	public StudentController() {
		System.out.println("--Inside StudentController Constructor--");
	}

	@RequestMapping("/create")
	public ModelAndView createStudent(@RequestParam("fname") String fname, @RequestParam("mname") String mname,
			@RequestParam("lname") String lname, @RequestParam("email") String email,
			@RequestParam("phone") String phone) {
		System.out.println("input firstname is " + fname);
		System.out.println("input Middle is " + mname);
		System.out.println("input lastname is " + lname);
		System.out.println("input email is " + email);
		System.out.println("input phone is " + phone);

		Student student = new Student();
		student.setFname(fname);
		student.setMname(mname);
		student.setLname(lname);
		student.setEmail(email);
		student.setPhone(phone);

		Student studentResponse = studentservice.createStudent(student);
		if (studentResponse != null && studentResponse.getId() > 0) {
			ModelAndView mav = new ModelAndView("create-success");
			mav.addObject("F_NAME", studentResponse.getFname());
			mav.addObject("M_NAME", studentResponse.getMname());
			mav.addObject("L_NAME", studentResponse.getLname());
			mav.addObject("EMAIL", studentResponse.getEmail());
			mav.addObject("PHONE", studentResponse.getPhone());
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("create-success-failure");
			mav.addObject("F_NAME", studentResponse.getFname());
			mav.addObject("M_NAME", studentResponse.getMname());
			mav.addObject("L_NAME", studentResponse.getLname());
			mav.addObject("EMAIL", studentResponse.getEmail());
			mav.addObject("PHONE", studentResponse.getPhone());
			return mav;

		}

	}

	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		System.out.println("inside StudentController.getAllStudent");
		List<Student> stdList = studentservice.getAll();
		ModelAndView mav = new ModelAndView("get-all-student");
		mav.addObject("STD_LIST", stdList);
		return mav;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam("id") int id) {
		System.out.println("inside StudentController.deleteStudent");
		System.out.println("delete student for id --" + id);
		List<Student> studentResposeDelete = studentservice.deleteStudent(id);
		ModelAndView mav = new ModelAndView("get-all-student");
		mav.addObject("STD_LIST", studentResposeDelete);
		return mav;

	}

	@RequestMapping("/edit-student")
	public ModelAndView editStudent(@RequestParam("id1") int id1, @RequestParam("fname1") String fname1,
			@RequestParam("mname1") String mname1, @RequestParam("lname1") String lname1,
			@RequestParam("email1") String email1, @RequestParam("phone1") String phone1) {
		System.out.println("inside StudentController.editStudent1");
		System.out.println("input id is " + id1);
		System.out.println("input firstname is " + fname1);
		System.out.println("input firstname is " + mname1);
		System.out.println("input lastname is " + lname1);
		System.out.println("input email is " + email1);
		System.out.println("input phone is " + phone1);
		
		Student s=new Student();
		s.setId(id1);
		s.setFname(fname1);
		s.setMname(mname1);
		s.setLname(lname1);
		s.setEmail(email1);
		s.setPhone(phone1);
		
		List<Student> studentList=studentservice.UpdateStudent(s);
		ModelAndView mav = new ModelAndView("get-all-student");
		mav.addObject("STD_LIST", studentList);
		return mav;
			
	}
	@RequestMapping("/edit")
	public ModelAndView editStudent(@RequestParam("id") int  id) {
		System.out.println("inside StudentController.editStudent");
		System.out.println("editStudent student for id --" +id);
		Student studentResponse=studentservice.editStudent(id);
		ModelAndView mav = new ModelAndView("edit-student");
		mav.addObject("Student_Edit", studentResponse);
		return mav;
	}	


}
