package ITC;

public class drawer extends Thread{
	private Account account;

	public drawer(Account account) {
		super();
		this.account = account;
	}
	public void run()
	{
		int []balance= {500,4000,3000};
		
		for(int balance1: balance)
		{
			account.withdraw(balance1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
