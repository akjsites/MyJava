package factorymodel;

import java.util.Scanner;

public class Car {
private String carName;
private String carEngine;
private int carSeat;
private String carColor;
public Car(String carName, String carEngine, int carSeat, String carColor) {
	super();
	this.carName = carName;
	this.carEngine = carEngine;
	this.carSeat = carSeat;
	this.carColor = carColor;
}
public static Car getCarData() {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter the car name  :");
	String name=sc.nextLine();
	System.out.print("Enter what tpye of engine :");
	String eng=sc.nextLine();
	System.out.print("Enter how many Seat you Want :");
	int seat=Integer.parseInt(sc.nextLine());
	System.out.print("enter what your fv color for your :");
	String color=sc.nextLine();
	return new Car(name, eng, seat, color);
}
@Override
public String toString() {
	return "Car Name=" + carName + "\nCar Engine=" + carEngine + "\nCar Seat=" + carSeat + "\n CarColor=" +carColor
			+ "";
}

}
