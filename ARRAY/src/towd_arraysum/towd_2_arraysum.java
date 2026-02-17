package towd_arraysum;

public class towd_2_arraysum {

	public static void main(String[] args) {
		int[][] array = { { 1, 1, 1 }, { 1,1,1}, };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				
			}
			System.out.println("The sum of all elements in the array is: " + sum);
			sum=0;
		}

		
		

	}

}
