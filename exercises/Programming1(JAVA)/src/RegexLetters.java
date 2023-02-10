import java.util.Scanner;

public class RegexLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String givenText = input.nextLine();
		// if it contains only Finnish vowels or not
		// Finnish vowels: a, o, u, e, i, ä, ö, y, å
		//I also needed to add the upper case Å, Ä, Ö
		if (givenText.matches("(?i)[aeiouyåäöÅÄÖ]{1,}") == false) {
			System.out.println("Not only vowels!");
		} else {
			System.out.println("Vowels only");
		}
		input.close();
	}
}