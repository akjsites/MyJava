package parameterize_comstructor;

public class Product {
private int id;
private String name;
private double ProductPrice;
public Product(int id, String name, double productPrice) {
	super();
	if(id<0) {
		System.err.println("please enter valid Id");
		System.exit(0);
	}
	if(name==null||name.trim().isEmpty()||name.equals(null));{
		System.err.println("please enter valid name");
		System.exit(0);
	}
	if(productPrice<0) {
		System.err.println("please enter valid price");
		System.exit(0);
	}
	this.id = id;
	this.name = name;
	ProductPrice = productPrice;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", ProductPrice=" + ProductPrice + "]";
}


}
