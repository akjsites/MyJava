package com.aswini.digitalproductandphysicalproducttaxdiscounts;

abstract public class Product {
	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) {
		super();
		if(name==null||name.trim().isEmpty()||category==null||category.trim().isEmpty())
		{
			System.out.println("not valid");
			System.exit(0);
		}
		if(price<=0)
		{
			System.out.println("not valid");
			System.exit(0);
		}
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public abstract void applyDiscount(double percentage);
	public abstract void  calculateTax(double percentage);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
   
}
