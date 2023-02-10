import java.util.Scanner;

public class MethodsRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int first = Integer.parseInt(input.nextLine());
		System.out.print("Enter last value: ");
		int last = Integer.parseInt(input.nextLine());
		System.out.println();
		printRange(first, last);
		input.close();
	}

	private static void printRange(int start, int finish) {
		for (int i = start; i <= finish; i++) {
			System.out.print(i + " ");
		}
	}
}
