package www.aswini.java.dataonlinework.ctr;

public class FareniteToCelcious {

	public static void main(String[] args) {
		Float f=Float.parseFloat(args[0]);
		Float C=Float.parseFloat(args[1]);
		Float celsius=((f-32)*5)/9;
	    
	    Float Fahrenheit=((9*C)/5)+32;
	    
	    char n='\u00B0';
	    System.out.println("celcious"+n+celsius);
	    System.out.println("Farenite "+n+Fahrenheit);
	}
		
}
