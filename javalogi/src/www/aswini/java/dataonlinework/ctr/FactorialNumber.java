package www.aswini.java.dataonlinework.ctr;

public class FactorialNumber {

	public static void main(String[] args) 
	{
	
		String a;
		a=args[0];
		
		int num=Integer.parseInt(a);
		int f=fact(num);
		System.out.println("Fact is : "+f);
		
	}
	public static int fact(int num){
		int p=1;
		for(int i=1;i<=num;i++)
		{
			p+=i;
		}return p;
	}
}
