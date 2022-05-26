package com.ssit.employeeApplication.modal;

public class Employee {
private Integer empId;
private String name;
private String mobileNumber;
private String email;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employee() {
	super();
}
public Employee(Integer empId, String name, String mobileNumber, String email) {
	super();
	this.empId = empId;
	this.name = name;
	this.mobileNumber = mobileNumber;
	this.email = email;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
}



}
