package userexception;

import java.util.Scanner;

class clsnot extends Exception
{
	public clsnot()
	{
		
	}
	public clsnot(String ename)
	{
	   super(ename);	
	}
}
public class userexception1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		try {
		getage(num);
		}
		catch (clsnot e) {
			System.out.println(e.getMessage());
		}

	}
	public static void getage(int num) throws clsnot
	{
		if(num<18)
		{
			throw new clsnot();
		}
		else {
			System.out.println("sucess"+num);
		}
	}

}
