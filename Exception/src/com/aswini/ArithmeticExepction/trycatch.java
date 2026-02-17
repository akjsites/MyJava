package com.aswini.ArithmeticExepction;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		try
		{
			
		
			throw new ArithmeticException("can not divided into");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
