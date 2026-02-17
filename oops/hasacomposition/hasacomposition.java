package com.aswini.hasacomposition;

record engine(String name,int power)
{
	
}
class car
{
   public String carname;
   engine e1;
   public car(String carname,String name,int power) {
	super();
	this.carname = carname;
	this.e1 = new engine(name,power);
   }
   
	
}
public class hasacomposition {

	public static void main(String[] args) {
		
car carDemoCar=new car("Audi", "fds", 1270);
System.out.println(carDemoCar);
	}

}
