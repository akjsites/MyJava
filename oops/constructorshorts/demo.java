package com.aswini.constructorshorts;

class Test
{
	final int x;
	
	{
		print();
		x = 222;
	}
	public void print()
	{
		System.out.println("Default Value :"+x);
	}
	
	
}
public class demo
{
	public static void main(String[] args) 
	{
		Test d1 = new Test();
		System.out.println("User value :"+d1.x);
	}
}