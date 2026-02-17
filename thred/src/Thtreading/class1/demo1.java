package Thtreading.class1;

class mythread extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
}
public class demo1 {

	public static void main(String[] args) {
		new mythread().start();

	}

}
