package com.lsy.springMVC.vo;

import java.sql.Date;

public class MemberVO {

	private String id;
	private String email;
	private String name;
	private String password;
	private String mobile;
	private Date regDate;

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name +", email= " + email + ", regDate=" + regDate;
	}
}