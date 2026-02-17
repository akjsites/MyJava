package www.aswini.java.dataonlinework.ctr;

public class CalculateYearOfJava {
	
	    public static void main(String[] args) {
			int a=Integer.parseInt(args[0]);
			int year=a/365;
			int month=a%365/30;
			int day=a%30%30;
			System.out.println("year : "+year+"month"+month+"day"+day);
		}
	
}
