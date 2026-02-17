package com.aswini.ArithmeticExepction;

import java.util.Arrays;

public class ArrayStoreException {

	public static void main(String[] args) {
		storeObjects();

	}
	public static void storeObjects()
	{
		try {
		Object object[]=new String[3];
		object[0]="Hello";
		object[1]="World";
		object[2]=123;
		System.out.println(Arrays.toString(object));
		}
		catch (Exception e) {
			System.out.println("ArrayStoreException");
		}
	}

}
