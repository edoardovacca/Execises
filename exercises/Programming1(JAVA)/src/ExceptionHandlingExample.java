import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// this is a variable with a global scope
		String text = "";

		// try block then catch block
		try {
			System.out.print("Enter a double: ");
			//this gives a new value to the global variable text (the new value is the user input)
			text = input.next();
			//a new variable x is text parseDouble (in this case)
			double x = Double.parseDouble(input.nextLine());

			System.out.println("x is" + x);
		} catch (NumberFormatException nfe) {
			//this uses the global variable text
			System.out.println(text + "is not a valid number");
			// System.out.println(nfe.getMessage());
		}
		input.close();
		// this crashes when a ten is input instead of 10 for example
		// user enters invalid data

	}

}
