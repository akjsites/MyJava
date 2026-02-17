package lettersorts;
import java.util.Arrays;
import java.util.Scanner;

public class lettersorts {

	public static void main(String[] args) {
		int num=0;
		int num1=0;
		int t=0;
		Scanner Scanner=new Scanner(System.in);
		char []s=new char[6];
		int []arr=new int[6];
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter the letter:");
			String name=Scanner.nextLine();
			s[i]=name.charAt(0);
			
		}
		for(int i=0;i<s.length;i++)
		{
			int x=s[i];
			arr[i]=x;
			
			
		}
		for(int i=0;i<arr.length-1;i++)
		{
		
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
		
			
		}
		for(int c:arr)
		{
			char q=(char)c;
			System.out.print(q+" ");
		}
        
	}

}
