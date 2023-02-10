import java.util.Scanner;

public class MethodsPrimality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int givenNumber = Integer.parseInt(input.nextLine());

		// per il numero dato chiedi da uno a lui quali sono i numeri NON dispari e li
		// stampi
		// se non ci sono numeri non primi --> nothing to be printed
		if (givenNumber <= 3) {
			System.out.println("Nothing to be printed");
		}
		for (int i = 1; i < givenNumber; i++) {
			if (isPrime(i) == false) {
				System.out.println(i);

			}

		}
		input.close();

	}

	private static boolean isPrime(int positive) {
		// per il numero dato (index del for loop) controlli se sia primo o meno
		if (positive <= 1) {
			return false;
		}
		// parti da due perchè è il primo numero primo
		// finisci a positive / 2 perchè non ci sono divisori 
		//più grossi di un numero diviso due
		for (int i = 2; i <= positive / 2; i++) {
			if ((positive % i) == 0)
				return false;
		}
		return true;
	}

}
