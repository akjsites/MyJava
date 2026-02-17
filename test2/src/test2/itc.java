package test2;



class mythread implements Runnable
{

	@Override
	public synchronized void run() {
		diposite();
	}
	
	public void diposite()
	{
		System.out.println("hello");
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("completed");
	}
	public void withdraw()
	{
		System.out.println("hii");
		notify();
	}
}
public class itc {

	public static void main(String[] args) throws InterruptedException {
		Thread mythread =new Thread(new mythread());
		mythread.start();
		
         
	}

}
