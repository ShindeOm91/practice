package com.practice.demo.model;

public class Employee {
	private String id;
	private String name;
	private String city;
	
	
	public Employee() {

	}
	
	
	
	public Employee(String id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
