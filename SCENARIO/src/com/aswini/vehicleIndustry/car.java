package com.aswini.vehicleIndustry;

public class car implements vehicle {
     private String model;
     private double price;
     private Boolean engineStatus;
     
	public car(String model) {
		super();
		if(model.equals(null))
		{
			System.err.println("model not null");
			System.exit(0);
		}
		this.model = model;
		this.price = price;
	}
	public void start() {
		System.out.println("car start");
	}
	public void stop() {
		System.out.println("car stop");

	}
	

}
