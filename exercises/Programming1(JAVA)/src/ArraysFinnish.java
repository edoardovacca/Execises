import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = {"bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher"};
		String[] translations = {"bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja"};
		System.out.print("Enter an English word: ");
		String givenWord = input.nextLine();
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (givenWord.equals(words[i])) {
				System.out.println(translations[i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Unknown word");
		}
		input.close();
	}

}
