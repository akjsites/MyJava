package propageted;

public class propageted {

	public static void main(String[] args) {
		try
		{
			m1();
		}
		catch(Exception e)
		{
			System.out.println("not");
		}

	}
	public static void m1() throws Exception
	{
		m3();
	}
	public static void m3() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}
