package com.in28minutes.rest.webservices.resdtfulwebservices.user;

import java.util.Date;

public class User {

	private Integer id;
	
	private String name;
	
	private Date dateofBirth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public User(Integer id, String name, Date dateofBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofBirth = dateofBirth;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dateofBirth=" + dateofBirth + "]";
	}
	
	
	
}
