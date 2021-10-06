package day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
Calculator obj = new Calculator();
float divideResult = obj.divide();
double  multipleResult = obj.muliple();
int  sumResult = obj.sum();
int  subResult = obj.subtract();
System.out.println("Addition result is " + sumResult);
System.out.println("Subtract result is " + subResult);
System.out.println("Multiple result is " + multipleResult);
System.out.println("Divide result is " + divideResult);
	}

}
