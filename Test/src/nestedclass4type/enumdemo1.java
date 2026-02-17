package nestedclass4type;
interface industry
{
	void work();
}
class bigindustry
{
	public static industry main()
	{
		industry i1=new industry() 
		{
			public void work()
			{
				System.out.println("industry working");
			}
		};
		return i1;
	}
}
public class enumdemo1 {

	public static void main(String[] args) {
		industry x=bigindustry.main();
		x.work();
	}

}
