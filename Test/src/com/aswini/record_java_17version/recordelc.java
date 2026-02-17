package com.aswini.record_java_17version;

public class recordelc {

	public static void main(String[] args) {
		demo demo=new demo(-101, "wwww");
		demo demo1=new demo(101, "wwww");
        System.out.println(demo);
        System.out.println(demo.equals(demo1));
        System.out.println(demo.hashCode()+" "+demo1.hashCode());
	}

}
