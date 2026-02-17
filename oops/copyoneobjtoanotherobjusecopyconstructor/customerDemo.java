package com.aswini.copyoneobjtoanotherobjusecopyconstructor;

import java.util.Scanner;

public class customerDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number =Integer.parseInt(sc.nextLine());
		String Name=sc.nextLine();
		customer c11=new customer(number, Name);
		customer c1=new customer(c11);
		System.out.println(c11.get());
         System.out.println(c1.get());
	}

}
