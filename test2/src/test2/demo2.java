package test2;
class dx implements  Runnable
{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name);	
			if(name.equals("name1"))
					{
				Thread.yield();
				
					}
			
		}
	}
}
public class demo2 {
    public static void main(String[] args) {
		dx dx=new dx();
	  Thread thread=new Thread(dx,"name1");
	  Thread thread1=new Thread(dx,"name2");
	  thread.start();
	  thread1.start();
     }
}
