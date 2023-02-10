import java.util.Scanner;

public class StringsDecimalPart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		//replace gets rid of dot/comma differences
		String givenDecimal = input.nextLine().replace(',', '.');
		if (givenDecimal.matches("[0-9]{1,}\\.[0-9]{1,}") == true) {
			int indexSeparator = givenDecimal.indexOf('.');
			//indexSeparator needs a + 1 because iteration starts at zero
			System.out.println((givenDecimal.length() - (indexSeparator + 1)) + " decimal place(s)");
		} else {
			System.out.println("Please enter a proper decimal number");
		}
		input.close();
	}
}
