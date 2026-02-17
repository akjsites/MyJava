package com.aswini.default_tostraing_ininterface;

interface demo
{
//	default String toString()
//	{
//		
//	}
}
class implimenter implements demo
{
	public String toString()
	{
		return "";
	}
}

public class defaulttoString {

	public static void main(String[] args) {
		implimenter i1=new implimenter();
		System.out.println(i1.toString());

	}

}
