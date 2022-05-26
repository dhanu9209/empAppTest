package com.ssit.employeeApplication.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssit.employeeApplication.dao.EmployeeDao;
import com.ssit.employeeApplication.modal.Employee;

@Service
public class EmployeeService {
    @Autowired
	public  EmployeeDao empDao;
	
	public Employee createEmployee(Employee emp) {
		return empDao.createEmployee(emp);
	}
	public Collection<Employee> getAllEMployees() {
		return empDao.getAllEMployees();
	}
	public Employee getEmployeeById(Integer empId) {
		return empDao.getEmployeeById(empId);
	}
	
}
