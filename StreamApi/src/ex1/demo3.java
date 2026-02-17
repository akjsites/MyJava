package ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo3 {

	public static void main(String[] args) {
		int []num= {3,2,1,4,6,7};
		int[] array = Arrays.stream(num)
				.boxed()
				      .sorted(Comparator.naturalOrder())
				              .mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(array));

	}

}
