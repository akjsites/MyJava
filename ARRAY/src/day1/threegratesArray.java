package day1;

import java.util.Arrays;

public class threegratesArray {
 public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int o=arr[i];
				arr[i]=arr[j];
				arr[j]=o;
			}
		}
	}int i=0;
	for(int h:arr)
	{
		i++;
		System.out.println(h);if(i==3)break;
	}
}
}
