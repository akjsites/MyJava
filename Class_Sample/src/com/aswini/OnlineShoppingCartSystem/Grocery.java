package com.aswini.OnlineShoppingCartSystem;

public class Grocery extends product {
	public double calculateDiscount(double ...price)
	{
		int sum=0;
		for(double  x:price)
		{
			sum+=x;
		}
		return (sum-(sum*0.15));
	}
	
	@Override
	public double calculateDiscount1(double... price) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}