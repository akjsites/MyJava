package www.aswini.java.dataonlinework.ctr;

public class NetBill {

	
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a<5000)
		{
			int d=a/100*5;
			int total=a-d;
			System.out.println(" total : "+total);
		}
		else if(a>=10000)
		{
			int d1=a/100*15;
			int total1=a-d1;
			System.out.println(" total : "+total1);
		}
		else
		{
			int d2=a/100*10;
			int total2=a-d2;
			System.out.println(" total : "+total2);
		}
	}
}
