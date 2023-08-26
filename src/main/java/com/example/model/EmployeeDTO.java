package com.example.model;

public class EmployeeDTO {

	private int id;
	private String empName;
	private String department;
	private String address;

	

	public EmployeeDTO(int id, String empName, String department, String address) {
		super();
		this.id = id;
		this.empName = empName;
		this.department = department;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * @Override public String toString() { return "EmployeeDTO [id=" + id +
	 * ", empName=" + empName + ", department=" + department + ", address=" +
	 * address + "]"; }
	 */

}
