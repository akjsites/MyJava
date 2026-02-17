package Exception;

import java.io.IOException;

public class a60 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		m1();
		System.out.println("Main method ended");
	}
	public static void m1()
	{
		try
		{
			m2();
		}
		catch (Exception e--)
		{
			System.out.println("Handled in m1");
		}
	}
	public static void m2() throws ArithmeticException
	{
		try
		{
			m3();
		}
		catch (Exception e)
		{
			System.out.println("Handled in m1");
		}
	}
	public static void m3() throws ArithmeticException
	{
		System.out.println(10/0);
	}
}

