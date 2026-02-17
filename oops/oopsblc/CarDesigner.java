package oopsblc;

public class CarDesigner {
String name;
String color;
int seater;
double carPrice;
public void getCardata(String CarName,String carColor,int carSeater,double price) {
	name=CarName;
	color=carColor;
	seater=carSeater;
	carPrice=price;
}
public void carDeatil() {
	System.out.println("car name is :"+name);
	System.out.println("car color is :"+color);
	System.out.println("seater :"+seater);
	System.out.println("car price is :"+carPrice);
}
}
