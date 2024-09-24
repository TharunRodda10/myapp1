package com.edubridge.myapp1.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	private Long employeemobile;
	public int getEmployeeId()
	{
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Long getEmployeemobile() {
		return employeemobile;
	}
	public void setEmployeemobile(Long employeemobile) {
		this.employeemobile = employeemobile;
	}
	
}
