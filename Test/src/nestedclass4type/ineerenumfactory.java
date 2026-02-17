package nestedclass4type;

interface car {
     void run();
}
class enjine
{
	public static  car enjineget()
	{
		car c1= new car()
				{
			      public void run()
			      {
			    	  System.out.println("car is running");
			      }
				};
		return c1;
	}
}
public class ineerenumfactory
{
	public static void main(String []args)
	{
		car c1=enjine.enjineget();
//		car c1=enjine.enjineget();
		c1.run();
	}
}