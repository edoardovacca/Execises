import java.util.Scanner;

public class RegexPlateNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter plate number: ");
		String givenPlate = input.nextLine();
		// WATCH OUT, it's the second time you make a typo!
		// always check if it's []{} and not something like []{)
		if (givenPlate.matches("[A-Z]{3}-[0-9]{3}") == false) {
			System.out.print("Invalid plate number");
		} else {
			System.out.println("OK");
		}
		input.close();
	}

}