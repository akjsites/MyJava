package Thtreading.class7;
class demo 
{
	private int seat=3;
	private int re;
	public demo(int re)
	{
		this.re=re;
	}
	public synchronized void run()
	{
		synchronized (this) {
			if(seat>=re) {
				System.out.println(Thread.currentThread().getName());
				seat=seat-re;
				
				}
				else {
				System.err.println(Thread.currentThread().getName()+" lost");	
				}
		}
	}
}
public class demo1 {

	public static void main(String[] args) {
		demo demo=new demo(1);
		Runnable runnable=()->{demo.run();};
		new Thread(runnable,"scott").start();
		new Thread(runnable,"hyrd").start();
		new Thread(runnable,"erws").start();
		new Thread(runnable,"alen").start();
		

	}

}
