package com.aswini.BankingManagementSystem;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		System.out.print("This Bank offer Two Type of servise 1.SavingsAccount,2.CurrentAccount");
		System.out.print("Which Type of You Wants : ");
		bankAccount acc1 = null;
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number)
		{
		case 1->{acc1 = new SavingsAccount(1001, "Aswini", 15000);
		acc1.deposit(1000);
		acc1.withdraw(10000);
		}
		case 2->{acc1 = new CurrentAccount(1001, "Aswini", 5000);
		acc1.deposit(1000);
		acc1.withdraw(10000);
		}
		}
		
	}

}
