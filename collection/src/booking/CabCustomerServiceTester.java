package booking;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		CustomerService x=new CustomerService();
		
        x.printbill(new Customer(111, "Aswini", "hyd", "odis", 21, "9234567896"));
	}

}
