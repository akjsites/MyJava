package com.aswini;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException, AccountNotFoundException {
		    BankAccount acc1 = new BankAccount(1111, 60000); 
			BankAccount acc2 = new BankAccount(2222, 3000);
			Customer customer1 = new Customer("Alice", acc1);
			Customer customer2 = new Customer("Bob", acc2);
			while(true) {
			System.out.println("Select an option :\r\n"
					+ "           1. Deposit\r\n"
					+ "           2. Withdraw\r\n"
					+ "           3. Transfer\r\n"
					+ "           4. Loan Application\r\n"
					+ "           5. Check Balance\r\n"
					+ "           6. Exit");
			Scanner scanner=new Scanner(System.in);
			
			int num=scanner.nextInt();
            switch(num)
            {
            case 1->{
            	     	System.out.println("Enter Customer name : ");
            	     	String name=scanner.next();
            	     	System.out.println("Enter amount to deposit : ");
            	     	double bal=scanner.nextDouble();
            	     	if(name.equals("ali")) {
            	     		double x=acc1.deposit(bal);
            	    	  	System.out.println(x);
            	    	    	acc1.setbalance(x);}
                  	     else if(name.equals("bob")) {
                   	  
                  	    	double x=acc2.deposit(bal);
            	    	  	System.out.println(x);
            	    	    	acc2.setbalance(x);}
            	    	  	
            	     
            	     
            }
            case 2->{
            		 System.out.println("Enter Customer name : ");
          	     String name=scanner.next();
          	     System.out.println("Enter amount to with : ");
          	     double bal=scanner.nextDouble();
          	   if(name.equals("ali")) {
          		 System.out.println(acc1.withdraw(bal)); 
          	     acc1.setbalance(acc1.withdraw(bal));}
         	     else if(name.equals("bob")) {
          	  
         	    	System.out.println(acc2.withdraw(bal)); 
             	     acc1.setbalance(acc1.withdraw(bal));}
          	       
       }
            case 3->{
       	     System.out.println("Enter Customer name : ");
       	     String name=scanner.next();
       	     System.out.println("Enter 2Customer name : ");
       	     String name1=scanner.next();
       	     System.out.println("Enter amount to transfer : ");
    	         double bal=scanner.nextDouble();
    	        	
    	         	if(name.equals("ali")) {
    	        		acc1.transfer(acc2, bal);
    	        		double rest=acc1.getBalance()-bal;
    	        		acc1.setbalance(rest);
    	        		}
    	         	if(name.equals("bob")) {
    	        		acc2.transfer(acc1, bal);
    	        		double rest=acc2.getBalance()-bal;
    	        		acc2.setbalance(rest);
    	        		}
       	     
       }
            case 4->{
            		System.out.println("Enter Customer name : ");
          	     String name=scanner.next();
          	     System.out.println("Enter loan amount to apply: ");
          	     double bal=scanner.nextDouble();
          	   if(name.equals("ali")) {
          		 acc1.applyForLoan(bal);}
         	     else if(name.equals("bob")) {
          	  
         	    	acc2.applyForLoan(bal);}
          	     
       }
            case 5->{
       	     System.out.println("Enter Customer name : ");
       	     String name=scanner.next();
       	     if(name.equals("ali")) {
       	    	 System.out.println(customer1.getAccount().getBalance());}
       	     else if(name.equals("bob")) {
        	  
       	    	System.out.println(customer2.getAccount().getBalance());}
       }
            case 6->{
       	     System.exit(0);
       }
            }
	}
	}

}
