import java.util.Arrays;

public class ArraysLibrary {
	// the class should have the following methods:
	// max, min, median, mean, and standardDeviation.
	// Each method should take an array of integers as parameter
	// and return the appropriate result.

	public static int max(int[] numberArray) {
		int longest = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > longest) {
				longest = numberArray[i];
			}
		}
		return longest;
	}

	public static int min(int[] numberArray) {
		int shortest = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < shortest) {
				shortest = numberArray[i];
			}
		}
		return shortest;
	}

	public static double median(int[] numberArray) {
		// The median is the central number of a data set. Arrange data points from
		// smallest to largest and locate the central number. This is the median. If
		// there are 2 numbers in the middle, the median is the average of those 2
		// numbers.

		// create a new copy of the given array because otherwise sorting it will mess
		// with the order even in the other program(ArraysDeviation)
		int[] copiedArray = Arrays.copyOf(numberArray, numberArray.length);
		Arrays.sort(copiedArray);
		if (copiedArray.length % 2 == 0) {
			int meanIndex = copiedArray.length / 2;
			return ((copiedArray[meanIndex] + copiedArray[meanIndex - 1]) * 1.0) / 2;
		} else {
			return copiedArray[copiedArray.length / 2] * 1.0;
		}
	}

	public static double mean(int[] numberArray) {
		int sum = 0;
		for (int i = 0; i < numberArray.length; i++) {
			sum += numberArray[i];
		}
		return (sum * 1.0) / numberArray.length;
	}

	public static double standardDeviation(int[] numberArray) {
		double meanValue = mean(numberArray);
		double sum = 0.0;
		for (int i = 0; i < numberArray.length; i++) {
			double firstPart = numberArray[i] - meanValue;
			firstPart = firstPart * firstPart;
			sum += firstPart;
		}
		double standardDeviation = sum / (numberArray.length - 1);
		standardDeviation = Math.sqrt(standardDeviation);
		return standardDeviation;
	}
}
