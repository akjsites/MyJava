package parameterize_comstructor;

public class Book {
private String title;
private String author;
private double price;
private double discountPercentage;
public Book(String title, String author, double price,double discountPercentage) {
	super();
	if(author==null||author.trim().isEmpty()) {
		author="No author";
	}

	this.title = title;
	this.author = author;
	this.price = price;
	this. discountPercentage= discountPercentage;
	this.applyDiscount();
}
public void applyDiscount() {
	if(price<0) {
        System.out.println("invalid price number");
        this.price=price;
	}
	else {
		price=price-(price*discountPercentage)/100;
	}
	
	
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
}

}

