package PaymentProcessing;

public class PaymentGateway {
     public Payment initiatePayment(Payment p1)
     {
    	 if(p1 instanceof CreditCardPayment)
    	 {
    		 System.out.println("Initiating Credit Card payment.\r\n"
    					+ "");
    		 p1.applyDiscount();
    		 p1.processPayment();
    		 return new CreditCardPayment();
    		 
    	 }
    	 else if (p1 instanceof UPIPayment) 
    	 {
    		 System.out.println("Initiating UPI payment.\r\n"
 					+ "");
    		 p1.applyDiscount();
    		 p1.processPayment();
    		 return new UPIPayment();
    	 }
    	 else
    	 {
    		 return null;
    	 }
     }

}
