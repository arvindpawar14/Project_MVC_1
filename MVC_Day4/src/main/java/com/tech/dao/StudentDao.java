package com.tech.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tech.cto.Student;

@Repository
public class StudentDao {
	public StudentDao() {
		System.out.println("--Inside StudentDao Constructor-----");
	}
	public List<Student> getAllStudent() {
		System.out.println("inside StudentDao.getAllStudent()");
		List<Student> stdlist=new ArrayList<>();
		Student s1=new Student("Arvind", "Parmeshwar", "Pawar", "arvind@gmail.com", "7767909704");
		Student s2=new Student("Pravin", "Parmeshwar", "Pawar", "pravin@gmail.com", "9878989898");
		Student s3=new Student("Sachin", "Sudhakar", "Pawar", "sachin@gmail.com", "8967543434");
		Student s4=new Student("Aryan", "Madhukar", "Pawar", "aryan@gmail.com", "7654353435");
		Student s5=new Student("Sumit", "Narayan", "Fajge", "sumit@gmail.com", "7363437236");
		Student s6=new Student("Balaji", "Pundlik", "Rathod", "balaji@gmail.com", "3425272538");
		Student s7=new Student("Vasant", "Chandar", "Rathod", "vasant@gmail.com", "5656787978");
		
		stdlist.add(s1);
		stdlist.add(s2);
		stdlist.add(s3);
		stdlist.add(s4);
		stdlist.add(s5);
		stdlist.add(s6);
		stdlist.add(s7);
		
		return stdlist;
	}
}
