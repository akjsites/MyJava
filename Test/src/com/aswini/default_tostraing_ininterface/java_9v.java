package com.aswini.default_tostraing_ininterface;
interface main
{
	default void main()
	{
		show();
		show1();
	}
	static void main1()
	{
		show1();
	}
	private void show()
	{
		System.out.println("i am show ");
	}
	private static  void show1()
	{
		System.out.println("i am show1 ");
	}
}
class suc implements main
{
	
}
public class java_9v {

	public static void main(String[] args) {
		suc s1=new suc();
		s1.main();
		System.out.println("---------------");
		main.main1();;
	}

}
