package com.lab.blc;

import java.util.Scanner;

public class DogScenario {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Scanner sc = new Scanner(System.in);
		String dogName=sc.next();
		double heightt=sc.nextDouble();
		int agee=sc.nextInt();
		dog.name=dogName;
		dog.height=heightt;
		dog.age=agee;
		dog.getDogInformation();
		dog.bark();
sc.close();
	}

}
