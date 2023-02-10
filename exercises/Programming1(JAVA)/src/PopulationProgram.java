import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		// get population of the three areas
		System.out.print("Enter the population of the area A: ");
		int areaA = Integer.parseInt(input.nextLine());
		System.out.print("Enter the population of the area B: ");
		int areaB = Integer.parseInt(input.nextLine());
		System.out.print("Enter the population of the area C: ");
		int areaC = Integer.parseInt(input.nextLine());
		// get total population
		double sum = areaA + areaB + areaC;
		// print answer
		System.out.println("\nA: " + oneDecimal.format(areaA * 100 / sum) + " %");
		System.out.println("B: " + oneDecimal.format(areaB * 100 / sum) + " %");
		System.out.println("C: " + oneDecimal.format(areaC * 100 / sum) + " %");
		input.close();
	}

}