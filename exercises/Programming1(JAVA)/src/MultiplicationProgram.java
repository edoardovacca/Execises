import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		BigDecimal x = new BigDecimal(input.nextLine().replace(',', '.'));
		System.out.print("Enter y: ");
		BigDecimal y = new BigDecimal(input.nextLine().replace(',', '.'));
		System.out.println("\n" + x + " * " + y + " = " + x.multiply(y));
		input.close();
	}

}
