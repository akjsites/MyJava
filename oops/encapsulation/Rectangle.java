package com.aswini.encapsulation;

public class Rectangle {
private double width;
private double height;
public Rectangle(double width, double height) {
	super();
	if(width<0|height<0) {
		System.err.println("Width and height must be non-negative.");
		System.exit(0);
	}
	this.width = width;
	this.height = height;
}
public double getArea() {
	return width*height;
}
public double getPerimeter() {
	return 2*(width+height);
}
}
