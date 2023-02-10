import java.util.Scanner;

public class StringsSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String givenText = input.nextLine();
		givenText = removeExtraSpace(givenText);
		System.out.println('"' + givenText + '"');
		input.close();
	}

	private static String removeExtraSpace(String givenString) {
		// trim to get rid of whitespace in front and at the end,
		// then replace every other whitespace with a single space
		givenString = givenString.trim().replaceAll("\\s{2,}", " ");
		return givenString;
	}
}
