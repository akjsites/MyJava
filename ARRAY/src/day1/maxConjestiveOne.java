package day1;

public class maxConjestiveOne {
   public static void main(String[] args) {
	int []arr= {0,0,0,0,0,0,0,0,0,0,0};
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}int x=0;
	for(int s:arr)
	{
		if(s==max)x++;
	}
	System.out.println(x);
}
}
