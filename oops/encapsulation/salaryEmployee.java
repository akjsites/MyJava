package com.aswini.encapsulation;

import java.util.Scanner;

public class salaryEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the Employee Number :");
		String num=sc.nextLine();
		System.out.print("Enetr the Employee Name :");
		String name=sc.nextLine();
		System.out.println("Enter the Employee Saqlary");
		double sa=sc.nextDouble();
		Salary emp=new Salary(num, name, sa);
		System.out.println(emp);
		double a=emp.getEmployeeSalary();
		if(a>90000) {
			System.out.println("Employee is a Developer");
		}
		else if(a>60000 &&a<90000) {
			System.out.println("Employee is a Designer");
		}
		else if(a>40000 &&a<60000) {
			System.out.println("Employee is a Tester");
		}
		else {
			System.err.println("please enter velid salary");
		}
   
	}

}
