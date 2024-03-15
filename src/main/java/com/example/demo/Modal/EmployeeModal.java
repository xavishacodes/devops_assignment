package com.example.demo.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "EmployeeTable")
public class EmployeeModal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int iNumber;
	private String name;
	private String email;
	private String phoneNumber;
	private int salary;
	
	
	public EmployeeModal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getiNumber() {
		return iNumber;
	}
	public void setiNumber(int iNumber) {
		this.iNumber = iNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	
	@Override
	public String toString() {
		return "EmployeeModal [id=" + id + ", iNumber=" + iNumber + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
