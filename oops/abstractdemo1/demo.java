package com.aswini.abstractdemo1;//

import java.util.Scanner;

abstract class bank
{
	public abstract void money();
}
class sbi extends bank
{
	public void money()
	{
		System.out.println("sbi override obstract methods");
	}
}
public class demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=Integer.parseInt(sc.next());
				
		bank b[]=new bank[number];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new sbi();
		}
		ckack(b);
	}
	public static void ckack(bank b1[])
	{
		for(bank b: b1)
		{
			b.money();
		}
	}

}
