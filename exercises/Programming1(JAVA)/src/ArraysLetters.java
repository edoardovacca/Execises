import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		
		String[] newArray = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C"};
		System.out.print("Enter letter: ");
		String givenLetter = input.nextLine();
		int count = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i].equals(givenLetter)) {
				count++;
			}
		}
		double percentage = ((count * 100.0) / newArray.length);
		System.out.println();
		System.out.println(oneDecimal.format(percentage) + " %");
		input.close();
	}

}
