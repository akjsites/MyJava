package FinancialTransaction;

import java.util.Scanner;

public class FinancialTransaction {
   public void 	processTransaction(double d,long l)
   {
	   try
	   {
		   if(d<=0)
		   {
			   throw new NumberFormatException();
		   }
		   double x=d;
		   long y=l;
		   System.out.println("Transaction successful: Amount Rs."+x +"transferred to account" + y);
	   }
	   catch(Exception e)
	   {
		   if(e instanceof NumberFormatException)
		   {
			   System.out.println("invalid numeric inputs.");
		   }
		   else if(e instanceof IllegalArgumentException)
		   {
			   System.out.println("invalid transaction amount (negative or zero).");
		   }
		   else
		   {
			   System.out.println("unexpected errors during processing");
		   }
	   }
	  
   }
   
   
   public static void main(String []args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your balance");
	   double amount=sc.nextDouble();
	   System.out.println("enter your number");
	   long anum=sc.nextLong();
	  
	   FinancialTransaction f1=new FinancialTransaction();
	  f1.processTransaction(amount, anum);
   }
}
