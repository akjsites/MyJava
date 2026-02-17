package PaymentProcessing;

public class UPIPayment implements Payment {

	
	@Override
	public void processPayment() {
		
		System.out.println("Processing UPI payment...\r\n"
				+ "");

	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying ₹100 cashback for UPI users.\r\n"
				+ "");
		
	}

}
