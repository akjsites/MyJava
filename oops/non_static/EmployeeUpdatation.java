package com.aswini.non_static;

public class EmployeeUpdatation {
  int employeeId;
  String employeeName;
  double employeeSalary;
  char employeeGrade;
  public void setEmployeeData(int id,String name,double salary) {
	  employeeId=id;
	  employeeName=name;
	 employeeSalary=salary;
  }
  public void getEmployeeData() {
	  System.out.println("Employee id is :"+employeeId);
	  System.out.println("Employee Name is :"+employeeName);
	  System.out.println("Employee Salary is :"+employeeSalary);
	  System.out.println("employee grade is :"+employeeGrade);
	  
  }
  public void getEmployeeGrade() {
	  if(employeeSalary >=100000) {
		  employeeGrade='A';
	  }
	  else if(employeeSalary>75000) {
		  employeeGrade='B';
		  }
	  else if(employeeSalary>50000) {
		  employeeGrade='C';
		  
	  }
	  else {
		  employeeGrade='D';
	  }
  }
}
