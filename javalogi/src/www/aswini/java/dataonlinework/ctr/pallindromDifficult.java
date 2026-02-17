package www.aswini.java.dataonlinework.ctr;

public class pallindromDifficult {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int c=0;
		for(int j=a;j!=0;j/=10)c++;
		if(a>0 && c>=3)
		{   int rev=0;
			for(int b=a;b!=0;b/=10)
			{
				int r=b%10;
				rev=rev*10+r;
			}if(rev==a)System.out.println("pallindrom");else System.out.println("not a pallindrom");
		}
		
		else if(a<0)
		{
			System.out.println("Negative Value Not Alooowed");
		}
		else if(c<3)
		{
			System.out.println(" You Must br put three digit Number");
		}

	}

}
