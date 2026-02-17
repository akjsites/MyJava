package nestedclass4type;

class mx
{
	class main
	{
		public  void run()
		{
			System.out.println("demo is running");
		}
	}
}
public class staticclass {

	public static void main(String[] args) {
		mx.main m1=new mx().new main();
		m1.run();
	}

}
