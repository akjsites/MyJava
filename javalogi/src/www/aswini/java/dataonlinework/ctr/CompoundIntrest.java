package www.aswini.java.dataonlinework.ctr;

public class CompoundIntrest {

	public static void main(String[] args) {
		int principle=Integer.parseInt(args[0]);
		int rate=Integer.parseInt(args[1]);
		int t=3;
        int Si=principle*t*rate/100;
        int Cp=principle+Si;
        System.out.println("Compond Intrest     :   "+Cp);
	}

}
