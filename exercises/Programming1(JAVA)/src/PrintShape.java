import java.util.Scanner;

public class PrintShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = "";
		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());
		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		System.out.println();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				text += "*";
			}
			System.out.print(text);
			System.out.println();
			text = "";
		}
		input.close();

	}

}
