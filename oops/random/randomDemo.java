package com.aswini.random;

public class randomDemo {

	public static void main(String[] args) {
		int c = 0;
	while(c<=10)
	 {
		long num= Math.round(Math.random()*1000);
		c++;
		
		System.out.println(num);
	 }
	

	}

}
