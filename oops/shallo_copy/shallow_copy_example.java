package com.aswini.shallo_copy;
class shallo{
	double price;

	public shallo(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "shallo [price=" + price + "]";
	}
	
	
	
}
public class shallow_copy_example {
public static void main(String[] args) {
	shallo kalia=new shallo(67999);
	System.out.println(kalia);
	kalia.setPrice(kalia.getPrice()+4000);
	System.out.println(kalia);
	accept(kalia);
	System.out.println(kalia);
}
public static void accept(shallo balia) {
	balia.setPrice(79000);
}
}
