package objectclonearraylist;

import java.util.ArrayList;

record emp(int id) implements Cloneable
{
	
}
public class objectclonearraylist {

	public static void main(String[] args) {
		ArrayList<emp> in=new ArrayList<>();
		in.add(new emp(1));
		in.add(new emp(2));
		in.add(new emp(3));
		
		ArrayList<emp> x=(ArrayList<emp>)in.clone();
		
		
		
		ArrayList<emp> emps=new ArrayList<>(x);
		System.out.println(emps);
	}

}
