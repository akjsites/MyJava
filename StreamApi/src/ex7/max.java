package ex7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class max {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,1,5,3,1,6,2,4,8,9,4);
		Optional<Integer> first = asList.stream().distinct().sorted(Comparator.reverseOrder()).skip(4).findFirst();
        first.ifPresent((n)->System.out.println(n));
	}

}
