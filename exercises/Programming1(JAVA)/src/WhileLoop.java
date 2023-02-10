import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = "";

		System.out.print("Enter letters (empty ends): ");
		String letters = input.nextLine();

		
		//this loop ends when an empty input is entered 
		while (letters.length() > 0) {

			text += letters;

			System.out.print("Enter letters (empty ends: ");
			letters = input.nextLine();
		}
		System.out.println(text);

		input.close();
	}

}
