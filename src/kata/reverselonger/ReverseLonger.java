package kata.reverselonger;

public class ReverseLonger {
	public static String shorterReverseLonger (String a, String b) {
		if (a.length() < b.length()) {
			return new StringBuilder().append(a).append(reverse(b)).append(a).toString(); 
		}
		return new StringBuilder().append(b).append(reverse(a)).append(b).toString();
	}
	
	private static String reverse (String string) {
		return new StringBuilder(string).reverse().toString();
	}
}
