package day2.assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				
				char[] charArray = test.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					if(Character.isDigit(charArray[i])) {
						num = num +1 ;
					}
					else if (Character.isLetter(charArray[i])) {
						letter = letter +1 ;
					}
					else if (Character.isSpaceChar(charArray[i])) {
						space = space +1 ;
					}
					else {
						specialChar = specialChar +1 ;
						
					}
				
				}
				// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);


	}

}
