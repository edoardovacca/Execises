import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter text: ");
			int max = Integer.parseInt(input.nextLine());

			for (int i = 1; i <= max; i++) {
				System.out.println(i);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
