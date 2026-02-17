package Thtreading.class2;

public class Restaurant {

	private String name;
	private String order;
	boolean isOrderReady = false;
	public Restaurant(String name) {
		this.name = name;
	}
	public synchronized void placeOrder(String order)
	{
		if(!isOrderReady) {
		try {
			System.out.println("Waiter: Placed order for fried "+order);
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
       System.out.println("Waiter: Serving the fried "+order);
		
		
	}
	public synchronized void prepareOrder(String order)
	{
		System.out.println("Chef: Preparing fried "+order);
		System.out.println("Chef: fried chicken is ready!");
		notify();
	}
	public String getName() {
		return name;
	}
	
	
}
