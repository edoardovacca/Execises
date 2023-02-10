import java.util.Scanner;

public class ValidateAnswer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is 2 + 3? ");
		// initialize entered string
		// (it will be parsed into an integer later to trigger the exception)
		String givenText = input.nextLine();
		int givenNumber = 0;

		// until the answer is not 5
		while (givenNumber != 5) {
			// check if it is an integer, if so check if it is 5
			// if !=5 start another round of the loop
			try {
				givenNumber = Integer.parseInt(givenText);
				if (givenNumber != 5) {
					System.out.print("Incorrect! Try again: ");
					givenText = input.nextLine();
				}
				// if input is not an integer then give error message
				// start another round of the loop
			} catch (NumberFormatException nfe) {
				System.out.print("That is not a number! Try again: ");
				givenText = input.nextLine();
			}
		}
		// if the input is a number and is equal to five (see the while loop)
		// then print that the answer is correct
		System.out.println("Correct!");
		input.close();
	}
}
