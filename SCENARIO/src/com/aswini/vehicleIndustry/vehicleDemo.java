package com.aswini.vehicleIndustry;

import java.util.Scanner;

public class vehicleDemo {

	public static void main(String[] args) {
		System.out.println("Our Company provide Tw type of oppertunity buy purpose : 1.car type, 2.bike type");
		car v=null;
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number)
		{
		case 1->
		{
		System.out.println("some car models are availabels in this car types : 1.BMW , 2.AUDI , 3.marchadesis , 4.ferrary , 5.rolls royce ");
		int carChoice= sc.nextInt();
		switch(carChoice)
		{
		case 1->{
			System.out.println("some car models are availabels in this bmw types : 1.BMW1 , 2.BMW2 , 3.BMW3");
			int bmwChoice= sc.nextInt();
			switch(bmwChoice)
			{
			case 1->{
				System.out.println("bmwmodel");
				String bmwmodel=sc.nextLine();sc.nextLine();
				System.out.println("numberofBmw");
				int numberofBmw=sc.nextInt();
				System.out.println("colurBmw availavel : - 1.white , 2.golden");
				int colurBmw = sc.nextInt();
				System.out.println("bmw types : ");
				int types = sc.nextInt();
				v=new bmw(bmwmodel, numberofBmw, colurBmw);
				bmw b1=(bmw)v;
				b1.bmwmodel(types);
				b1.claculates();
			}
			}
		}
		}
		}
		
		
		}

	}

}
