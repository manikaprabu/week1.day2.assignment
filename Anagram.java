package day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int text1Size = text1.length();
		int text2Size = text2.length();
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		
		if (text1Size == text2Size) {
			System.out.println("both string having " +text1Size + " characters");
		}
		else {
			System.out.println("both are different size");
		}
for (int i = 0; i < text1Size; i++) {
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
//	if(charArray1==charArray2) {
//		//System.out.println("both array have same values & values are " +charArray1);
//		break;
//	}
//	else {
//		System.out.println("both have differen values");
//	}
}
if(charArray1==charArray2) {
	System.out.println("both string having " +text1Size + " characters");
	}
	else {
		System.out.println("both are different size");

}
//System.out.println("both array have same values & values are " +charArray1);
System.out.println(charArray1);
System.out.println(charArray2);
	//for (int j = 0; j < text1Size; j++) {
//		Arrays.sort(charArray2);
//		if(charArray1[i] == charArray2[j]) {
//			Arrays.sort(charArray2);
//		}
	}
	
	

	}


