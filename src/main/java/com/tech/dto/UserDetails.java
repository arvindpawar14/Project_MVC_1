package com.tech.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails {
	@Id
	@Column
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Override
	public String toString() {
		return "LoginPage [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
