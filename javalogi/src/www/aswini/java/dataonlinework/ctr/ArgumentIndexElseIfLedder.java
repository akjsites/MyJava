package www.aswini.java.dataonlinework.ctr;

public class ArgumentIndexElseIfLedder {

	public static void main(String[] args) 
	{
		int n2=Integer.parseInt(args[0]);
		int m1=Integer.parseInt(args[1]);
		int n1=Integer.parseInt(args[0]);
		if(args.length ==0)
		{
			System.out.println("0 Index");
		}
		else if(args.length ==1)
		{
			System.out.println("Qube is "+n1+"this number"+(n1*n1));
		}
		else if(args.length ==2)
			
		{
			System.out.println("Sum is "+n2+"&"+m1+"two this number"+(n2+m1));
		}
		
		
	}
}
