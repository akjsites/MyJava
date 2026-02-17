package com.aswini.copy_constuctor;

public class Employee {
      private int employeeId;
      private String emplyeeName;
      private double employeeSalary;
	  public Employee(int employeeId, String emplyeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.emplyeeName = emplyeeName;
		this.employeeSalary = employeeSalary;
	  }
	  public int getEmployeeId() {
		  return employeeId;
	  }
	  public String getEmplyeeName() {
		  return emplyeeName;
	  }
	  public double getEmployeeSalary() {
		  return employeeSalary;
	  }
      
}
