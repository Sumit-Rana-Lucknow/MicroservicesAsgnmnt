package com.microservices.impl;

import org.springframework.stereotype.Service;

import com.microservices.entity.Employee;
@Service("employeeService")
public class EmployeeServiceimpl implements EmployeeService {

	@Override
	public Employee getEmployee(Long employeeId) {
		Employee emp = new Employee();
		emp.setAge(25L);
		emp.setDesignation("Software Engineer");
		emp.setEmployeeId(1L);
		emp.setEmployeeName("Sumit Rana");
		return emp;
	}

}
