import java.util.Arrays;
import java.util.Scanner;

public class StringsAnagramOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String firstText = input.nextLine();
		System.out.print("Enter second string: ");
		String secondText = input.nextLine();
		if (isAnagram(firstText, secondText) == true) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram");
		}
		input.close();

	}

	private static boolean isAnagram(String firstGiven, String secondGiven) {
		// if it has non approved characters then return false immediately
		// if any of the two strings not have at least one of the following: letters,
		// whitespace, dot, comma, semicolon then return false
		if (firstGiven.matches("[A-zÅÄÖåäö\\s,.;]{1,}") == false
				|| secondGiven.matches("[A-zÅÄÖåäö\\s,.;]{1,}") == false) {
			return false;
		}
		// remove each non letter character from both strings
		// make them both lower case
		// make each string a character array so they can be sorted
		char[] firstArr = firstGiven.replaceAll("[^A-zÅÄÖåäö]", "").toLowerCase().toCharArray();
		char[] secondArr = secondGiven.replaceAll("[^A-zÅÄÖåäö]", "").toLowerCase().toCharArray();
		Arrays.sort(firstArr);
		Arrays.sort(secondArr);
		// check if both arrays contain the same characters, if not return false
		// you check if the length is > 0 to see if there are any letters,
		// or if the string was only made by white spaces, dots, commas, semicolons
		if (firstArr.length > 0) {
			for (int i = 0; i < firstArr.length; i++) {
				if (firstArr[i] != secondArr[i]) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
}
