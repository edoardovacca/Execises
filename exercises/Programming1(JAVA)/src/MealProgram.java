import java.text.DecimalFormat;
import java.util.Scanner;

public class MealProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		// get price of food
		System.out.print("Enter the price of food: ");
		double food = Double.parseDouble(input.nextLine().replace(',', '.'));
		// get tax percentage
		System.out.print("Enter the tax rate: ");
		double tax = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;
		// get tip percentage
		System.out.print("Enter the tip percentage: ");
		double tip = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;
		// print answer
		System.out.println("\nThe total cost is " + twoDecimals.format(food + (food * tax) + (food * tip)));
		input.close();
	}

}
