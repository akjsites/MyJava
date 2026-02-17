package ITC;

public class Account {
	private int balance = 0;
	
	public synchronized void withdraw(int amount)
    {
    	   while(balance<amount)
    	   {
    		   System.err.println("wating state balance is not availeble");
    		 try {
    			      
				wait();
			 } catch (InterruptedException e) {
				
				e.printStackTrace();
			 }  
    	   }
    	   this.balance=this.balance-amount;
    	   System.out.println("Your current balance is "+this.balance);
    }
    public synchronized void deposite(int amount)
    {
    	  
    	   this.balance=this.balance+amount;
    	   System.out.println("After update balance "+this.balance);
    	   System.out.println("deposite sucessfully completed");
    	   notifyAll();
    	   
    	   
    }
}
