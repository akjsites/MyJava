package com.aswini.cake;

public class OrderedCake  extends cake{
	private String message;
	public OrderedCake()
	{
		super.setShape("Round");
		super.setFlavor("vanila");
	}
	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape,flavor,quantity);
		
	}
	public OrderedCake(String shape, String flavor, int quantity,String message) {
		super(shape,flavor,quantity);
		this.message = message;
		
	}
	
	@Override
	public String toString() {
		if(message == null)
		{
			return super.toString();
		}
		else
		return "A " +super.getShape() +" "+super.getFlavor() +"Cake Of "+super.getQuantity()+message +" KG is Ready @ Rs."+price*super.getQuantity();
	}
	

}
