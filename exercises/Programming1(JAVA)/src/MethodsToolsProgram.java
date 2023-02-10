
import java.util.Scanner;

public class MethodsToolsProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int first = Integer.parseInt(input.nextLine());
		System.out.print("Enter second integer: ");
		int second = Integer.parseInt(input.nextLine());
		System.out.print("Enter third integer: ");
		int third = Integer.parseInt(input.nextLine());
		System.out.println();
		System.out.println("The minimum value is " + MethodsTools.minimum(first, second, third));
		input.close();
	}

}
