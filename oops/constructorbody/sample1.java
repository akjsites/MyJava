package com.aswini.constructorbody;

public class sample1 {
    public sample1()
    {
    	int b=500;
    	System.out.println(b);
    }
    {
    	System.out.println(100);
    }
    {
    	System.out.println(200);
    }
    {
    	System.out.println(300);
    }
    {
    	System.out.println(400);
    }
	public static void main(String[] args) {
		sample1 s1=new sample1();

	}

}
