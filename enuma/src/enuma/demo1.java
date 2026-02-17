package enuma;

enum color implements Runnable
{
	red(1),green(2),blue(4);
	int x;
	private color(int x)
	{
		this.x=x;
	}
	
	public void run()
	{
		System.out.println(x);
	}
}

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		color arr[]=color.values();
		for(color y :arr)
		{
			Thread.sleep(100);
			
		}

	}

}
