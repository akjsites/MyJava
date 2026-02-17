package ex6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ex6 {
       public static void main(String[] args) {
		String g[]= {"a","d","e","w","y","u"};
		String collect = Arrays.asList(g).stream().collect(Collectors.joining("#"));
		System.out.println(collect);
	}
}
