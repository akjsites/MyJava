package Thtreading.class4;
class my{
	int seat=4;
	public synchronized void book(int num) throws InterruptedException
	{
		if(num>seat)
		{
			System.out.println("Seat Is Not Avilable...");
			wait();
		}
		
		this.seat-=num;
		System.out.println("Seat Booked "+num);
		System.out.println("Availeble Seat "+this.seat);
	}
	public synchronized void release(int num) throws InterruptedException
	{
		Thread.sleep(2500);
		System.out.println("added "+num);
		this.seat+=num;
		System.out.println("total "+this.seat);
		
		
		notifyAll();
	}
}
public class demo1 {

	public static void main(String[] args) {
		my a=new my();
		int []num= {1,3,5};
		for(int n:num)
		{
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						a.book(n);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
		}
		int []num1= {3,1,3};
		for(int n:num1)
		{
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						a.release(n);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
		}

	}

}
