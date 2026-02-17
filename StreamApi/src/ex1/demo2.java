package ex1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo2 {

	public static void main(String[] args) {
		IntStream.iterate(1, n->n+2).map(n->n*n).limit(10).forEach(System.out::println);
        
	}
	

}
