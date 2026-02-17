package Thtreading.class2;

public class chief extends Thread{
		 Restaurant restaurant;
		
		 public chief(Restaurant restaurantname) {
			 this.restaurant=restaurantname;
			
		 }
		 @Override
		 public void run()
		 {
			 restaurant.prepareOrder("chicken");
		 }
}
