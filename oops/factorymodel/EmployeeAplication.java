package com.aswini.factorymodel;

import java.util.Scanner;

public class EmployeeAplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many time you want to run");
		int obj=sc.nextInt();
		
		for(int i=1;i<=obj;i++) {
			Employee emp=Employee.createEmployeeObject();
			System.out.println(emp);
		}
	}

}
