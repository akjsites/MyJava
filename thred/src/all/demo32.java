package all;

import java.util.Iterator;

class demo1 extends  Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class demo32 {
   public static void main(String[] args) throws InterruptedException {
	demo1 demo1=new demo1();
	demo1 demo2=new demo1();
	
	demo1.start();
	
	demo2.start();
	
	
	demo1.join();
	System.out.println("end");
}
}
