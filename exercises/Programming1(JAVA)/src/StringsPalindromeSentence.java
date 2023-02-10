import java.util.Arrays;
import java.util.Scanner;

public class StringsPalindromeSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String givenText = input.nextLine();
		if (isPalindrome(givenText) == true) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("No palindrome");
		}
		input.close();
	}

	private static boolean isPalindrome(String text) {
		// checks for approved characters
		if (text.matches("[A-zÅÄÖåäö\\s,.;?!'\"-]{1,}") == false) {
			return false;
		}
		// gets rid of non-letter characters makes them all lower case
		text = text.replaceAll("[^A-zÅÄÖåäö]", "").toLowerCase();
		// create two substring made of the first and second half of the parameter
		String firstPart = "";
		String secondPart = "";
		if (text.length() % 2 == 0) {
			firstPart = text.substring(0, text.length() / 2);
			secondPart = text.substring(text.length() / 2);
		} else {
			firstPart = text.substring(0, (text.length() / 2) + 1);
			secondPart = text.substring(text.length() / 2);
		}
		char[] first = firstPart.toCharArray();
		char[] second = secondPart.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		if (first.length > 0) {
			for (int i = 0; i < firstPart.length(); i++) {
				if (first[i] != second[i]) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
}
