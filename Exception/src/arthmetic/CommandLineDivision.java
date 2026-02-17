package arthmetic;

public class CommandLineDivision {

	public static void main(String[] args) {
		try {
		int a=Integer.parseInt(args[0]);
		
		int b=Integer.parseInt(args[1]);
		if(a<=0 && b<=0)
		{
			throw new NumberFormatException();
		}
		System.out.println(a/b);
	}
		catch (Exception e) {
			if(e instanceof IllegalArgumentException)
			{
				System.out.println(e.toString()+"IllegalArgumentException");
			}
			else if(e instanceof NumberFormatException)
			{
				System.out.println(e.toString()+"NumberFormatException");
			}
			else if(e instanceof ArithmeticException)
			{
				System.out.println(e.toString()+"ArithmeticException");
			}
		}
	}

}
//IllegalArgumentException
//NumberFormatException
//ArithmeticException