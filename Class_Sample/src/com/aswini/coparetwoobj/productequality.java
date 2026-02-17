package com.aswini.coparetwoobj;

public class productequality {

	public static void main(String[] args) {
		product p1=new product(101, "Aswini");
		product p2=new product(101, "Aswini");
		System.out.println(p1.equals(p2));
	}

}
