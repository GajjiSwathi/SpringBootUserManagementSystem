package com.springboot.controller.User;

public class User {

	private String id;
	private String name;
	private String course;
	
	public User() {
		
	}

	public User(String id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}
