package kata.divSeven;

public class DivSeven {
	public static long[] seven(long m) {
		return subMethod(m, 0);
	}
	
	private static long[] subMethod(long m, long count) {
		if (m < 100) {
			return new long[]{m, count};
		}
		long a = m/10;
		long b = m%10;
		long x = a - b*2;
		return subMethod(x, ++count);
	}
}
