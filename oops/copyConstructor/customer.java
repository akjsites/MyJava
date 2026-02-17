package com.aswini.copyConstructor;

public class customer {
      String customerName;
      int customerpoint;
	  public customer(String customerName, int customerpoint) {
		super();
		this.customerName = customerName;
		this.customerpoint = customerpoint;
	  }
	  public int getCustomerpoint() {
		  return customerpoint;
	  }
	  @Override
	  public String toString() {
		return this.customerName;
	  }
      
}
