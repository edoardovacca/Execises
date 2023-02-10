import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student number: ");
		//matches("[first number]{length}")
		if (input.nextLine().matches("2[0-9]{7}") == false) {
			System.out.println("Invalid student number");
		} else {
			System.out.println("OK");
		}
		input.close();
	}
}
