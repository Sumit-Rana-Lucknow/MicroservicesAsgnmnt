package com.microservices.impl;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> allEmp= new ArrayList<>();
		Employee emp = new Employee();
		emp.setAge(25L);
		emp.setDesignation("Software Engineer");
		emp.setEmployeeId(1L);
		emp.setEmployeeName("Sumit Rana");
		Employee emp2 = new Employee();
		emp2.setAge(25L);
		emp2.setDesignation("Software Engineer");
		emp2.setEmployeeId(1L);
		emp2.setEmployeeName("Sumit Rana");
		allEmp.add(emp2);
		allEmp.add(emp);
		return allEmp;
	}

}
