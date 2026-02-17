package day1;

import java.util.Arrays;

public class move0 {
 public static void main(String[] args) {
	int []arr= {0,1,2,3,0,5,4};int c=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=0)
		{
			arr[c++]=arr[i];
		}
	}
	while(c<arr.length)arr[c++]=0;
	System.out.println(Arrays.toString(arr));
	
	
	
}
}
