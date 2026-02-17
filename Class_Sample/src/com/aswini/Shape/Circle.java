package com.aswini.Shape;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return radius*radius;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Rectangle");
		System.out.println("Length"+radius);
		System.out.println("Area"+this.getArea());
		
	}
	
}
