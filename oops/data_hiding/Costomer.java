package data_hiding;

public class Costomer {
private double balance=10000;
public void diposit(double amount) {
	if(amount<0) {
		System.err.println("Please Enter A valid Diposit Amount");
}
	else {
		balance=balance+amount;
		System.out.println("Your Balance have :"+balance);
	}
}
public void withDraw(double amount) {
	if(amount>=balance) {
	  System.err.println("Your Acount has Insufficient Balancen!!");
	}
	else {
		balance=balance-amount;
		System.out.println("Now your balance is :"+balance);
	}
}
}
