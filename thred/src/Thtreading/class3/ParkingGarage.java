package Thtreading.class3;

public class ParkingGarage {

	 private int availableSpots=5;
     final int MAX_SPOTS ;
	 public ParkingGarage( int mAX_SPOTS) {
		super();
		this.MAX_SPOTS = mAX_SPOTS;
		availableSpots=mAX_SPOTS;
	 }
	 public synchronized void parkcar(String carName) throws InterruptedException
	 {
		 if(availableSpots==MAX_SPOTS)
		 {
			 
		 }
		 else {
			wait();
		}
	 }
	 public synchronized void freeSpot(String carName) throws InterruptedException
	 {
		 if(availableSpots<=1)
		 {
			 wait();
		 }
		 else if(availableSpots>=MAX_SPOTS)
		 {
			 System.out.println(carName +" Seltos parked. Available spots:"+ availableSpots);
				 this.availableSpots-=1;
			 
			 Thread.sleep(1000);
		 }
		 
	 }
	 public int getAvailableSpots() {
		 return availableSpots;
	 }
	 
	 
}
