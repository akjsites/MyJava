package practiceArray;

import java.util.Arrays;

public class sorting {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 3, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
