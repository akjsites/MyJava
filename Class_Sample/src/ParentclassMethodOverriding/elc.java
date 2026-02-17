package ParentclassMethodOverriding;

import java.util.Scanner;

public class elc {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Hello enter a number");
		String x=sc.nextLine();
		Parentclass x1=null;
		try
		{ 
			x1=new ChildClass();
			x1.loadingClass(x);
		
		
		x1.loadingClass(x);
		}
		catch (Exception e) {
			System.out.println("IllegalArgumentException");
		}
		
		
	}

}
