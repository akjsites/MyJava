package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> x1=new ArrayList<>();
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter Your Name :");
			String nameString=sc.nextLine();
			x1.add(nameString);
			
			
		}
		int c=0;
		for(String x: x1)
		{
			c++;
			if(c==2)
			{
				x1.remove(2);
			}
			System.out.println(x);
		}
		
	}

}
