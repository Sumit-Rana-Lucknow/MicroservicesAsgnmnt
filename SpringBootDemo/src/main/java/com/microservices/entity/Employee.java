package com.microservices.entity;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1521094494583888905L;
	private Long employeeId;
	private String employeeName;
	private String designation;
	private Long age;
	private Department dprtmnt;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Department getDprtmnt() {
		return dprtmnt;
	}

	public void setDprtmnt(Department dprtmnt) {
		this.dprtmnt = dprtmnt;
	}

}
