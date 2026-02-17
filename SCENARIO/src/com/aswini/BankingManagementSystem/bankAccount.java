package com.aswini.BankingManagementSystem;

abstract class bankAccount {//abstract
     private int  accountNo;
     private String holderName;
     private double balance;//data-hiding
	 public bankAccount(int accountNo, String holderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	 }
	 public int getAccountNo() {//encapsulation
		 return accountNo;
	 }
	 public void setAccountNo(int accountNo) {
		 this.accountNo = accountNo;
	 }
	 public String getHolderName() {
		 return holderName;
	 }
	 public void setHolderName(String holderName) {
		 this.holderName = holderName;
	 }
	 public double getBalance() {
		 return balance;
	 }
	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
     public abstract void  deposit(double amount);
     public abstract void  withdraw(double amount);
}
