package Thtreading.class6;
class demo implements Runnable
{
	public void run()
	{
		
	}
}
public class demo1 {

	public static void main(String[] args) {
	     Runnable r=()->
	     {
	    	     System.out.println("hello");
	     };
	     Thread thr=new Thread(r,"g");
	     thr.start();

	}

}
