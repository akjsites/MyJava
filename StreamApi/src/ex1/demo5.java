package ex1;

import java.util.Optional;

public class demo5 {
     public static void main(String[] args) {
		String name="ghelo";
		Optional<String> d = Optional.ofNullable(name);
		String orElse = d.orElse("not availeble");
		System.out.println(orElse);
	    String string = d.get();
	    System.out.println(string);
	    boolean present = d.isPresent();
	    System.out.println(present);
	    
	    
	}
}
