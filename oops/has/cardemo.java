package com.aswini.has;

import java.util.Scanner;

public class cardemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data :");
		String  y1=sc.next();
		int x1=sc.nextInt();
		
		String x2=sc.next();
		String x3=sc.next();
		int  y2=sc.nextInt();
        car c1=new car("mustand", 2012, "honds", "civis", 3000);
        System.out.println(c1);
	}

}
