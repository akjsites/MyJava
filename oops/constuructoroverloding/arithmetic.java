package com.aswini.constuructoroverloding;

public class arithmetic {
	int a;
	int b;
     public arithmetic(int x,int y)
     {
    	 this(12.55, 56.88);
    	 System.out.println("sum is : "+(x+y));
     }
     public arithmetic(double x,double y)
     {
    	 this("Aswini", "Kuumar Jena");
    	 System.out.println("sum is : "+(x+y));
     }
     public arithmetic(String x,String y)
     {
    	 
     System.out.println("sum is : "+x+y);
     }
     public arithmetic(boolean x,boolean y)
     {
     this(1, 6);
     System.out.println("sum is : "+x+y);
     }
}
