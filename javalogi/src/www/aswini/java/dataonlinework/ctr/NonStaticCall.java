package www.aswini.java.dataonlinework.ctr;

public class NonStaticCall {

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		main();
	}
	static void main()
	{
		System.out.println("hell");
	}
}
