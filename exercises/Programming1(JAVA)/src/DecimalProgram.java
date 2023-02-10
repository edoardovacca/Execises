import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		DecimalFormat sixDecimals = new DecimalFormat("0.000000");
		System.out.print("Enter a decimal number: ");
		double firstNumber = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter a decimal number: ");
		double secondNumber = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println("\n" + twoDecimals.format(firstNumber) + " * " + twoDecimals.format(secondNumber) + " = "
				+ twoDecimals.format(firstNumber * secondNumber));
		System.out.println(twoDecimals.format(firstNumber) + " * " + twoDecimals.format(secondNumber) + " = "
				+ sixDecimals.format(firstNumber * secondNumber));
		input.close();
	}

}
