package com.aswini.vehicleIndustry;

public class Bike implements vehicle {
    private String model;
    private int cc;
	
	public Bike(String model, int cc) {
		super();
		if(cc<=0)
		{
			System.err.println("model not null");
			System.exit(0);
		}
		this.model = model;
		this.cc = cc;
	}
	public void start() {
		System.out.println("bike start");
	}
	public void stop() {
		System.out.println("bike stop");

	}

}
