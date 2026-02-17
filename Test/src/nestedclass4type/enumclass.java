package nestedclass4type;
interface vechile
{
	void run();
}
class main
{
	public void run()
	{
		
		vechile v1=new vechile()
				{
			      public void run()
			      {
			    	  System.out.println("vechile is run ");
			      }
				};
				v1.run();
	}
}
public class enumclass {

	public static void main(String[] args) {
		main m1=new main();
		m1.run();

	}

}
