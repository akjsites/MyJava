package all;

class RideRequest extends Thread
{
	public void run()
	{
		System.out.println("User requested a ride...\". User should wait");
		try {
			Thread.sleep(2000);
			System.out.println("Searching for nearby drivers...");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
class DriverAssignment extends Thread
{
	public void run()
	{
		
		try {
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
class FareCalculation extends Thread
{
	public void run()
	{
		System.out.println("Calculating estimated fare...");
		try {
			Thread.sleep(1500);
			System.out.println("Estimated fare: 135.75 RS");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
class LiveTracking extends Thread
{
	public void run()
	{
		
		try {
			for(int i=1;i<=4;i++) {
			Thread.sleep(1500);
			System.out.println("Updating ride location... "+(i*20)+"% completed");
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Ride Completed");
	}
	
}
class PaymentProcessing extends Thread
{
	public void run()
	{
		
		try {
			System.out.println("Processing payment...");
			Thread.sleep(2000);
			System.out.println("Payment successful!");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
class RatingSystem extends Thread
{
	public void run()
	{
		
		try {
			System.out.println("Requesting user rating...");
			Thread.sleep(1000);
			System.out.println("User rated the ride: 5 star");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
public class rider {

	public static void main(String[] args) throws InterruptedException {
		RideRequest x1=new RideRequest();
		DriverAssignment x2=new DriverAssignment();
		FareCalculation x3=new FareCalculation();
		LiveTracking x4=new LiveTracking();
		PaymentProcessing x5=new PaymentProcessing();
		RatingSystem x6=new RatingSystem();
		x1.start();
		x3.start();x3.join();
		x2.start();x2.join();
		x4.start();x4.join();
		x5.start();x5.join();
		x6.start();x6.join();
	}

}
