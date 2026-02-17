package ParentclassMethodOverriding;

public class ChildClass extends Parentclass{
	
	public void loadingClass(String x) throws ClassNotFoundException
    {
		try
		{
			new Parentclass().loadingClass(x);
			System.out.println("class  loaded sucessfully");
		}
		catch(Exception e)
		{
			 if(e instanceof IllegalArgumentException)
			{
				System.out.println("ClassNotFoundException");
			}
		}
    }
}
