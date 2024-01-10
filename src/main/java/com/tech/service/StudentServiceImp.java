package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.StudentDaoImp;
import com.tech.dto.Student;

@Service
public class StudentServiceImp {
	@Autowired
	StudentDaoImp studentdao;

	public StudentServiceImp() {
		System.out.println("Inside StudentServiceImp Construcror");
	}
	
	public Student createStudent(Student student) {
		System.out.println("---inside StudentServiceImpl.createStudent--- ");
		
		Student studentresponse=studentdao.createData(student);
		System.out.println("---response from  studentDao.createStudent -" + studentresponse);
		
		return studentresponse; 
	}
	public List<Student> getAll(){
		System.out.println("---inside StudentServiceImpl.getAll--- ");
		List<Student> list=studentdao.getAll();
		System.out.println("---response from  studentDao.getAll -" + list);
		return list;
	}
	
	public List<Student> deleteStudent(int id){
		System.out.println("---inside StudentServiceImpl.getAll--- ");
		studentdao.deleteStudent(id);
		return studentdao.getAll();
				
	}
	public Student editStudent(int id) {
		System.out.println("---inside StudentServiceImpl.editStudentForId--- ");
		Student student=studentdao.getStudent(id);
		System.out.println("---response from  studentDao.getStudentForId -" + student);
		return student;
	}
	
	public List<Student> UpdateStudent(Student student){
		System.out.println("---inside StudentServiceImpl.updateStudent--- ");
		studentdao.UpdateStudent(student);
		return studentdao.getAll();
		
				
	}

}
