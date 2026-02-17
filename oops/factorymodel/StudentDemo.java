package com.aswini.factorymodel;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many time to want the object will be executed");
		int noOfObj=sc.nextInt();
		for(int i=1;i<=noOfObj;i++) {
			Student student=Student.getStudentdata();
			System.out.println(student);
		}

	}


}
