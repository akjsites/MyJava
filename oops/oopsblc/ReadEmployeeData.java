package com.aswini.oopsblc;

import java.util.Scanner;

public class ReadEmployeeData {
	int	employeeId ;
	String employeeName ; 
	double employeeSalary ; 
	public void getEmployeeData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee id :");
		employeeId=Integer.parseInt(sc.nextLine());
		System.out.println("enter Employee name");
		employeeName=sc.nextLine();
		System.out.println("enter the Employee Salary");
		employeeSalary=sc.nextDouble();
		sc.close();
	}
	public void employeeData() {
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employee name is :"+employeeName);
		System.out.println("Employee salary is :"+employeeSalary);
	}
}
