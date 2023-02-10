import java.util.Scanner;

public class StringUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter given name: ");
		String givenName = input.nextLine();
		System.out.print("Enter surname: ");
		String givenSurname = input.nextLine();
		if (createUsername(givenName, givenSurname) == null) {
			System.out.println("Not enough letters to create a username!");
		} else {
			System.out.println(createUsername(givenName, givenSurname));
		}
		input.close();
	}

	// username is last three letters of surname and first two from name
	//all lower case
	private static String createUsername(String name, String surname) {
		if (name.length() < 3 || surname.length() < 3) {
			return null;
		} else {
			// Extract a substring
			// String substring(int index, int numberOfCharacters)
			String firstPart = surname.substring((surname.length() - 3));
			String secondPart = name.substring(0, 2);
			return (firstPart + secondPart).toLowerCase();
		}
	}
}
