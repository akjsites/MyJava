package com.aswini.has;

public class enginee {
	private String model; 
	private int engineCapacity;
	public enginee(String model, int engineCapacity) {
		super();
		if(engineCapacity<=0)
		{
			System.out.print("Error Invalid Input");
			System.exit(0);
		}
		this.model = model;
		this.engineCapacity = engineCapacity;
	}
	public String getModel() {
		return model;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	@Override
	public String toString() {
		return "enginee model=" + model + ", engineCapacity=" + engineCapacity +"cc"+ "";
	}
	
}
