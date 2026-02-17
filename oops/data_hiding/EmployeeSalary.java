package com.aswini.data_hiding;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Mobile number :");
    long Id=sc.nextLong();
	sc.nextLine();
	System.out.print("Enter the Employee Name :");
	String name=sc.nextLine();
	System.out.print("enter Employee Salary :");
	double sal=sc.nextDouble();
	if(sal<0) {
		System.err.println("Please Enter Valid Amount");
		sc.close();
		return;
	}
	Employee ram=new Employee(Id,name,sal);
//	ram.setEmployeeDetails(Id,name,sal);
// ram.calculateSalaryIncrement();
// ram.getEmployeeDetails();
	sc.close();
	
	}

	

}
