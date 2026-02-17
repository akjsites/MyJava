package com.aswini.stack_heap_memory;

public class CostomerCon {
public static void main(String[] args) {
	customer c=new customer(101, "kalia");
 
	m1(c);
	System.out.println(c);
}
public static void m1(customer kalia) {
	kalia.setName("balia");
	kalia=new customer(787, "jaganathha");//it will print the first then after execution it will automatically deleted
	System.out.println(kalia);
}
}
