package oopsblc;

public class Product {
int	productId ;
String	productName ;
double	productPrice;
public void setData(int id,String name,double price) {
	productId=id;
	productName=name;
	productPrice=price;
}
public void  getProductData() {
	System.out.println("product id is :"+productId);
	System.out.println("product name is :"+productName);
	System.out.println("prodct price is :"+productPrice);
}
}
