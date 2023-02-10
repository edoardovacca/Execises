import java.util.Scanner;

public class StringBling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String givenText = input.nextLine();
		String longest = givenText;
		int count = 0;

		while (!givenText.equals("stop")) {
			if (givenText.length() > longest.length()) {
				longest = givenText;
			}
			System.out.print("Enter next string: ");
			givenText = input.nextLine();
			count++;
		}

		if (count > 0) {
			System.out.println();
			System.out.println('\'' + longest + '\'');
		} else {
			System.out.println();
			System.out.println("Nothing to be printed");
		}
		input.close();
	}
}