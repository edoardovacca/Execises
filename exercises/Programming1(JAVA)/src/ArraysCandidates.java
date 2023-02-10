import java.util.Scanner;

public class ArraysCandidates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of candidates: ");
		int length = Integer.parseInt(input.nextLine());
		String[] names = new String[length];
		int[] votes = new int[length];
		// this prints the request for input
		// and populate the array for the given number of candidates
		for (int i = 0; i < length; i++) {
			System.out.print("Enter name: ");
			names[i] = input.nextLine();
			System.out.print("Enter " + names[i] + "'s votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}
		// this is to get who has the most votes
		int longest = votes[0];
		int longestIndex = 0;
		int winnersNumber = 0;
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > longest) {
				longest = votes[i];
				longestIndex = i;
			}
		}
		// this is to check if there are multiple winners
		// (if count == 1 then there's only one winner)
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] == longest) {
				winnersNumber++;
			}
		}
		System.out.println();
		if (winnersNumber > 1) {
			// multiple winners
			System.out.println("It is a tie!");
			for (int i = 0; i < votes.length; i++) {
				if (longest == votes[i]) {
					System.out.println(names[i] + " (" + votes[i] + " votes)");
				}
			}
		} else {
			// one winner
			System.out.println(names[longestIndex] + " is the winner with " + votes[longestIndex] + " votes!");
		}
		input.close();
	}
}
