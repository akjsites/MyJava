package www.aswini.java.dataonlinework.ctr;

public class Pallindrom {
      public static void main(String[] args) {
    	  int a=Integer.parseInt(args[0]);
  		int rev=0,r;
  		for(int i=a;i!=0;i/=10)
  		{
  			r=i%10;
  			rev=rev*10+r;
  			i/=10;
  		}if(rev==a)System.out.println("Palindron");
  		else System.out.println(" not Palindron");
	}
	
}
