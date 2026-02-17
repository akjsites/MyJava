package com.aswini;

public interface Bank {
	double deposit(double amount) throws InvalidAmountException;
	double withdraw(double amount) throws InsufficientFundsException,InvalidAmountException;
	void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException,InvalidAmountException,AccountNotFoundException;
	void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException;
	double getBalance();
}
