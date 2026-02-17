package www.aswini.java.dataonlinework.ctr;

public class nextMultiple {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num>0)
		{
			int n=num/100;
			System.out.println("The Reasult Is : "+((n+1)*100));
		}
		else 
		{
			System.out.println("The Reasult Is : "+(num-1));
		}

	}

}
