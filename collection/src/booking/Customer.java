package booking;

import java.util.regex.Pattern;

public record Customer(int custId,String customerName,String pickupLocation,String dropLocation,int distance,String phone) 
{
       public Customer
       {
	       try {
	       if(custId<=0)
	       {
	    	   throw new IllegalArgumentException("Customer ID must be positive.");
	       }
	       if(customerName.isBlank())
	       {
	    	   throw new IllegalArgumentException("Customer name cannot be null or blank.");
	       }
	       if(pickupLocation.isBlank())
	       {
	    	   throw new IllegalArgumentException("Pickup location cannot be null or blank.");
	       }
	       if(dropLocation.isBlank())
	       {
	    	   throw new IllegalArgumentException("Drop location cannot be null or blank.");
	       }
	       if(distance<=0)
	       {
	    	   throw new IllegalArgumentException("Distance cannot be negative.");
	       }
	       
	       if(phone.length()!=10 ||phone.charAt(0)=='1'||phone.charAt(0)=='2'||phone.charAt(0)=='3'||phone.charAt(0)=='4'||phone.charAt(0)=='5')
	       {
	    	   throw new IllegalArgumentException("mobile number be 10 digit");
	       }
	       }
	       catch (Exception e) {
			System.out.print(e.getMessage());
		}
       }
}



