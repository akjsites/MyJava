package functionalinterface;

import java.util.function.Function;

public class functionapplymethod {

	public static void main(String[] args) {
//		Function<Integer,Boolean> p1=num->num%2==0;
//        System.out.println(p1.apply(12));
        
        Function<Integer,String> p1=num->
        {
        	if(num%2==0)
        	return "even";
        	else
        	{
        		return "odd";
        	}
        };
        System.out.println(p1.apply(12));
	}

}
