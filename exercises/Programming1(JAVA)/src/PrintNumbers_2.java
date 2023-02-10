import java.util.Scanner;

public class PrintNumbers_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the middle number: ");
		int middle = Integer.parseInt(input.nextLine());
		int count = 0;

		for (int i = 1; i <= middle; i++) {
			System.out.print(i + " ");
			count++;
		}

		if (count == 1) {
			System.out.println();
			System.out.println(count + " number printed");
		} else {

			for (int j = middle - 1; j >= 1; j--) {
				System.out.print(j + " ");
				count++;
				if (j == 1) {
					System.out.println();
				}
			}

			System.out.println(count + " numbers printed");
		}
		input.close();
	}

}
