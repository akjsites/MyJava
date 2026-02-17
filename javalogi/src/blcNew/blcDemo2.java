package blcNew;

public class blcDemo2 {
         int productId;
         String productName;
         double productPrice;
         public  void getData(int id,String name,double price)
        {
        	 productId=id;
        	 productName=name;
        	 productPrice=price;
        	 
		}
         public  void show()
         {
        System.out.println("product Id"+productId);
        System.out.println("priduct Name"+productName);
        System.out.println("product price"+productPrice);
         }
}
