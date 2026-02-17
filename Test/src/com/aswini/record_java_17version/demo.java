package com.aswini.record_java_17version;

public record demo(int id,String name) {
//	{
//		
//	}    not vaild
//	static int x; vaild
	
//	int x;  not vaild
	
//	public static void demo()
//	{
//		
//	}   allow
	
//	public void demo()
//	{
//		
//	}     allow
	
public demo
{
	if(id<=0)
	{
		System.out.println("valid number");
		System.exit(0);
	}
	
}
}
