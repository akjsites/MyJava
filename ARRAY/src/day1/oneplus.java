package day1;

public class oneplus {
   public static void main(String[] args) {
	int []oneplus= {1,2,4};
	String n="";
	for(int x:oneplus)
	{
		String pre=""+x;
		n+=pre;
	}
	int sum=Integer.parseInt(n)+1;
	System.out.println(sum);
}
}
