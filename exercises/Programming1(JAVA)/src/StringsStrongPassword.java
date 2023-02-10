import java.util.Scanner;

public class StringsStrongPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password: ");
		String givenText = input.nextLine();
		if (checkStrength(givenText) == true) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}
		input.close();

	}

	private static boolean checkStrength(String password) {
		int count = 0;
		// it has at least 8 characters
		// length() < 8

		// it includes characters from at least three of the four following categories:
		// upper case letters, lower case letters, digits, and other characters
		// [A-ZÅÄÖ], [a-zåäö], \d, \W

		// se no prova a farlo con 4 if statement and a counter followed by a check (if
		// count >=3 then return true)
		// \\.[A-Z]{1,}\\. e così via per gli altri

		// così non va perchè me lo conta una volta sola
		// bisogna fare 4 if statement ripetuti ma distinti,

		// checks length
		if (password.length() < 8) {
			return false;
		}
		// checks if upper case letters are present
		if (password.matches(".{0,}[A-ZÅÄÖ]{1,}.{0,}") == true) {
			count++;
		}
		// checks if lower case letters are present
		if (password.matches(".{0,}[a-zåäö]{1,}.{0,}") == true) {
			count++;
		}
		// checks if digits are present (can also use \\d)
		if (password.matches(".{0,}[0-9]{1,}.{0,}") == true) {
			count++;
		}
		// checks if other characters are present (\W DOES NOT include underscore!!)
		//STILL SOMETHING WRONG HERE
		if (password.matches(".{0,}[\\W_]{1,}.{0,}") == true) {
			count++;
		}
		if (count >= 3) {
			return true;
		} else {
			return false;
		}
	}
}