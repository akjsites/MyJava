package streamPra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamPra {

	public static void main(String[] args) {

		int []num= {1,1,200,3,46,5,6,20};
		Optional<Integer> first = IntStream.of(num).boxed().sorted((w,ww)->Integer.compare(ww, w)).skip(5).findFirst();
	    first.ifPresent(s->System.out.println(s));
	}

}
