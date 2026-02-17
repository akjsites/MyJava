package www.aswini.java.dataonlinework.ctr;

public class SwapWithOutUsingThirdVariable {

	public static void main(String[] args) 
	{
	
		String a,b;
		a=args[0];
		b=args[1];
		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);
		num2 = num1+num2;
		num1=num2-num1;
		num2=num2-num1;
		System.out.println("A: "+num1);
		System.out.println("B: "+num2);
		
	}
}
