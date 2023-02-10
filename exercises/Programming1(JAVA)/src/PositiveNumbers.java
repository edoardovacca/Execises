import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0".replace(',', '.'));
		System.out.print("Enter first integer: ");
		int givenNumber = Integer.parseInt(input.nextLine());
		if (givenNumber == 0) {
			System.out.println();
			System.out.println("No positive values");
		} else {
			double sum = 0;
			int count = 0;
			while (givenNumber != 0) {
				if (givenNumber > 0) {
					sum += givenNumber;
					count++;
				}
				System.out.print("Enter next integer: ");
				givenNumber = Integer.parseInt(input.nextLine());
			}
			System.out.println();
			System.out.println("The average of the positive values is " + oneDecimal.format(sum / count));
		}
		input.close();
	}

}