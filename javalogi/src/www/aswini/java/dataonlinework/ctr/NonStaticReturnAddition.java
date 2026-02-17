package www.aswini.java.dataonlinework.ctr;

public class NonStaticReturnAddition {

	
	public static void main(String a[]) 
	{
		nameof obj1=new nameof();
		int x=obj1.hex(100,200);
		System.out.println(x);
		
	}
	
}
class nameof
{
	public  int hex(int x,int y) 
	{
		return x+y;
	}
}
