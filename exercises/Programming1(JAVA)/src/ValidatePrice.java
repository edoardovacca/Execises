import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidatePrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price before VAT: ");
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		try {
			double price = Double.parseDouble(input.nextLine().replace(',', '.'));
			double vat = 0.25;
			System.out.println();
			System.out.println("The VAT inclusive price is " + twoDecimals.format(price + (price * vat)));
		} catch (NumberFormatException nfe) {
			System.out.println();
			System.out.println("Invalid price!");
		}
		input.close();
	}

}
