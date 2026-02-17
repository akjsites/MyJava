package com.aswini.oopselc;

import java.util.Scanner;

import com.aswini.oopsblc.Employee;

public class EmployeProgram {

	public static void main(String[] args) {
	Employee detail=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.print("enter Employee Id:");
	int id=Integer.parseInt(sc.nextLine());
	System.out.print("enter the Employee name:");
	String name=sc.nextLine();
	System.out.print("enter the Employee Salary:");
	double sal=sc.nextDouble();
    detail.getEmployee(id, name, sal );
	detail.getEmployeeDetail();
sc.close();
	}

}
