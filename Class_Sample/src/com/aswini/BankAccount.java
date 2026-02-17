package com.aswini;

public class BankAccount implements Bank{
	private long accountNumber;
	private double balance;
	private double bal1;
	public BankAccount(long accountNumber,double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance=balance;
	}

	public double getbalance(double balance)
	{
		return this.balance=balance;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	



	@Override
	public double deposit(double amount) throws InvalidAmountException {
		if(amount<=0)
		{
			throw new InvalidAmountException("not less your ballance");
		}
		else {
			bal1=this.balance+amount; 
			
			
		}
		return bal1;
	}
	

	@Override
	public double withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount<=0)
		{
			throw new InvalidAmountException("not less your ballance");
		}
		else if(balance<amount){
			throw new InsufficientFundsException("not sufficiant balance");
		}
		else {
		return this.balance-amount;
		}
	}

	@Override
	public void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, InvalidAmountException,AccountNotFoundException {
		if(amount<=0)
		{
			throw new InvalidAmountException("not less your ballance");
		}
		if(balance<amount){
			throw new InsufficientFundsException("not sufficiant balance");
		}
		if(toAccount.equals(null))
		{
			throw new AccountNotFoundException("Acount number is invalid");
		}
		
		double v=toAccount.balance;
		
		System.out.println(toAccount.accountNumber+" increased salary "+(amount+v));
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if(amount<=0)
		{
			throw new InvalidAmountException("not less your ballance");
		}
		if(balance<amount){
			throw new LoanNotAllowedException("not loan applicable insufficiant balance");
		}
		
		if(balance>amount && balance>0)
		{
			System.out.println("Loan applicable");
		}
	}

	@Override
	public double getBalance() {
		
		return balance;
	}
	
}
