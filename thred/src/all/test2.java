package all;
class demo extends Thread
{
	@Override
	public void run() {
	Thread xThread=Thread.currentThread();
	System.out.println(xThread.getName());
	}
	
	
}
public class test2 {

	public static void main(String[] args) {
		for(int i=1;i<=2;i++)
		{
		demo demo=new demo();
		System.out.println(demo.isAlive());
		demo.start();
		System.out.println(demo.isAlive());
		}
	}

}
