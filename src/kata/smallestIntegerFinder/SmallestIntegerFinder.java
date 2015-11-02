package kata.smallestIntegerFinder;

public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {
		int min = args[0];
		for (int number : args) {
			if (number < min) {
				min = number;
			}
		}
		return min;
	}
}
