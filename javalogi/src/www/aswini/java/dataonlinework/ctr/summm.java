package www.aswini.java.dataonlinework.ctr;

public class summm {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		if(number>=10 && number<=100)
		{
			int r=number%10;
			int w=number%10;
			System.out.println("The Reasult Is : "+(w+r));
		}
		else if(number<=0)
		{
			System.out.println("The Reasult is : "+number);
		}
		else 
		{
			System.out.println("The Reasult is : "+(-number));
		}

	}

}
