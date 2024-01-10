package com.tech.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.UserDetails;

@Repository
public class LoginDao{
	@Autowired
	SessionFactory sessionfactory;

	public LoginDao() {
		System.out.println(" Inside LoginDao const");
	}

	public boolean validateUser(String uname, String password) {
		Session session = sessionfactory.openSession();
		Criteria cr = session.createCriteria(UserDetails.class);
		Criterion cr1 = Restrictions.eq("username", uname);
		Criterion cr2 = Restrictions.eq("password", password);

		cr.add(cr1);
		cr.add(cr2);

		UserDetails lp = (UserDetails) cr.uniqueResult();
		if (lp == null) {
			System.out.println("user not present------------");

			return false;
		} else {
			System.out.println("user  present-------------");
			return true;
		}

	}
}
