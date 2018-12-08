package com.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entity.Employee;
import com.microservices.impl.EmployeeService;

@RestController
@ComponentScan("package") 
public class EmployeeWebEndpoint {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/findEmployee/{employeeId}", method = RequestMethod.GET)
	public Employee findEmployee(@PathVariable() Long employeeId){
		return employeeService.getEmployee(employeeId);
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	

}
