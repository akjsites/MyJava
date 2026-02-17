package com.aswini.animalromes;

public class AnimalTest {

	public static void main(String[] args) {
		Lion l1=null;
		AnimalTest.main(new Lion());
		AnimalTest.main(new Dog());
		AnimalTest.getAnimal(new Lion());
		AnimalTest.getAnimal(new Dog());
		
	}
	public static void main(Animal a1)
	{
		a1.roam();
	}
    public static void getAnimal(Animal b1)
    {
    	if(b1 instanceof Lion l1)
    	{
    		l1.roar();
    	}
    	else if(b1 instanceof Dog l2)
    	{
    		l2.bark();
    	}
    	
    }
}
