import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter initial deposit: ");
		Double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter time period in full years: ");
		int years = Integer.parseInt(input.nextLine());
		System.out.print("Enter interest rate (%): ");
		Double interestRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;
		System.out.print("Enter capital income tax rate (%): ");
		Double incomeTaxRate = Double.parseDouble(input.nextLine().replace(',', '.')) / 100;
		Double total = deposit;

		System.out.println();

		for (int i = 1; i <= years; i++) {
			//add to total the yearly income from the interest
			total += (total * interestRate); 
			//print interest as (total - deposit) and then print total
			System.out
					.println("Year " + i + ": " + twoDecimals.format(total - deposit) + " | " + twoDecimals.format(total));
		}
		//get income after tax, 1 - incomeTaxRate is to get the % of what remains to you
		Double finalIncome = (total - deposit) * (1 - incomeTaxRate);
		System.out.println();
		System.out.println("The interest after tax is " + twoDecimals.format(finalIncome));
		System.out.println("The remaining balance after tax is " + twoDecimals.format(deposit + finalIncome));
		input.close();
	}
}