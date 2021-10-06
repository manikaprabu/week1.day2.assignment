package day2.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
				int[] data = {3,2,11,4,6,7};
				Arrays.sort(data);
				int length = data.length;
				System.out.println("Second largest in the array is " +data[length-2]);
	}

}
