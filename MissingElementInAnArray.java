package day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array
				Arrays.sort(arr);
			//	System.out.println("sort list " );
			//	System.out.println("sorted array list");	
				for (int i = 0; i < arr.length; i++) {
					//System.out.println(arr[i]);
					int j = i+1;
					if(arr[i] != j) {
						System.out.println("Iterative value is "+ j);
						break;
					}
					
				}
			
	}

}
