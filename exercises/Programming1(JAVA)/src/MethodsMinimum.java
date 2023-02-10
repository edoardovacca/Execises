import java.util.Scanner;

public class MethodsMinimum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int first = Integer.parseInt(input.nextLine());
		System.out.print("Enter second integer: ");
		int second = Integer.parseInt(input.nextLine());
		System.out.print("Enter third integer: ");
		int third = Integer.parseInt(input.nextLine());
		System.out.println();
		System.out.println("The minimum value is " + minimum(first, second, third));
		input.close();
	}

	private static int minimum(int first, int second, int third) {
		if (first < second && first < third) {
			return first;
		} else if (second < first && second < third) {
			return second;
		} else {
			return third;
		}
	}

}
