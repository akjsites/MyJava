package com.aswini.OnlineShoppingCartSystem;

public class Clothing extends product {
	public double calculateDiscount(double ...price)
	{
		int sum=0;
		for(double  x:price)
		{
			sum+=x;
		}
		return (sum-(sum*0.20));
	}
	
	@Override
	public double calculateDiscount1(double... price) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
