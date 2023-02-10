import java.util.Scanner;

public class MethodsTriplex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int givenNumber = Integer.parseInt(input.nextLine());
		int count = 1;

		for (int i = 1; i <= givenNumber; i++) {
			for (int j = 1; j <= i; j += 3) {
				if (triplex(i) == true) {
					count = 1 * j;
				}
			}
			System.out.println("triplex(" + i + ") = " + count);
		}
		input.close();
	}

	private static boolean triplex(int positive) {
		int triplex = 1;
		for (int i = 1; i < positive; i += 3) {
			triplex = triplex * i;
		}

		if (positive < 1) {
			return false;
		} else if (triplex % positive == 0) {
			return true;
		} else {
			return false;
		}

	}
}
