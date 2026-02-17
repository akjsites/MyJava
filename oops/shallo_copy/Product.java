package shallo_copy;

public class Product {
private double price;

public Product(double price) {
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
	return "Product [price=" + price + "]";
}

}
