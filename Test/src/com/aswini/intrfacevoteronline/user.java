package com.aswini.intrfacevoteronline;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class user {

	public static void main(String[] args) {
		String namearr[]=new String[11];
		long arr[]=new long[11];
		int pimarr[]=new int[11];
uservalidation u1=  new uservalidation();






		for(int i=1;i<=10;i++)
		{
			Scanner scanner=new Scanner(System.in);
			
				System.out.println("Enter Your Name : ");
				String name=scanner.next();
				namearr[i]=name;
				System.out.println("Enter Your AdharNo : ");
				long an=scanner.nextLong();
				arr[i]=an;
			    int pim=(int)Math.round(Math.random()*10000+1000);
			    System.out.println(pim);
			    System.out.println("put this pin : then enter Auto submit...");
			    
			    int pin=scanner.nextInt();
			    if(pin==pim)
			    {
			    pimarr[i]=pin;
			    }
			    else {
			    	{
			    		System.out.println("user loss");
			    	}
				}
			    System.out.println("1.modi,2.donal,3.mohan maji");
			    int vnum=scanner.nextInt();
			    System.out.println("Sucessfully.");
			    usermain.getVoteronline(namearr);
			    usermain.getVoteronline(arr);
			    usermain.getVoteronline(u1,vnum, pimarr);
		}
		   System.out.println("WINNER Is "+ u1.senddata());
		   System.out.println("🎉");

	}

}
