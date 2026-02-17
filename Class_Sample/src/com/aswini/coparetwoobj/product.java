package com.aswini.coparetwoobj;

public class product {
    private int productId;
    private String productName;
	public product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
    public boolean equals(Object obj)
    {
    	product p1=(product)obj;
    	if(this.productId==p1.productId && this.productName.equals(p1.productName))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
