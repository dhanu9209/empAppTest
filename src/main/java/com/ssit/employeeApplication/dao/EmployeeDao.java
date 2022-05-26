package com.ssit.employeeApplication.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ssit.employeeApplication.modal.Employee;

@Component
public class EmployeeDao {
	public Map<Integer, Employee> employees=new HashMap<>();
	public Employee createEmployee(Employee emp) {
		int empId=employees.size()+1;
		emp.setEmpId(empId);
		employees.put(empId, emp);
		return emp;
	}
	public Collection<Employee> getAllEMployees() {
		return employees.values();
	}
	public Employee getEmployeeById(Integer empId) {
		return employees.get(empId);
	}
}
