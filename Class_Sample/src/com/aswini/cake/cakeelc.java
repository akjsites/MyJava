package com.aswini.cake;

public class cakeelc {

	public static void main(String[] args) {
		OrderedCake o1=new OrderedCake();
        System.out.println(o1);
        OrderedCake o2=new OrderedCake("Round", "Chocolate", 3);
        System.out.println(o2);
        OrderedCake o3=new OrderedCake("Square", "Pineapple", 4, " Happy Birth Day ");
        System.out.println(o3);
	}

}
