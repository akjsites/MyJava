package com.aswini.data_hiding;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Costomer bank=new Costomer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter the amount for deposit/withdraw");
		int amt=sc.nextInt();
		bank.diposit(amt);
  sc.close();
	}

}
