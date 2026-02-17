package com.aswini.OnlineShoppingCartSystem;

abstract public class product {
	private int id;
	private String  name;
	private double price ;
	public abstract double calculateDiscount1(double ...price);
	public abstract double calculateDiscount(double ...price);
	
}
