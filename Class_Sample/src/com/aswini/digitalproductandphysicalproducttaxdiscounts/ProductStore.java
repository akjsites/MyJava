package com.aswini.digitalproductandphysicalproducttaxdiscounts;

import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p1 = null;
		System.out.println("Enter Your Choice : ");
		int number = sc.nextInt();
		sc.nextLine();
		switch (number) {
		case 1 -> {
			System.out.println("Enter Digital Product Name :");
			String ProductName = sc.nextLine();
			System.out.println("Enter Product Price :");
			double ProductPrice = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Product Category :");
			String ProductCategory = sc.nextLine();
			System.out.println("Enter Product License Key :");
			String LicenseKey = sc.nextLine();
			System.out.println("Enter the discount % on final bill :");
			int discount = sc.nextInt();
			sc.nextLine();
			p1 = new DigitalProduct(ProductName, ProductPrice, ProductCategory, LicenseKey);
			p1.applyDiscount(discount);
			System.out.println(p1);
		}
		case 2 -> {
			System.out.println("Enter Digital Product Name :");
			String ProductName = sc.nextLine();
			System.out.println("Enter Product Price :");
			double ProductPrice = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Product Category :");
			String ProductCategory = sc.nextLine();
			System.out.println("Enter Product weight :");
			int weight = sc.nextInt();
			System.out.println("Enter the discount % on final bill :");
			int discount = sc.nextInt();
			p1 = new PhysicalProduct(ProductName, ProductPrice, ProductCategory, weight);
			p1.applyDiscount(discount);
			System.out.println(p1);
		}
		}

	}

}
