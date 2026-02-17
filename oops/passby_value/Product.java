package passby_value;

public class Product {
private int numberOfItem;
private String dishName;
private boolean isTesty;
public Product(int numberOfItem, String dishName, boolean isTesty) {
	super();
	this.numberOfItem = numberOfItem;
	this.dishName = dishName;
	this.isTesty = isTesty;
}
public int getNumberOfItem() {
	return numberOfItem;
}
public void setNumberOfItem(int numberOfItem) {
	this.numberOfItem = numberOfItem;
}
public String getDishName() {
	return dishName;
}
public void setDishName(String dishName) {
	this.dishName = dishName;
}
public boolean isTesty() {
	return isTesty;
}
public void setTesty(boolean isTesty) {
	this.isTesty = isTesty;
}
@Override
public String toString() {
	return "Product [numberOfItem=" + numberOfItem + ", dishName=" + dishName + ", isTesty=" + isTesty + "]";
}

}
