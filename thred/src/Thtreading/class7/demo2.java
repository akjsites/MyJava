package Thtreading.class7;
class demox
{   
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class demo2 {

	public static void main(String[] args) {
		demox demox=new demox();
		Runnable r1=() ->{demox.run();};
		new Thread(r1).start();
		new Thread(r1).start();

	}

}
