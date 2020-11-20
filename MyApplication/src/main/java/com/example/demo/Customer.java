package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private Integer id;
	private String name;
	@Autowired
	private Employee emp;
	
	public Customer() {
		System.out.println("Default constructor called");
		this.id = 0;
		this.name = "";
	}
	
	public Customer(Integer id, String name) {
		System.out.println("parameterized constructor called");
		this.id = id;
		this.name = name;
	}

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

	
	

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public void show() {
		System.out.println("Customer show method");
		emp.come();
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	

}
