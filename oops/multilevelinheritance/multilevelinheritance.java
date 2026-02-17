package com.aswini.multilevelinheritance;

class x1
{
	protected void getx1() {
		System.out.println("hello i am x1");

	}
}
class x2 extends x1
{
	protected void getx2() {
		System.out.println("hello i am x2");

	}
}
class x3 extends x2
{
	protected void getx3() {
		System.out.println("hello i am x3");

	}
}
class x4 extends x2
{
	protected void getx4() {
		System.out.println("hello i am x4");

	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		x3 x=new x3();
		x4 y=new x4();
		x.getx1();
		x.getx2();
		x.getx3();
		
		
		y.getx1();
		y.getx2();
		y.getx4();
	
	}

}
