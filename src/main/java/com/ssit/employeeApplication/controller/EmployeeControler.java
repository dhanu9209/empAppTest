package com.ssit.employeeApplication.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssit.employeeApplication.modal.Employee;
import com.ssit.employeeApplication.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeControler {
	@Autowired
	private EmployeeService empService;
	
	//postmethod
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
	}
	//getmethod
	@GetMapping
	public Collection<Employee> getAllEMployees(){
		return empService.getAllEMployees();
	}
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") Integer empId) {
		return empService.getEmployeeById(empId);
	}

}
