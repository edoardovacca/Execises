import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTravel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter the number of train trips: ");
		int trips = Integer.parseInt(input.nextLine());
		System.out.print("Enter the single ticket price: ");
		double singlePrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the monthly season ticket price: ");
		double monthlyPrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		double total = singlePrice * trips;
		// which one is cheaper? need total cost and then check if it smaller than the
		// monthly ticket
		if (total == monthlyPrice) {
			System.out.println("\nThe total cost is the same.");
		} else if (total < monthlyPrice) {
			System.out.println(
					"\nBuying single tickets is " + twoDecimals.format(monthlyPrice - total) + " euros cheaper.");
		} else {
			System.out.println("\nBuying a monthly season ticket is " + twoDecimals.format(total - monthlyPrice)
					+ " euros cheaper.");

		}

		input.close();

	}

}
