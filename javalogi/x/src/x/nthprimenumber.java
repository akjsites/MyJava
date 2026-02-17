package x;

import java.util.Scanner;

public class nthprimenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;;i++)
		{
			int count=0;int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==2)
			{
				System.out.println(i);
				count++;
				if(count==n)break;
			}
		}
		

	}

}
