package com.aswini.parameterize_comstructor;

public class Car {
	private String Model;
	private int year;
	private double price;
	public Car(String model, int year, double price) {
		super();
		if(year<2010) {
			System.err.println("year must be greater than 2010\r\n"
					+ "");
			System.exit(0);
		}
		if(price<0) {
			System.err.println("Price must be positive integer");
			System.exit(0);
		}
		Model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [Model=" + Model + ", year=" + year + ", price=" + price + "]";
	}
	
	

}
