package com.tnsif.interfaceapplication;

public class Customer 

{
	private String name;
	private String city;
	
	//getters and setters
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
	
	
	//constructor
	public Customer(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	
	//Default constructor
	public Customer() {
	}
	
	}
