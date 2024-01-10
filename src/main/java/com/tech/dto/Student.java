package com.tech.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentData")
public class Student {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String fname;
	@Column
	private String mname;
	@Column
	private String lname;

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column
	private String email;
	@Column
	private String phone;

}
