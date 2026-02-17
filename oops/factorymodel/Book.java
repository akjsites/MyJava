package com.aswini.factorymodel;

public class Book {
	private int id;
	private String BookName;
	private double Price;
	public Book(int id, String bookName, double price) {
		super();
		this.id = id;
		BookName = bookName;
		Price = price;
	}
	public static Book getData() {
		
		return new Book(12, "RichDad", 177.00);
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", BookName=" + BookName + ", Price=" + Price + "]";
	}
	

}
