package com.aswini.shallo_copy;

public class ProductCreation {

	public static void main(String[] args) {
	Product lap= new Product(70000);
	System.out.println(lap);
    accept(lap);
    System.out.println(lap);
	}
	public static void accept(Product laptop) {
		laptop.setPrice(75000);
	}
	

}
