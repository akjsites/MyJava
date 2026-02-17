package com.aswini.copy_constuctor;

import java.util.Scanner;

public class EmployeeRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		double c=sc.nextDouble();
		
		Employee emp1=new Employee(a, b, c);
		Manager m1=new Manager(emp1);
		System.out.println(m1);
		sc.close();
	}

}
