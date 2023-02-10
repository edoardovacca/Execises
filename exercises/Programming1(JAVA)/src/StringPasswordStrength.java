import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String givenUsername = input.nextLine();
		System.out.print("Enter password: ");
		String givenPassword = input.nextLine();

		if (checkStrength(givenUsername, givenPassword) == true) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		input.close();
	}

	// The password validation rules are the following:
	// • A password should be at least nine characters long.
	// • A password should not include the username
	private static boolean checkStrength(String username, String password) {
		username = username.toUpperCase();
		password = password.toUpperCase();
		if (password.length() < 9) {
			return false;
		} else if (password.matches(username) == false) {
			return false;
		}
		return true;
	}
}
