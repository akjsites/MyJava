package Wildcart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class wildcartDemo1 {
      public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<>();
		n.add(12);
		n.add(34);
		n.add(42);
	System.out.println(getdata(n));
	}
      public static int getdata(List l)
      {
    	 
    	  int sum=0;
    	      Iterator<Integer> iterator=l.iterator();
    	      while(iterator.hasNext())
    	      {
    	    	       sum+=iterator.next();
    	      }
    	      return sum;
      }
}
