package com.aswini.sim;

import java.util.Scanner;

public class elc {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sim name: ");
	    String name=sc.next();
	    
	    Class x=Class.forName(name);
	    Object oj1=x.newInstance();
	    sim sx1=(sim)oj1;
	    SIM_min.acceptsim(sx1);
		while(true)
		{
			System.out.println("1.recharge"
					+ "       2.check"
					+ "       3.call"
					+ "       4.message");
			
			System.out.println("Enter Your Number :-");
			int num=sc.nextInt();
			switch(num)
			{
			case 1->{
				System.out.println("Enter your balance: ");
			    double bal=sc.nextDouble();
			    sx1.recharge(bal); 
			    System.out.println("recharge sucess fully");
		    
			}
			case 2->{
				System.out.println("recharge: "+sx1.check());
				
				}
			case 3->{
				sx1.call();
				
				}
			case 4->{
				sx1.message();
				
				}
			}
			
		}
		
	    //com.aswini.sim.Airtel

	}

}
