package lamdeplus;

public class lamdeplus {

	public static void main(String[] args) {
		//array sum using lambda expression
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println("Sum of array using lambda expression: " + sum);
		

	}

}
