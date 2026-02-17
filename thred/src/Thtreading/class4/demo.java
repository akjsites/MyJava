package Thtreading.class4;
class mythread 
{

	double balance =0.0;
	
	
	
	public synchronized void widrawbalance(double bal) throws InterruptedException
	{
		if(balance<=0.0)
		{
			System.out.println("wait...");
			wait();
			
			
		}
		Thread.sleep(2000);
		System.out.println("withdraw amount Balance : "+bal);
		System.out.println("Availeble Balance : "+(this.balance-bal));
	}
	public synchronized void depositebal(double bal) throws InterruptedException
	{
		Thread.sleep(2000);
		this.balance+=bal;
		System.out.println("deposite sucessfully");
		notify();
		
	}
	
	
	
}
public class demo {

	public static void main(String[] args) throws InterruptedException {
		mythread m=new mythread(); 
		new Thread(new Runnable() {
			public void run() {
				try {
					m.widrawbalance(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				try {
					m.depositebal(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
		
	}

}
