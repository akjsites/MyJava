package Thtreading.class3;

public class main {

      public static void main(String []args)
      {
    	    System.out.println("Welcome to D-Mart Parking");
  		
  		Thread thread=new Thread(new cardemo(new ParkingGarage(5)));
  		thread.start();
      }
		
	
}
