package com.aswini.copyoneobjtoanotherobjusecopyconstructor;

public class customer {
     private int customerId;
     private String customerName;
     public customer(int customerId,String customerName)
     {
    	    this.customerId=customerId;
    	    this.customerName=customerName;
    	    
     }
     public customer(customer c1)
     {
    	 this.customerId=c1.customerId;
    	 this.customerName=c1.customerName;
     }
     public String get()
     {
    	 return "customer : "+customerId+"\n"+"customerName : "+customerName;
     }
     
}
