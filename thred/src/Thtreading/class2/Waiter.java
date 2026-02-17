package Thtreading.class2;

public class Waiter extends Thread{
   
	 Restaurant restaurant;
	 String orderName;
	 public Waiter(Restaurant restaurantname) {
		 this.restaurant=restaurantname;
		
	 }
	 public synchronized void acceptOrder(String order)
		{
		 this.orderName=order;
		 
		}
	 @Override
	 public void run()
	 {

		 restaurant.placeOrder(orderName);
	 }
	 
}
