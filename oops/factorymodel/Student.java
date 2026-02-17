package factorymodel;

import java.util.Scanner;

public class Student {
 private String name;
 private int age;
 private String grade;
 public Student(String name, int age, String grade) {
	super();
	this.name = name;
	this.age = age;
	this.grade = grade;
 }
 public static Student getStudentdata() {
	 Scanner sc=new Scanner(System.in);	
	 System.out.println("Enetr tha name :");
	 String name=sc.nextLine();
	 System.out.println("enetr the age :");
	 int age= Integer.parseInt(sc.nextLine());
	 System.out.println("enter your grade");
	 String grade=sc.nextLine();
	 return new Student(name, age, grade);
 }
 @Override
 public String toString() {
	return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
 }
 
}
