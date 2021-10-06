package day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			//System.out.println("charArray[" + i + "]: " + charArray[i]);
			int j = i+2;
			if(j%2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				
			}

			System.out.println("charArray[" + i + "]: " + charArray[i]);
		}
		char[] value = charArray;
		System.out.println(charArray);
		

	}
}
