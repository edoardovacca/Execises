import java.util.Scanner;

public class RegexSize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		String givenText = input.nextLine();
		if (givenText.matches("XXS|XS|S|M|L|XL|XXL")== false) {
			System.out.println("Invalid size");
		} else {
			System.out.println("Size ok");
		}
		input.close();
	}

}
