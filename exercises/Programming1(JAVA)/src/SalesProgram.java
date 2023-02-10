import java.util.Scanner;

public class SalesProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter price: ");
		int price = Integer.parseInt(input.nextLine());
		System.out.print("Enter product name: ");
		String product = input.nextLine();
		System.out.print("Enter discount: ");
		int discount = Integer.parseInt(input.nextLine());
		int finalPrice = price - discount;
		System.out.println("\nThe selling price of a " + product + " is " + finalPrice + " euros.");
		input.close();
	}
}
