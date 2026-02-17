package com.aswini.digitalproductandphysicalproducttaxdiscounts;

public class DigitalProduct extends Product{
     private String licenseKey;
     private double tax;double Discount;double NewPrice;private double percentag;
	 public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	 }
	 public  void applyDiscount(double percentage)
	 {
		 percentag= percentage;
		 Discount= this.getPrice()*(percentag/100);
		 NewPrice=this.getPrice()-Discount;
		 this.calculateTax(percentage);
	 }
	 public  void  calculateTax(double percentage)
	 {
		 this.tax=NewPrice*0.05;
	 }
	 public double getcalculateTax()
	 {q
		 return tax;
	 }
	 @Override
	 public String toString() {
		return "DigitalProduct Name=" + getName() +"\n"+ "Price=" + getPrice() +"\n"+ "Category="
				+ getCategory()+"\n"+ "licenseKey=" + licenseKey+"percentag "+this.percentag+"Discount "+Discount+"NewPrice "+NewPrice +"\n"+ "tax=" + this.getcalculateTax() ;
	 }
	
	 
	 
	 
}
