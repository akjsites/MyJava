package static_program;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Bank  costo=new Bank();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enetr Your Name");
		String name=sc.nextLine();
		System.out.print("Enter acount Number");
		int ac=sc.nextInt();
		System.out.print("Enter Amount");
		int amount=sc.nextInt();
		
		costo.setCustomerDeatils(name,ac,amount);
		System.out.print("Enter  your Choice");
		int  choice=sc.nextInt();
		
		//System.out.println(costo);
		switch(choice) {
		case 1->{
			System.out.print("Enetr Deposit Amount");
			int diposit=sc.nextInt();
			
			System.out.println(costo);
			costo.deposit(diposit);
		}
		case 2->{
			System.out.println("Enter Withdraw Amount");
			int withdraw=sc.nextInt();
			costo.withdraw(withdraw);
			System.out.println(costo);
		}
		}
		
//		System.out.print("Enetr Deposit Amount");
//		int diposit=sc.nextInt();
//		System.out.println("Enter Withdraw Amount");
//		int withdraw=sc.nextInt();
//		costo.deposit(diposit);
//		costo.withdraw(withdraw);
		sc.close();

	}

}
