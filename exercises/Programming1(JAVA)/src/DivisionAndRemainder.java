import java.util.Scanner;

public class DivisionAndRemainder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = Integer.parseInt(input.nextLine());
		System.out.print("Enter y: ");
		int y = Integer.parseInt(input.nextLine());

		if (x % 2 == 0) {
			System.out.println("\n" + x + " is even");
		} else {
			System.out.println("\n" + x + " is odd");
		}
		if (y % 2 == 0) {
			System.out.println(y + " is even");
		} else {
			System.out.println(y + " is odd");
		}
		System.out.println("The remainder of " + x + " / " + y + " is " + x % y);
		System.out.println("The remainder of " + y + " / " + x + " is " + y % x);
		input.close();
	}

}
