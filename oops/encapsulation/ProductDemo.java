package com.aswini.encapsulation;

public class ProductDemo {

	public static void main(String[] args) {
	Product product=new Product(101, "hp", 45000);
	System.out.println(product);
	product.setProductPrice(product.getProductPrice()+600);//45600
	System.out.println(product);
	product.setProductName("Dell");
  System.out.println(product);
	}

}
