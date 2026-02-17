package Thtreading.class2;

public class KFC {

	public static void main(String[] args) {
		Restaurant r=new Restaurant("KFC");
		Waiter w= new Waiter(r);
		System.out.println("Welcome to "+r.getName()+" Restaurant!!!");
        w.acceptOrder("chicken");
		w.start();
		chief c= new chief(r);
		c.start();

	}

}
