import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = input.nextLine();

		if (word == "hello") {
			System.out.println("You entered 'hello'");
		} else {
			System.out.println("You did not enter 'hello'");
			System.out.println("Instead, you entered '" + word + "'");
		}
		input.close();
	}
 
}
