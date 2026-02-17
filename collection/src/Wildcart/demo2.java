package Wildcart;

import java.util.List;

public class demo2 {
  public static void main(String[] args) {
	Integer []ar= {1,2,3,4,5,6};
	show(ar);
  }
  public static <T> void show(T []val)
  {
	  for(T n:val)
	  {
		  System.out.println(n);
	  }
  }
  
}
