package productcomparater;

import java.util.Arrays;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		productcomparater []p= {new productcomparater(444, "xxx", 565656),new productcomparater(111, "AAA", 222222),new productcomparater(674, "ddd", 2111)};
	
			
		
		Arrays.sort(p,(p1,p2)->p1.name().compareTo(p2.name()));
		for(productcomparater d: p)
		{
			System.out.println(d);
		}
		System.out.println("9999999999999999999999999999999999999999999999999");
		Arrays.sort(p,(p1,p2)->Integer.compare(p1.id(), p2.id()));
		for(productcomparater d: p)
		{
			System.out.println(d);
		}
		System.out.println("4444444444444444444444444444444444444444444444444");
		Arrays.sort(p,(p1,p2)->Double.compare(p1.price(), p2.price()));
		for(productcomparater d: p)
		{
			System.out.println(d);
		}

	}

}
