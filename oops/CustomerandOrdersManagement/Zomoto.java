package com.aswini.CustomerandOrdersManagement;

public class Zomoto {
         public static void main(String[] args) {
        	 Order o1=new Order("123456", "Laptop", 222);
        	 Customer c1=new Customer("James", "james@example.com", o1);
        	 System.out.println(c1);
		}
}
