package stack_heap_memory;

import java.util.Scanner;

public class CostomerCon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String name=sc.next();
	customer c=new customer(num, name);
 
	m1(c);
	System.out.println(c);
}
public static void m1(customer kalia) {
	kalia.setName("balia");
	kalia=new customer(787, "jaganathha");//it will print the first then after execution it will automatically deleted
	System.out.println(kalia);
}
}
