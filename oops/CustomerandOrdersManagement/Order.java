package com.aswini.CustomerandOrdersManagement;

public class Order {
	private String orderId;
	private String itemName; 
	private double price;
	public Order(String orderId, String itemName, double price) {
		super();
		if(price<=0)
		{
			System.out.println("Error: Invalid Input");
			System.exit(0);
		}
		this.orderId = orderId;
		this.itemName = itemName;
		this.price = price;
	}
	public String getOrderId() {
		return orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
	} 
	
}
