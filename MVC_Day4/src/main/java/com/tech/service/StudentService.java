package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.cto.Student;
import com.tech.dao.StudentDao;

@Service
public class StudentService {
	@Autowired
	StudentDao studentdao;

	public StudentService() {
		System.out.println("----inside StudentService Constructor----");
	}

	public List<Student> StdList() {
		System.out.println("---Inside Student Service List----");
		List<Student> list = studentdao.getAllStudent();
		return list;
	}
}
