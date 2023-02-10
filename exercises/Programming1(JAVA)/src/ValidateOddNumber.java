import java.util.Scanner;

public class ValidateOddNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an odd number: ");
		String givenText = input.nextLine();
		try {
			int givenNumber = Integer.parseInt(givenText);
			if (givenNumber % 2 != 0) {
				System.out.println();
				System.out.println("Ok");
			} else {
				System.out.println();
				System.out.println(givenNumber + " is not an odd number");
			}
		} catch (NumberFormatException nfe) {
			System.out.println();
			System.out.println("\'" + givenText + "\' is not an integer");
		}
		input.close();
	}

}