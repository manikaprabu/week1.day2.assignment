package day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
	String data = "madams";
	String reverse = "";
	//data.re
	int lengthStr = data.length();
	char[] charArray = data.toCharArray();
	for (int i = lengthStr-1; i >=0; i--) {
		reverse = reverse + charArray[i];
		//System.out.println(reverse);
	}
if(reverse.equals(data)) {
	System.out.println(data + " is an palindrome");
}
else {
	System.out.println(data + " is an not palindrome");
}
	}

}
