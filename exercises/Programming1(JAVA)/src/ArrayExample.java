import java.util.Arrays; // The Arrays class will be used for sorting an array
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare array
		String[] countryArray = new String[3];
		//populate the array, this way by asking the user as many times as the array length
		for (int i = 0; i < countryArray.length; i++) {
			System.out.print("Enter country name: ");
			countryArray[i] = input.nextLine();
		}
		//there a class called Arrays
		//sort is one the methods in this class
		//sort sorts the elements in the array
		Arrays.sort(countryArray);
		for (int i = 0; i < countryArray.length; i++) {
			System.out.println(countryArray[i]);
		}
		input.close();
	}
}