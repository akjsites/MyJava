package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record std(String name) {}
public class ex7 {

	public static void main(String[] args) {
		std s1=new std("aswini");
		std s2=new std("xsqwe");
		std s3=new std("lhajs");
		
		
		List<Character> e = Stream.of(s1,s2,s3).map(h->h.name().toUpperCase().charAt(0)).collect(Collectors.toList());
          System.out.println(e);
	}

}
