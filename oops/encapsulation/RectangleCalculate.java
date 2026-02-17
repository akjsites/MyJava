package encapsulation;

import java.util.Scanner;

public class RectangleCalculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the width :");
		double width=sc.nextDouble();
		System.out.print("Enter the height :");
		double height=sc.nextDouble();
		Rectangle calc=new Rectangle(width, height);
		double area=calc.getArea();
		double perimeter=calc.getPerimeter();
		System.out.println("Area of Rectangle is :"+area);
		System.out.println("perimeter of Rectangle is :"+perimeter);

	}

}
