package com.microservices.impl;

import java.util.List;

import com.microservices.entity.Employee;

public interface EmployeeService {
 public Employee getEmployee(Long employeeId);

public List<Employee> getAllEmployee();

}
