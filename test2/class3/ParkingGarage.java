package Thtreading.class3;

public class ParkingGarage {

	 private int availableSpots=5;
     final int MAX_SPOTS ;
	 public ParkingGarage( int mAX_SPOTS) {
		super();
		this.MAX_SPOTS = mAX_SPOTS;
		
	 }
	 public synchronized void parkcar(String carName) throws InterruptedException
	 {
		 if(availableSpots<=MAX_SPOTS)
		 {
			 System.out.println("You Are parked here ");
		 }
		 else {
			wait();
		}
	 }
	 public synchronized void freeSpot(String carName) throws InterruptedException
	 {
		 if(availableSpots<=1)
		 {
			 System.out.println("parking is not  avaleble");
		 }
		 else if(availableSpots>=MAX_SPOTS)
		 {
			 System.out.println(carName +"Seltos parked. Available spots:"+ availableSpots);
				 this.availableSpots-=1;
			 
			 Thread.sleep(1000);
		 }
		 notify();
	 }
	 public int getAvailableSpots() {
		 return availableSpots;
	 }
	 
	 
}
