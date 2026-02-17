package com.aswini.encapsulation;

import java.util.Scanner;

public class ManagementDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		Management man=new Management(a, b, c);
		System.out.println(man);
		System.out.println("......................................");
		man.setPriority("medium");     
		man.setComplete();
        System.out.println(man);
	}

}
