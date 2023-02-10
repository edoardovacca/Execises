import java.util.Scanner;

public class SoftDrinks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = Integer.parseInt(input.nextLine());
		System.out.print("Enter the number of bottles: ");
		int bottles = Integer.parseInt(input.next());
		System.out.println("\nThere will be " + bottles / students + " bottles for each student.");
		System.out.println("There will be " + bottles % students + " leftover bottles.");
		input.close();
	}

}
