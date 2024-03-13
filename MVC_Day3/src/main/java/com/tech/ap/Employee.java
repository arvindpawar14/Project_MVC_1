package com.tech.ap;

public class Employee {
	private String fname;
	private String mname;
	private String lname;
	private String email;
	private String phone;
	public Employee() {
		System.out.println("Inside Default Constructor");
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Employee(String fname, String mname, String lname, String email, String phone) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
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
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	
}
