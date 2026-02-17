package www.aswini.java.dataonlinework.ctr;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		String a=args[0];
		int n=Integer.parseInt(a);
		pri(n);
		
	}
	public static void pri(int n)
	{
		
		int count=0;
		for(int i=1; ;i++)
		{
			int c=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)c++;
		}if(c==2)System.out.println(i);count++;
		if(count==n)break;
		
		}
		
	}
}
