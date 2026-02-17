package practiceArray;

import java.util.Arrays;

public class searhingArray {
	public static void main(String[] args) {

		Integer arr[] = { 5, 6, 4, 7, 7, 2, 5, 6, 2, 8, 1, 8 };

		searchingElement(7, arr);

	}

	public static void searchingElement(Integer sear, Integer... xs) {

		Arrays.asList(xs).stream().filter(s -> sear == s).forEach(s -> System.out.println(s));

	}
}
