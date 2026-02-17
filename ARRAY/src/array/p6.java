package array;

import java.util.Arrays;

public class p6 {

	public static void main(String[] args) {
		

		 {
		    int arr[] = {1, 2, 3, 2, 4, 2, 5, 3, 1};
		    int n = 9;

		    for(int i = 0; i < n; i++) {
		        if(arr[i] == -1) continue; 

		        int count = 1;
		        for(int j = i + 1; j < n; j++) {
		            if(arr[i] == arr[j]) {
		                count++;
		                arr[j] = -1; 
		            }
		        }

		         System.out.println( arr[i] +" "+ count);
		    }

		
		}


	}

}
