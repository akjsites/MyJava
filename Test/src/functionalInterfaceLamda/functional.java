package functionalInterfaceLamda;
@FunctionalInterface
interface bird
{
	void main();
}
class parrot implements bird
{
	public void main()
	{
		System.out.println("hello");
	}
}
public class functional {

	public static void main(String[] args) {
		bird b1=()->System.out.println("Aswini");
		b1.main();
	}

}
