package com.aswini.Shape;

public class shapedemo {

	public static void main(String[] args) {
		Shape s1=null;
		shapedemo.main(new Rectangle(12, 20),new Circle(9),new Triangle(12, 20));
	}
	public static  void main(Shape ...s1)
	{
		for(Shape x:s1)
		{
			   x.getArea();
			   x.printDetails();
			   System.out.println("--------------");
		}
	   
	}

}
