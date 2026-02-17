package all;

import java.util.Scanner;

class demo1 extends RuntimeException
{
	  demo1(String name)
	  {
		  super(name);
	  }
}
public class thread_1
{
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try
		{
			throw new ArithmeticException("can not inp");
			
		}
		catch (demo1 e) {
			
		}
	}
}