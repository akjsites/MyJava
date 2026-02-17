package com.aswini.passbyvalue;
class demo
{
	int x;
	demo() {
		
	}
	public void set(int x)
	{
		this.x = x;
	}
	public String toString()
	{
		return ""+x;
	}
}
public class passbyval {

	public static void main(String[] args) {
		demo demo1=new demo();
		demo1.set(10);
		System.out.println(demo1);
        change(demo1);
        System.out.println(demo1);
	}
	public static void change(demo d)
	{
		d= new demo();
		d.set(20);
		System.out.println(d);
		
	}

}
