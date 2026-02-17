package www.aswini.java.dataonlinework.ctr;

public class profitPercentage {
    public static void main(String[] args) {
    	    int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(b>a)
		{
			int p=b-a;
			int pp=a/100;
			int ppp=p/pp;
			System.out.println("Profit   :%"+ppp);
		}
		else {
			int l=a-b;
			int ll=a/100;
			int lll=l/ll;
			System.out.println("Loss     :%"+lll);
		}
		
	}
}
