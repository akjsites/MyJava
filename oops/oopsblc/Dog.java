package oopsblc;

import java.util.Scanner;

public class Dog {
String name;
int age;
String color;
public void getData() {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the dog name :");
			name=sc.nextLine();
			System.out.print("enter the dog age :");
			age=Integer.parseInt(sc.nextLine());
			System.out.print("enter the dog color : ");
			color=sc.nextLine();
			sc.close();
}
public void dogDetail() {
	System.out.println("Dog name is :"+name);
	System.out.println("dog age is :"+age);
	System.out.println("dog color is :"+color);
}
}
