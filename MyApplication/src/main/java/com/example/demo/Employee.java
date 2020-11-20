 package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Employee {
	private Integer empId;
	private String firstName;
	private String lastName;
	private String mailId;

	public Employee() {
		System.out.println("Default Employee constructor");
	}
	public Employee(Integer empId, String firstName, String lastName, String mailId) {
		System.out.println("Parameterized Employee Constructor");
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailId = mailId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public void come() {
		System.out.println("I am coming");
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", mailId=" + mailId
				+ "]";
	}


}