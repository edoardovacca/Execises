
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIteration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int[] newArray = new int[5];

		for (int i = 0; i < newArray.length; i++) {
			System.out.print("Enter an integer: ");
			newArray[i] = Integer.parseInt(input.nextLine());
		}
		Arrays.sort(newArray);
		System.out.println();
		
		for (int i = newArray.length - 1; i >= 0; i--) {
			System.out.print(newArray[i] + " ");
		}
		input.close();
	}

}
