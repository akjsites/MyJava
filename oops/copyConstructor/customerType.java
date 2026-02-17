package com.aswini.copyConstructor;

public class customerType {
     customer cust;
     String custName;
	 public customerType(customer cust, String custName) {
		super();
		this.cust = cust;
		this.custName = custName;
	 }
	 @Override
	 public String toString() {
		return "customerType [cust=" + this.cust + ", custName=" + this.custName + "]";
	 }
     
}
