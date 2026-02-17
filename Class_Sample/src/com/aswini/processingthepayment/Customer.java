package com.aswini.processingthepayment;

import java.util.Scanner;



public class Customer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your total bill Amount :\r\n"
				+ "");
		double bill=sc.nextDouble();
		System.out.println("Choose Payment Method:\r\n"
				+ "1. Credit Card\r\n"
				+ "2. Debit Card\r\n"
				+ "3. UPI\r\n"
				+ "");
		int num=sc.nextInt();
		switch(num)
		{
		case 1->{
			ShoppingCart s1=new ShoppingCart(bill);
			s1.chaeckout(new CreditCardPayment("Mr Aswini"));
			s1.cancelOrder(new CreditCardPayment("Mr Aswini"));
		}
		case 2->{
			ShoppingCart s1=new ShoppingCart(bill);
			s1.chaeckout(new DebitCardPayment("State Bank of India"));
			s1.cancelOrder(new DebitCardPayment("State Bank of India"));
		}
		case 3->{
			ShoppingCart s1=new ShoppingCart(bill);
			s1.chaeckout(new UPIPayment("akj.sites@gmail.com"));
			s1.cancelOrder(new UPIPayment("akj.sites@gmail.com"));
		}
		}
	}

}
