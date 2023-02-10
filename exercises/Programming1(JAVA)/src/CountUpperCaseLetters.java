
public class CountUpperCaseLetters {

	public static void main(String[] args) {
		String myString = "XXXVersion 1.0A";
		int count = 0;

		for (int i = 0; i < myString.length(); i++) {
			// my.String.chatAt(i) accesses a single character in a string
			//isUppercase() checks if the character is an upper  case letter
			if (Character.isUpperCase(myString.charAt(i))) {
				count++;
			}
		}

		System.out.println(count + " uppercase letter(s).");
	}

}
