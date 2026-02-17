package ex4;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex4 {

	public static void main(String[] args) {
       String name[]= {"zswini","gmit","alex"};
       Arrays.sort(name,String::compareTo);
       System.out.println(Arrays.toString(name));
	}

}
