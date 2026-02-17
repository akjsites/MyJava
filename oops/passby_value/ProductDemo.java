package com.aswini.passby_value;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of dish :");
		int noDish=Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Dish Name :");
		String dishName=sc.nextLine();
		System.out.print("plese give the your feedback :");
		boolean test=sc.nextBoolean();
		Product dish=new Product(noDish, dishName, test);
		System.out.println(dish);
      accept(dish);
      System.out.println(dish);
	}
 public static  void accept(Product kalia) {
	 kalia.setDishName("dal");
	 getdata(kalia);
	 System.out.println(kalia);
	 
 }
public static void getdata(Product kk) {
	kk.setNumberOfItem(12);
}
}
