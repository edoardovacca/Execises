import java.util.Arrays;
import java.util.Scanner;

public class ArraysCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of city names: ");
		int givenNumber = Integer.parseInt(input.nextLine());
		String[] cities = new String[givenNumber];
		// get the correct number of city names
		for (int i = 0; i < cities.length; i++) {
			System.out.print("Enter city name: ");
			cities[i] = input.nextLine();
		}
		//sort alphabetically then print cities with different names
		Arrays.sort(cities);
		String cityName = cities[0];
		System.out.println();
		System.out.print(cityName + " ");
		for (int i = 0; i < cities.length; i++) {
			if (!cities[i].equals(cityName)) {
				cityName = cities[i];
				System.out.print(cityName + " ");
			}
		}
		input.close();
	}

}
