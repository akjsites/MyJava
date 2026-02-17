package com.aswini.constructorbody;

public class sample2 {
      private int x;
	public sample2()
	{
		System.out.println("this is x");
	}
	public sample2(int x)
	{
		this.x=x;
		
	}
	
	
	public static void main(String[] args) {
		sample2 s1=new sample2();

	}

}
