
package deep_copy;

public class ProductClass {

	public static void main(String[] args) {
		Product1 laptop=new Product1(101, "dell", 29900);
		System.out.println(laptop);
    Product1  laptop1=new Product1();
   laptop1.setProductId(455);
  laptop1.setProductName(laptop1.getProductName() +"hp");
    System.out.println(laptop1);
	}

}
