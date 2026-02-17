package all;

import java.util.Iterator;

class thr extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
		Thread teThread=Thread.currentThread();
		 System.out.println(i+teThread.getName());
		}
		
	}
}
public class test1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println("main method stateds");
		}
		
        thr t1=new thr();
        t1.start();
        
        System.out.println("main method end");
        
        
        for(int i=1;i<=10;i++)
		{
        	    Thread teThread=Thread.currentThread();
            System.out.println(i+teThread.getName());
		}
	}

}
