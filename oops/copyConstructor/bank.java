package com.aswini.copyConstructor;

public class bank {

	public static void main(String[] args) {
		customer c1=new customer("Aswini", 750);
		customerType ct1=customerOffer.getCalculate(c1);
        System.out.println(ct1);
	}

}
