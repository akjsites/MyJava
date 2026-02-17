package array;

import java.util.Scanner;

public class missingarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your number : ");
		int x=sc.nextInt();
		int arr[]= new int[x];
		int c=0;
		for(int j=0;j<arr.length;j++)
		{
			c++;
			System.out.print("enter your "+c+" number : ");
			arr[j]=sc.nextInt();
		}
		int num=(arr.length+1)*((arr.length+1)+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
      System.out.print("missing number is: "+(num-sum));
	}

}
