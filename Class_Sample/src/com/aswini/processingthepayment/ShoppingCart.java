package com.aswini.processingthepayment;

public class ShoppingCart {
	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}
	public void chaeckout(Payment p1)
	{
		System.out.println("Starting checkout for amount RS :"+totalAmount);
		if(p1 instanceof CreditCardPayment)
		{
			p1.makePayment(totalAmount);
		}
		if(p1 instanceof DebitCardPayment)
		{
			p1.makePayment(totalAmount);
		}
		else if(p1 instanceof UPIPayment)
		{
			p1.makePayment(totalAmount);
		}
		
	}
	public void cancelOrder(Payment p1)
	{
		System.out.println("Order Canceled. Initiating Refund...");
		System.out.println("Cancelling order for amount RS :"+totalAmount);
		if(p1 instanceof CreditCardPayment)
		{
			p1.makeRefund(totalAmount);
		}
		if(p1 instanceof DebitCardPayment)
		{
			p1.makePayment(totalAmount);
		}
		else if(p1 instanceof UPIPayment)
		{
			p1.makePayment(totalAmount);
		}
	}
}
