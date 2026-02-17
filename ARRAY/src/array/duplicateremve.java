package array;

import java.util.Arrays;
import java.util.Iterator;

public class duplicateremve {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 6, 5 };
		int v = 0;
		for (int i = 0; i < arr.length; i++) {
		  boolean isavil=false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					
					isavil=true;
					break;
				}
				
                
			}
			if(!isavil)arr[v++]=arr[i];

		}
		for (int i = 0; i < v; i++) {
			System.out.println(arr[i]);
		}
		

	}
}
