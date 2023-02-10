
public class MethodExample {

	public static void main(String[] args) {

		double x = 1.5;
		double y = 2.3;

		// method that doesn't want arguments
		printHello();

		// method that wants arguments
		printSum(x, y);

		// method that will return something with the return command
		// java doesn't find the method computeSum because it is present in another
		// class
		// so you need to add the name of the class.method(parameters)

		// old version with the method in this very class:
		// double z = computeSum(x, y);

		// new version from the Utilities.java class
		// (KEEP IN MIND THAT HERE THE METHOD
		// IS PRIVATE, THERE YOU NEED TO CHANGE IT TO PUBLIC:
		double z = Utilities.computeSum(x, y);
		System.out.println(z);
	}

	private static void printHello() {
		System.out.println("Hello");
	}

	private static void printSum(double a, double b) {
		System.out.println(a + b);
	}

	/*
	 * // a method that gives a return value dosn't want void but the data type the
	 * // method will return, in this case type double private static double
	 * computeSum(double a, double b) { return a + b; }
	 */
}
