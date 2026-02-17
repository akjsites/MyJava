package array;


import java.util.Scanner;

public class Araaysum3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    int arr1[]=new int[5];
	    int arr2[]=new int[5];
	    int arr3[]=new int[5];
	    int Araaysum3[]=new int[5];
	 	System.out.println("enter number");
	    for(int i=0;i<arr1.length;i++)
	    {
	   
	    	arr1[i]=scanner.nextInt();
	    }
	    for(int i=0;i<arr1.length;i++)
	    {
	    	arr2[i]=scanner.nextInt();
	    }
	    for(int i=0;i<arr1.length;i++)
	    {
	    	arr3[i]=scanner.nextInt();
	    }
	    for(int i=0;i<5;i++)
	    {
	    	   Araaysum3[i]=arr1[i]+arr2[i]+arr3[i];
	    }
	    int sum=0;
	    for(int i:    Araaysum3)
	    {
	    	   sum+=i;
	    }
       System.out.println(sum);
	}

}
