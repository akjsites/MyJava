package com.aswini.singleinheritance;

class engine
	{ 
	public void getData()
	{
	System.out.println("hello");	
	}
	}
	class car extends engine{
	public void getcarData()
	{
	System.out.println("this is car engine");
	}
	}
	public class SinleInheritance
	{
	public static void main(String[] args) {
	car audi=new car(); 
	audi.getcarData();
	audi.getData();
	}
	}
	   
		
	


