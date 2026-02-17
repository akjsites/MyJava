package com.aswini.OnlineShoppingCartSystem;

public class Electronics extends product {
	public double calculateDiscount1(double ...price)
	{
		int sum=0;
		for(double  x:price)
		{
			sum+=x;
		}
		return (sum-(sum*0.05));
	}

	@Override
	public double calculateDiscount(double... price) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
