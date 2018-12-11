package com.microservices.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "organization")
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

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
