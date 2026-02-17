package com.aswini.abstractdemo1;

abstract class vechile
{
	public abstract void exucute();
	public abstract void runing();
}
abstract class bmw extends vechile{
	public void  exucute()
	{
		System.out.println("bmw");
	}
//	public void  runing()
//	{
//		
//	}
	
}
class audi extends bmw
{
//	public void  exucute()
//	{
//		
//	}
	public void  runing()
	{
		System.out.println("audi");
	}
}
public class demo1 {

	public static void main(String[] args) {
		audi a1=new audi();
        a1.runing();
        a1.exucute();
	}

}
