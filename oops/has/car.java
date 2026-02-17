package com.aswini.has;

public class car {
	private String make;
	private String model;
	private int year; 
	private enginee engine;
	public car(String make, int year, String model,String model1,int year1) {
		super();
		if(year<=0)
		{
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.make = make;
		this.model = model1;
		this.year = year;
		this.engine = new enginee(model1, year1);
	}
	@Override
	public String toString() {
		return "car [make=" + make + ", model=" + model + ", year=" + year + ", engine=" + engine + "]";
	}
	
}
