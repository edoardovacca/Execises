import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String givenText = input.nextLine();
		System.out.println();
		System.out.println(givenText.toLowerCase());
		System.out.println(givenText.toUpperCase());
		System.out.println(givenText.length() + " characters");
		input.close();
	}

}
