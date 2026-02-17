package com.aswini.BankingManagementSystem;

public class SavingsAccount extends bankAccount {
	
	public SavingsAccount(int accountNo, String holderName, double balance) {
		super(accountNo, holderName, balance);
	}
	public void  deposit(double amount)//override
	{
		super.setBalance(getBalance()+amount);
		System.out.println("Your Balance is : "+this.getBalance());
	}
	public void  withdraw(double amount)
	{
		if(getBalance()<amount) {
		System.out.println("not availeble amount");
		}
		else
		{
		super.setBalance(getBalance()-amount);
		System.out.println("Your Balance is : "+(getBalance()));
		}
	}
}
