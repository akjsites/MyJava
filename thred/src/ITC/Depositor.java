package ITC;

public class Depositor extends Thread{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	public void run()
	{
		int []balance= {1000,6000,8000};
		
		for(int balance1: balance)
		{
			account.deposite(balance1);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}

