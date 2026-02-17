package com.aswini.encapsulation;

public class Product {
	private int productId;
	private String ProductName;
	private double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		ProductName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;//return elc 
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductPrice() {
		return productPrice;//return
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + ", productPrice=" + productPrice
				+ "]";
	}
	

}
