package com.aswini.OnlineShoppingCartSystem;

import java.util.Scanner;

public class productsolve {

	public static void main(String[] args) {
		product p1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your your shoping number of counts : ");
		int youwant=sc.nextInt();	
		double totalvalue = 0 ;
		for(int j=1;j<=youwant;j++)
		{
			System.out.println("enter Your Choice: ");
			int number=sc.nextInt();
			System.out.println("enter your amounts you want to choice ");
			int nx=sc.nextInt();
			double price[]=new double[nx];
			switch(number)
			{
			case 1->{
				p1=new Electronics();
			}
	        case 2->{
			p1=new Clothing();
			}
	        case 3->{
	        	p1=new Grocery();
			}
			}
			for(int i=0;i<price.length;i++)
			{
				System.out.println("enter price: ");
				double price1=sc.nextDouble();
				price[i]=price1;
			}
			totalvalue =p1.calculateDiscount(price);
		}
		System.out.println("total is : "+totalvalue);
		
	}

}
