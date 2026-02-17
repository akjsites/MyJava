package com.aswini.digitalproductandphysicalproducttaxdiscounts;

public class PhysicalProduct extends Product{
	private  double shippingWeight;
    private double tax;double Discount;double NewPrice;private double percentag;
	 public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
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
		 this.tax=NewPrice*0.08;
	 }
	 public double getcalculateTax()
	 {
		 return tax;
	 }
	 public double calculateShippingCost()
	 {
		 return shippingWeight*5;
	 }
	 @Override
	 public String toString() {
		return "DigitalProduct Name=" + getName() +"\n"+ "Price=" + getPrice() +"\n"+ "Category="
				+ getCategory()+"\n"+"percentag "+this.percentag+"Discount "+Discount+"NewPrice "+NewPrice +"\n"+ "tax=" + this.getcalculateTax()+"Shipping Cost RS :"+calculateShippingCost() ;
	 }
	
	
     
}
