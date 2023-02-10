import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get first number as a string then convert it to an integer
		System.out.print("Enter an integer: ");
		String firstString = input.nextLine();
		int firstInteger = Integer.parseInt(firstString);
		// get second number as a string then convert it to an integer
		System.out.print("Enter another integer: ");
		String secondString = input.nextLine();
		int secondInteger = Integer.parseInt(secondString);
		// get decimal number as a string then convert it to a double
		System.out.print("Enter a decimal number: ");
		String decimalString = input.nextLine().replace(',', '.');
		double decimalDouble = Double.parseDouble(decimalString);
		// print the answer
		System.out.println("\n" + firstString + " * " + secondString + " = " + firstInteger * secondInteger);
		System.out.println(firstString + " * " + decimalString + " = " + firstInteger * decimalDouble);
		System.out.println(decimalString + " * " + decimalString + " = " + decimalDouble * decimalDouble);
		input.close();
	}

}
