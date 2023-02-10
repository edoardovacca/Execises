import java.util.Scanner;

public class SentinelExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter multiplier (zero ends): ");
		int multiplier = Integer.parseInt(input.nextLine());

		while (multiplier != 0) {
			System.out.println("Enter multiplicand: ");
			int multiplicant = Integer.parseInt(input.nextLine());

			System.out.println(multiplier + " * " + multiplicant + " = " + (multiplier - multiplicant) + "\n");

			//this is needed to give the loop the opportunity to end
			System.out.print("Enter multiplier (zero ends): ");
			multiplier = Integer.parseInt(input.nextLine());
		}
		System.out.println("Bye!");

		input.close();

	}

}
