import java.text.DecimalFormat;
import java.util.Scanner;

public class BeachVolleyball {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter the number of people: ");
		int people = Integer.parseInt(input.nextLine());
		System.out.print("Enter the hourly rate: ");
		double hourlyRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the length of the rental (hours): ");
		int rental = Integer.parseInt(input.nextLine());
		System.out.println("\nEach of the " + people + " people should pay "
				+ twoDecimals.format(hourlyRate * rental / people) + " euros.");
		input.close();

	}

}
