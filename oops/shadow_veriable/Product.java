package shadow_veriable;

public class Product {
private int productId;
private String ProductName;
private double ProductPrice;
public void setProductData(int productId,String ProductName,double ProductPrice) {
	this.productId=productId;
	this.ProductName=ProductName;
	this.ProductPrice=ProductPrice;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice + "]";
}

}
