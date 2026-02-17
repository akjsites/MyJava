package test2;

import java.lang.reflect.Field;

class demo
{
	public static int number;
	int xyz;
}
public class getallfildmethods {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cls=Class.forName("test2.demo");
		Field[] field=cls.getDeclaredFields();
         for(Field fie:field)
         {
        	 System.out.println(fie.getName());
         }
	}

}
