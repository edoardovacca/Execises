
public class MethodsTools {
	public static int minimum(int first, int second, int third) {
		if (first < second && first < third) {
			return first;
		} else if (second < first && second < third) {
			return second;
		} else {
			return third;
		}
	}

	}


