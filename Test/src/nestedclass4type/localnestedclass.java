package nestedclass4type;
class demo
{
	public static void run()
	{
		class dx
		{
		   public void rx()
		   {
			   System.out.println("demo is running");
		   }
		}
		dx d1=new dx();
		d1.rx();
	}
}
public class localnestedclass {

	public static void main(String[] args) {
		demo.run();

	}

}
