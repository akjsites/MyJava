package com.aswini.BankingManagementSystem;

public class CurrentAccount extends bankAccount {
	public CurrentAccount(int accountNo, String holderName, double balance) {
		super(accountNo, holderName, balance);
	}
	public void  deposit(double amount)
	{
		super.setBalance(getBalance()+amount);
		System.out.println("Your Balance is : "+this.getBalance());
	}
	public void  withdraw(double amount)
	{
		super.setBalance(getBalance()-amount);
		if(getBalance()<amount) {
		System.out.println("Your Amaount less then current balnce we want provides some lones types because yor acoount is current accounts");
		System.out.println("Your paid rs  : "+(-getBalance()));
		}
		else
		{
		System.out.println("Your Balance is : "+(getBalance()));
		}
	}
}
