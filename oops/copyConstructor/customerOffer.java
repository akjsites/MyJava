package com.aswini.copyConstructor;

public class customerOffer {
    public static customerType getCalculate(customer cu)
    {
    	   int a= cu.getCustomerpoint();
    	   if(a<100)
    	   {
    		   return new customerType(cu, "emi");
    	   }
    	   else if(a>100 && a<500)
    	   {
    		   return new customerType(cu, "steel");
    	   }
    	   else if(a>500 && a<1000)
    	   {
    		   return new customerType(cu, "silver");
    	   }
    	   else 
    	   {
    		   return new customerType(cu, "gold");
    	   }
    }
}
