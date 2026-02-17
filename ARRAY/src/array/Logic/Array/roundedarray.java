package array.Logic.Array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class roundedarray {

	public static void main(String[] args) {
		int arr[]= {1,7,3,4,5};
		    int n=9;
		    boolean isavil=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				isavil=true;
			}
			
			
		}
		if(isavil)
		{
			System.out.println("Yes this is present");
		}
		else {
			System.out.println("NO this is not");
		}
		
		
	}

}
