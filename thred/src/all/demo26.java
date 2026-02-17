package all;
class demo extends Thread
{
	public void run()
	{
		System.out.println("run");
	}
}
public class demo26 {
    public static void main(String[] args) throws InterruptedException {
		System.out.println("main started");
		demo d1=new demo();
		d1.start();
	    Thread.sleep(2000);
	    System.out.println("main method ended");
	    
	}
}
