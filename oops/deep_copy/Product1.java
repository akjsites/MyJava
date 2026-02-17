package com.aswini.deep_copy;
public class Product1 {
private int productId;
private String productName;
private double productPrice;
public Product1(int productId, String productName, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}
public Product1() {
	productId=0;
	productName=null;
	productPrice=0.00d;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
@Override
public String toString() {
	return "Product1 [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}

}
