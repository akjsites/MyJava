package com.aswini.Shape;

public class Triangle extends Shape{
	private double base;
    private double height;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea() {
		
		return base*height;
	}
	@Override
	public void printDetails() {
		System.out.println("Type = Rectangle");
		System.out.println("Length"+base);
		System.out.println("Breadth"+height);
		System.out.println("Area"+this.getArea());
		
	}
    
}
