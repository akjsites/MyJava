/*In a virtual zoo management system, you need to organize and categorize various types of animals to efficiently manage their characteristics and behaviors. 

To achieve this, you decide to implement a class hierarchy using multilevel inheritance.

1. Create the Animal Class
Requirements:
Define a private String attribute named name.
Implement a parameterized constructor to initialize name.
Implement getter and setter methods for name.


2. Create the Mammal Class
Requirements:
Extend the Animal class.
Add a private boolean attribute named hasFur.
Implement a parameterized constructor to initialize name (from Animal) and hasFur.
Implement getter and setter methods for hasFur.


3. Create the Dog Class
Requirements:
Extend the Mammal class.
Add a private String attribute named breed.
Implement a parameterized constructor to initialize name, hasFur (from Mammal), and breed.
Implement getter and setter methods for breed.
Generate toString() method to display all the Animal Details.In this method display all the Animal Details.

4. Create the Main Class which is an ELC class.

Create an instance of the Dog class.
Display details of the Dog object to demonstrate inheritance.

TEST CASE 1 :
-------------
sample input : Dog dog = new Dog("Tommy", true, "Bulldog");
               
sample output : 
              Dog [getName()=Tommy, isHasFur()=true, breed=Bulldog]

*/


package com.aswini.multilevelinheritance1;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
