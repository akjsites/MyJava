package jdbcConnection;


import java.util.Scanner;

public class jdbc {

	public static void main(String[] args) {
		int arr[]=new int[5];
		System.out.println("non sence");
		Scanner scanner=new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("number : ");
    	     arr[i]=scanner.nextInt();
       }
       System.out.println("search : ");
		int number=scanner.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				System.out.println("true");
				System.exit(0);
			}
		}
	}

}
