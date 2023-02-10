import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int givenYear = Integer.parseInt(input.nextLine());
		System.out.print("Enter month: ");
		int givenMonth = Integer.parseInt(input.nextLine());
		System.out.println();
		printCalendar(givenMonth, givenYear);
		input.close();
	}
	
	private static void printCalendar(int monthNumber, int yearNumeber) {
		String[] months = {"Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu",
				"Kesäkuu", "Heinäkuu", "Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu"};
		
		
		LocalDate myDate = LocalDate.of(yearNumeber, monthNumber, 1);
		//this gives you the length of the month in days
		int daysInMonth = myDate.lengthOfMonth();
		
		//this gives you the day of the week where 1 is Monday
		int dayOfWeek = myDate.getDayOfWeek().getValue();
		
		System.out.println("> " + months[monthNumber - 1] + " <");
		System.out.printf("%3s", "Ma Ti Ke To Pe La Su ");
		System.out.println();
		
		for (int i = 1; i <= 7; i++) {
			if (i >= dayOfWeek) {
				System.out.printf("%3d", i);
			} else {
				System.out.printf("%3s" + " ");
			}
		}
		System.out.println(daysInMonth);
		
		
	}

}
