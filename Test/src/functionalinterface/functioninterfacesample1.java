package functionalinterface;

import java.util.Scanner;

public class functioninterfacesample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[5];
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x: arr)
		{
			System.out.println(x);
		}
	}

}
