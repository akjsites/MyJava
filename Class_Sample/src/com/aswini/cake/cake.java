package com.aswini.cake;

public abstract class cake {
      private String shape;
      private String flavor;
      private int quantity =1;
      public static double price = 400;
    public cake()
    {
    	
    }
	  public cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	  }
	  
	  public String getShape() {
		  return shape;
	  }
	  public void setShape(String shape) {
		  this.shape = shape;
	  }
	  public String getFlavor() {
		  return flavor;
	  }
	  public void setFlavor(String flavor) {
		  this.flavor = flavor;
	  }
	  public int getQuantity() {
		  return quantity;
	  }
	  public void setQuantity(int quantity) {
		  this.quantity = quantity;
	  }
	 
	  @Override
	  public String toString() {
		return "A Round Chocolate Cake Of "+quantity +" KG is Ready @ Rs."+price*quantity;
	  }
	  
	 

}
