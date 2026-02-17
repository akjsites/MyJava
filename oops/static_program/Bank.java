package static_program;

public class Bank {
	String customerName;
	int accountNumber;
	private double currentBalance;
	static String bankName = "Union Bank";
	static String bankAddress = "HyderBad";
	static String bankIFSCCode = "UBIN0575208";

	public void setCustomerDeatils(String name, int ac, double amount) {
		customerName = name;
		accountNumber = ac;
		currentBalance = amount;
	}

	public void withdraw(double amount) {
		if (currentBalance < amount) {
			System.err.println("You have insufficient balance");

		} else {
			currentBalance = currentBalance - amount;
			System.out.println("After WithDraw amount is "+currentBalance);
		}
	}

	public void deposit(double amount) {
		if (amount < 0) {
			System.err.println("If a cutsomer wants to deposit zero or -ve amount than it should provide error message");

		} else {
			currentBalance = currentBalance + amount;
			System.out.println("After diposit amount is "+currentBalance);
		}
	}

	public void currentBalance() {

		System.out.println(currentBalance);
	}

	@Override
	public String toString() {
		return "Bank customerName=" + customerName + ", \naccountNumber=" + accountNumber + " \ncurrentBalance="
				+ currentBalance + " \nbankName: "+bankName+" \nBank Adress"+bankAddress+"\nIFFC code"+bankIFSCCode;
	}



	


}
