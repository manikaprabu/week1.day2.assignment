package day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arrValue1 = {3,2,11,4,6,7};
		int[] arrValue2 = {1,2,8,4,9,7};
		for (int i = 0; i < arrValue1.length; i++) {
			for (int j = 0; j < arrValue2.length; j++) {
				if(arrValue1[i]==arrValue2[j])
					System.out.println("same values in the array are " + arrValue1[i]);
			}
			
		}
	}

}
