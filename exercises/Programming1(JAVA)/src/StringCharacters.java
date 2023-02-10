import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String givenText = input.nextLine();
		int letterCount = 0;
		int digitCount = 0;
		int otherCount = 0;
		for (int i = 0; i < givenText.length(); i++) {
			if (Character.isLetter(givenText.charAt(i)) == true) {
				letterCount++;
			} else if (Character.isDigit(givenText.charAt(i)) == true) {
				digitCount++;
			} else {
				otherCount++;
			}
		}
		System.out.println(letterCount + " letter(s)");
		System.out.println(digitCount + " digit(s)");
		System.out.println(otherCount + " other character(s)");
		input.close();
	}
}