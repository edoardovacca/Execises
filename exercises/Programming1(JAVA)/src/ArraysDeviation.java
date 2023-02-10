import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		System.out.print("Enter the number of values: ");
		int values = Integer.parseInt(input.nextLine());
		if (values < 4) {
			System.out.println("Sorry, at least 4 values required");
		} else {
			int[] numbersArray = new int[values];

			for (int i = 0; i < values; i++) {
				System.out.print("Enter an integer: ");
				numbersArray[i] = Integer.parseInt(input.nextLine());
			}
			System.out.println();
			System.out.println("n = " + numbersArray.length);
			System.out.println("Min: " + ArraysLibrary.min(numbersArray));
			System.out.println("Max: " + ArraysLibrary.max(numbersArray));
			System.out.println("Mean: " + oneDecimal.format(ArraysLibrary.mean(numbersArray)));
			System.out.println("Median: " + oneDecimal.format(ArraysLibrary.median(numbersArray)));
			System.out.println("Sample standard deviation: " + oneDecimal.format(ArraysLibrary.standardDeviation(numbersArray)));
			System.out.print("Sample data: ");
			for (int i = 0; i < numbersArray.length; i++) {
				System.out.print(numbersArray[i] + " ");
			}
		}
		input.close();
	}
}
