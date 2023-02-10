import java.util.Random;
import java.util.Scanner;

public class RandomProgram {
	static Random randomizer = new Random(); // Do NOT change this line of code!

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = randomizer.nextInt(100); // Do NOT change this line of code!
		// Write your own code below ...
		System.out.print("Guess a number (0-99): ");
		int givenNumber = Integer.parseInt(input.nextLine());
		while (givenNumber != number) {
			if (givenNumber > number) {
				System.out.println("The correct number is smaller!");
			} else {
				System.out.println("The correct number is larger!");
			}
			System.out.println();
			System.out.print("Guess again: ");
			givenNumber = Integer.parseInt(input.nextLine());
		}
		System.out.println("Correct!");
		input.close();
	}

}