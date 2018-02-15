package com.java.easy.model;

public class Employee {

	private Integer Id;
	
	private String name;
	
	private String address;
	
	private String salary;

	
	
	public Employee(Integer id, String name, String address, String salary) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public Employee() {
		
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}
