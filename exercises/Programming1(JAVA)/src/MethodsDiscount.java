import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsDiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter list price: ");
		double list = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter selling price: ");
		double selling = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.println();
		System.out.println("The discount percentage is " + twoDecimals.format(computePercentage(list, selling)) + " %");
		input.close();
	}

	private static double computePercentage(double listPrice, double sellingPrice) {
		return 100 - (sellingPrice * 100 / listPrice);
	}
}