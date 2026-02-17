package passby_value;

import java.util.Scanner;

public class Bus {
private String busColour;
private String busCompany;
private int capacityBus;
private double busPrice;
private Bus(String busColour, String busCompany, int capacityBus, double busPrice) {
	super();
	this.busColour = busColour;
	this.busCompany = busCompany;
	this.capacityBus = capacityBus;
	this.busPrice = busPrice;
}
public static Bus getBusData() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Which color you want :");
	String busColourString=sc.nextLine();
	System.out.print("Enter which bus company to buy :");
	String busCompany=sc.nextLine();
	System.out.print("Enter How many seat uyou want :");
	int capacityBus=sc.nextInt();
	System.out.print("enter the price of your buy :");
	double busPrice=sc.nextDouble();
	return new Bus(busColourString, busCompany, capacityBus, busPrice);
}
@Override
public String toString() {
	return "Bus [busColour=" + busColour + ", busCompany=" + busCompany + ", capacityBus=" + capacityBus + ", busPrice="
			+ busPrice + "]";
}


}
