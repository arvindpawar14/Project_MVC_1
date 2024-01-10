package com.tech.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.Student;

@Repository
public class StudentDaoImp {
	@Autowired
	SessionFactory sessionfactory;

	public StudentDaoImp() {
		System.out.println("--Inside StudentDaoImp Constructor---");
	}

	public Student createData(Student s) {
		System.out.println("Inside Create Student Dao Method Data");
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();
		int recordInserted = (int) session.save(s);
		txn.commit();
		System.out.println("records inserted successfully-->" + recordInserted);

		if (recordInserted > 0) {
			return s;
		} else {
			Student s1 = new Student();
			s1.setId(0);
			s1.setFname(null);
			s1.setMname(null);
			s1.setLname(null);
			s1.setEmail(null);
			s1.setPhone(null);
			return s1;
		}

	}

	public List<Student> getAll() {
		System.out.println("---inside StudentDaoImpl.getAll--- ");
		Session session = sessionfactory.openSession();
		Criteria cr = session.createCriteria(Student.class);
		List<Student> studentlist = cr.list();
		System.out.println("---studentList from DB----" + studentlist);
		return studentlist;

	}

	public void deleteStudent(int id) {
		System.out.println("---inside StudentDaoImpl.deleteStudent--- ");
		Session session = sessionfactory.openSession();
		Student student = new Student();
		student.setId(id);
		session.delete(student);
		session.beginTransaction().commit();

	}

	public Student getStudent(int id) {
		System.out.println("---inside StudentDaoImpl.getStudentForId--- ");
		Session session = sessionfactory.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		Criterion cr1 = Restrictions.eq("id", id);
		criteria.add(cr1);

		Student stdlist = (Student) criteria.uniqueResult();
		System.out.println("---student from DB----" + stdlist);

		return stdlist;

	}

	public void UpdateStudent(Student student) {
		System.out.println("---inside StudentDaoImpl.updateStudent--- ");
		System.out.println("input student data for update is -->" + student);
		Session session = sessionfactory.openSession();
		session.update(student);
		session.beginTransaction().commit();

	}

}
