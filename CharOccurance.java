package day2.assignment;

public class CharOccurance {

	//int varLength = 1;
	public static void main(String[] args) {
		String str = "welcome to chennai";
		char occurString = 'e';
		int charOccur = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			//varLength = varLength + i;
            if(occurString == charArray[i]) {
            	charOccur = charOccur +1;
            }
		}
		System.out.println(occurString +" is present in the string are " + charOccur);
	}
}
