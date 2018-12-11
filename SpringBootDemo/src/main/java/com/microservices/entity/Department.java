package com.microservices.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department", schema = "organization")
public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 479444470382013597L;
	private Long id;
	private String deptName;
	private String deptSpecility;
	private Employee deptHead;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptSpecility() {
		return deptSpecility;
	}

	public void setDeptSpecility(String deptSpecility) {
		this.deptSpecility = deptSpecility;
	}

	public Employee getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(Employee deptHead) {
		this.deptHead = deptHead;
	}

}
