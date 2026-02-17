package com.aswini.ArithmeticExepction;

import javax.management.RuntimeErrorException;

public class demo1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		if(b==0)
		{
		    throw new RuntimeErrorException(null,"not divisible 0");
		}
	}

}
