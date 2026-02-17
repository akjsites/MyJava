package com.aswini.animalromes;

import java.util.Scanner;
import java.util.function.Predicate;

record car(String name,double price,int mile)
{
	public car
	{
		if(name.equals(null)||name.trim().isEmpty())
		{
			
		}
	}
}
public class carlabda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double price=sc.nextDouble();
		int mil=sc.nextInt();
		Predicate<car> p1=str->
		{
			if(price<500000 && mil>=20)
			{
				return true;
			}
			return false;
		};
       
	boolean b1=p1.test(new car("Aswini", 100, 10));
			if(b1==true)
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invallid");
			}
	}
	

}
