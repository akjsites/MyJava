package com.product.service;



import java.util.Scanner;

import com.product.bean.account;

import com.product.main.accountservive;


public class accountmain {

	public static void main(String[] args) {
		account a=null;
		accountservive pdDaoImpl=new accountservive();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.print("=== BANK ACCOUNT MENU ===\r\n"
					+ "1. Add Customer\r\n"
					+ "2. Fetch Customer Details\r\n"
					+ "3. Delete Customer\r\n"
					+ "4. Deposit Amount\r\n"
					+ "5. Withdraw Amount\r\n"
					+ "6. View Balance\r\n"
					+ "7. Exit\r\n"
					+ "");
			int number=scanner.nextInt();scanner.nextLine();
			switch(number)
			{
			case 1->{
				System.out.println("Eneter Your ACCOUNT_NO You Want To Add");
				int ACCOUNT_NO=scanner.nextInt();
				System.out.println("Eneter Your NAME You Want To Add");
				String NAME=scanner.next();
				System.out.println("Eneter Your ADHAR_NO You Want To Add");
				int ADHAR_NO=scanner.nextInt();
				System.out.println("Eneter Your BANK_NAME You Want To Add");
				String BANK_NAME=scanner.next();
				System.out.println("Eneter Your BALANCE You Want To Add");
				double BALANCE=scanner.nextDouble();
				System.out.println("Eneter Your ADDRESS You Want To Add");
				String ADDRESS=scanner.next();
			    a=new account(ACCOUNT_NO, NAME, ADHAR_NO, BANK_NAME, BALANCE, ADDRESS);
			    System.out.println("row inserted "+pdDaoImpl.AddCustomer(a));
			}
			case 2->{
				System.out.println("selected "+pdDaoImpl.FetchCustomer());
			}
			case 3->{
				System.out.println("Eneter Your id You Want To Add");
				int id=scanner.nextInt();
			    System.out.println("row deleted "+pdDaoImpl.DeleteCustomer(id));
			}
			case 4->{
				System.out.println("Eneter Your id You Want To Add");
				int id=scanner.nextInt();
				System.out.println("Eneter Your bal You Want To Add");
				double bal=scanner.nextDouble();
			    System.out.println("row diposite "+pdDaoImpl.DepositAmount(id, bal));
			}
			case 5->{
				System.out.println("Eneter Your id You Want To Add");
				int id=scanner.nextInt();
				System.out.println("Eneter Your bal You Want To Add");
				double bal=scanner.nextDouble();
			    System.out.println("row withdraw "+pdDaoImpl.WithdrawAmount(id, bal));
			}
			case 6->{
				System.out.println("Eneter Your id You Want To value");
				int id=scanner.nextInt();
			    System.out.println("row deleted "+pdDaoImpl.ViewBalance(id));
			}
			case 7->{
				System.exit(0);
				System.out.println("Thank You ");
			}
			}
		}

	}

}
