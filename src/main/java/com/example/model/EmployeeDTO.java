package com.example.model;

public class EmployeeDTO {

	private int id;
	private int empName;
	private int department;
	private int address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpName() {
		return empName;
	}

	public void setEmpName(int empName) {
		this.empName = empName;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", empName=" + empName + ", department=" + department + ", address=" + address
				+ "]";
	}

}
