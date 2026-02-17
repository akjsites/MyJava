package aswini_autocloseable;

import java.io.Closeable;

class demo implements AutoCloseable
{
	public void close() throws Exception 
	{
	}
}
public class aswini_autocloseable {

	public static void main(String[] args) {
		try(demo d=new demo())
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
