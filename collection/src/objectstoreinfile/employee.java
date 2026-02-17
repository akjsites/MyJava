package objectstoreinfile;

import java.io.Serializable;
import java.util.Scanner;

public record employee(int id,String name,double sal) implements Serializable
{
	
	public static employee inputfile()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your id");
		int id=Integer.parseInt(scanner.next());
		System.out.println("enter Your name");
		String name=scanner.next();
		System.out.println("enter Your sal");
		double sal=Double.parseDouble(scanner.next());
		return new employee(id, name, sal);
	}

}
