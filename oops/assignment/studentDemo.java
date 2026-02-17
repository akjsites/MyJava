package com.aswini.assignment;

import java.util.Scanner;

public class studentDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name : ");
		String StudentNaem=sc.next();
		System.out.print("Enter Student Mark : ");
		int StudentMark=sc.nextInt();
		student s1= new student(StudentNaem, StudentMark);
		studentGrade sg=claculatesStudentGrade.claculateGrade(s1);
        System.out.println(sg);
	}

}
