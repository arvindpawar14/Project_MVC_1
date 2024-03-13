package com.tech.arvind;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ap.Employee;

@Controller
public class EmployeeController {
	public EmployeeController() {
		System.out.println("Inside EmployeeController Constructor");
	}
	@RequestMapping("/createdata")
	public ModelAndView GetDeta(@RequestParam("fname") String fname, @RequestParam("mname") String mname,
			@RequestParam("lname") String lname, @RequestParam("email") String email,
			@RequestParam("phone") String phone) {
		ModelAndView view = new ModelAndView("createpage");
		System.out.println("inside createStudent ");
		Employee e1=new Employee();
		e1.setFname(fname);
		e1.setMname(mname);
		e1.setLname(lname);
		e1.setEmail(email);
		e1.setPhone(phone);
		view.addObject("EMPLOYEE_DATA", e1);	
		return view;
	}
	@RequestMapping("/getAll")
	public ModelAndView GetAllEmployee() {
		List<Employee> emp=new ArrayList<>();
		Employee e1=new Employee("Arvind", "Parmeshwar", "Pawar", "arvind@gamil.com", "7767909704");
		Employee e2=new Employee("Sachin", "Sudhakar", "Pawar", "sachin@gamil.com", "9087898909");
		Employee e3=new Employee("Pravin", "Parmeshwar", "Pawar", "pravin@gamil.com", "8625818345");
		Employee e4=new Employee("Vilas", "Nagorao", "Pawar", "vilas@gamil.com", "6789090909");
		Employee e5=new Employee("Kailash", "Nagorao", "Pawar", "kailash@gamil.com", "8987898789");
		Employee e6=new Employee("Snehal", "Sudhir", "Raute", "snehal@gamil.com", "6789452314");
		Employee e7=new Employee("Aryan", "Madhukar", "Pawar", "aryan@gamil.com", "9023127656");
		Employee e8=new Employee("Dnyaneshwar", "Ravindra", "Rathod", "dnyanesjwar@gamil.com", "8945343534");
		Employee e9=new Employee("Dashrath", "Ganesh", "Rathod", "dashrath@gamil.com", "7767697997");
		Employee e10=new Employee("Dayanand", "Suresh", "Rathod", "dayanand@gamil.com", "8625242524");
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		emp.add(e10);	
		ModelAndView mav = new ModelAndView("get_All_Employee");
		mav.addObject("GET_ALL", emp);
		return mav;
		
		
	}
}
