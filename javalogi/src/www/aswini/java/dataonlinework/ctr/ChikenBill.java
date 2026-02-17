package www.aswini.java.dataonlinework.ctr;

public class ChikenBill {

	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int s=((a*4)+(b*3));
		int d=s-50;
		System.out.println("The discount is: "+d);
	}
}
