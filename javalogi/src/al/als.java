package al;

public class als {

	public static int Sum(int x,int y) {
		return x+y;

	}
	
	
	public static int Sub(int x,int y) {
		return x-y;

	}
	
	
	public static int Mul(int x,int y) {
		return x*y;

	}
	
	
	public static int Div(int x,int y) {
		return x/y;

	}
	
	
	public static int Mod(int x,int y) {
		return x/y;

	}
	
	
	public static int Squre(int x) {
		return x*x;

	}
	
	public static int Cube(int x) {
		return x*x*x;

	}
	
	
	
	public static int Reverse(int x) {
		int rev=0;
		for(int i=x;i!=0;i/=10)
		{
			int r=i%10;
			rev =rev*10+r;
		}return rev;

	}
	
	
	
	public static int Count(int x) {
		int c=0;
		for(int i=x;i!=0;i/=10)
		{
			c++;
		}return c;

	}
	
	
	
	
	public static void Prime(int x) {
		int c=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)c++;
		}if(c==2) {System.out.println("Congradulation Your Number Is Prime");}
		else {System.out.println("Sorry Your Number Is Prime");}
     }
	
	
	
	
	public static void UnderPrime(int x) {
		for(int i=1;i<=x;i++)
		{   int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)c++;
			}if(c==2)System.out.println(i);
		}
	}
	

	
	public static void PrimeNumber(int x) {
		int count=0;
		for(int i=1; ;i++)
		{   int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)c++;
			}
			if(c==2) {System.out.println(i);count++;}
			if(count==x) {break;}
		}
	}
	
	public static int MaxNumber(int x) {
		int max=-9;
		for(int i=x;i!=0;i/=10)
		{   int r;
		    r=i%10;
			if(max<r)max=r;
		}return max;

	}
	
	
	public static int MinNumber(int x) {
		int min=9;
		for(int i=x;i!=0;i/=10)
		{   int r;
		    r=i%10;
			if(min>r)min=r;
		}return min;

	}
	
	
	
	public static int Max(int []x) {
		int max = x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)max=x[i];
		}return max;

	}
	
	
	
	public static int Min(int []x) {
		int min=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<min)min=x[i];
		}return min;
		
	}

	
	public static int Abs(int x) {
		if(x<0)return -x;
		else return x;
	}
	
	public static int lastAndFirstAdd(int x)
	{
		int a=x;
	    int r=a%10;
	    while(a>9)a/=10;
	    return a+r;
	}
	
	
	
	
	
	
	

}
