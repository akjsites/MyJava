package com.aswini.innerclass;
class bird
{
	public void fly()
	{
		System.out.println("bird is flying");
	}
}
public class ineerClassDemo {

	public static void main(String[] args) {
		bird b1=new bird()
				{
			public void fly()
			{
				System.out.println("b1 is flying");
			}
				};
				bird b2=new bird()
				{
			public void fly()
			{
				System.out.println("b2 is flying");
			}
				};
				b1.fly();
				b2.fly();

	}

}
