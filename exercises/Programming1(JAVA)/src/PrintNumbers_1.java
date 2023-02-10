import java.util.Scanner;

public class PrintNumbers_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the middle number: ");
		int middle = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= middle; i++) {
			System.out.print(i + " ");
		}

		for (int l = middle - 1; l >= 1; l--) {
			System.out.print(l + " ");
		}
		input.close();
	}

}
