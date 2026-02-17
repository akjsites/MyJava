package www.aswini.java.dataonlinework.ctr;

public class Intrest {
      
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int t=Integer.parseInt(args[1]);
		int r=Integer.parseInt(args[2]);
		int intrest=(a*t*r)/100;
		System.out.println("intrest is : "+intrest);
	}
}
